package com.openbanking.view.viewmodel;

import android.app.Application;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.openbanking.model.bradesco.dependencias.Branch;
import com.openbanking.model.bradesco.dependencias.Company;
import com.openbanking.repository.OpenBankRepository;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;

public class BranchViewModel extends AndroidViewModel {

    private MutableLiveData<List<Branch>> listaBranch = new MutableLiveData<>();
    private MutableLiveData<Boolean> loading = new MutableLiveData<>();
    private CompositeDisposable disposable = new CompositeDisposable();
    private OpenBankRepository repository = new OpenBankRepository();

    public BranchViewModel(@NonNull Application application) {
        super(application);
    }

    public LiveData<List<Branch>> getListaDependencias() {
        return  this.listaBranch;
    }

    public LiveData<Boolean> getLoading(){
        return this.loading;
    }

    public void getAllDependencias(int pagina){
        disposable.add(
                repository.getDependenciasBradesco(1, 10)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .doOnSubscribe(disposable1 -> loading.setValue(true))
                .doOnTerminate(() -> loading.setValue(false))
                .subscribe(response -> {

                    listaBranch.setValue(response.getData().getBrand().getCompanies().get(0).getBranches());

                }, throwable -> {
                    Log.i("LOG", "Error: " + throwable.getMessage());
                })
        );
    }

    public void getAllBranchs(String texto, int pagina){
        disposable.add(
                repository.getDependenciasFiltro(pagina, 1000)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .doOnSubscribe(disposable1 -> loading.setValue(true))
                .doOnTerminate(() -> loading.setValue(false))
                .subscribe(response -> {

                    List<Branch> listaFiltrada = new ArrayList<>();
                    for (Branch result: response.getData().getBrand().getCompanies().get(0).getBranches()) {
                        String _name = result.getPostalAddress().getDistrictName();
                        Log.i("LOG", "Nome: " + result.getPostalAddress().getTownName());
                        String _texto = texto.toLowerCase();
                        if (_name.contains(_texto)) {
                            listaFiltrada.add(result);
                        }
                        _name = result.getPostalAddress().getTownName().toLowerCase();
                        if (_name.contains(_texto)) {
                            listaFiltrada.add(result);
                        }
                    }
                        listaBranch.setValue(listaFiltrada);

                    }, throwable -> {
                        Log.i("LOG", "Erro na execução: " + throwable.getLocalizedMessage());
                    })

        );}

}
