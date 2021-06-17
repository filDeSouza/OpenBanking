package com.openbanking.repository;

import com.openbanking.model.bradesco.dependencias.BradescoDependenciasResult;

import io.reactivex.Observable;

import static com.openbanking.data.remote.RetrofitService.getApiService;

public class OpenBankRepository {

    public Observable <BradescoDependenciasResult> getDependenciasBradesco(int pagina, int tamanhoPagina){
        return getApiService().getAllDependencias(pagina, tamanhoPagina);
    }

    public Observable<BradescoDependenciasResult> getDependenciasFiltro(int pagina, int tamanhoPagina){
        return getApiService().getAllDependencias(pagina, tamanhoPagina);
    }

}
