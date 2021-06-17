package com.openbanking.view.activity.bradesco;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.SearchView;

import com.openbanking.R;
import com.openbanking.model.bradesco.dependencias.Branch;
import com.openbanking.view.adapter.RecyclerViewAdapter;
import com.openbanking.view.interfaces.DependenciaOnClick;
import com.openbanking.view.viewmodel.BranchViewModel;

import java.util.ArrayList;
import java.util.List;

public class DependenciasActivity extends AppCompatActivity implements DependenciaOnClick {

    private RecyclerView recyclerView;
    private ProgressBar progressBar;
    private RecyclerViewAdapter adapter;
    private List<Branch> listaBranch = new ArrayList<>();
    private BranchViewModel viewModel;
    private SearchView searchView;
    private String bandName;
    private int pagina = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dependencias);

        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        initViews();

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 1));
        setScrollView();

        viewModel.getAllDependencias(pagina);

        viewModel.getListaDependencias().observe(this, resultadoLista -> {
            adapter.atualizarLista(resultadoLista);
            Log.i("LOG", "resultado do adapter: " + resultadoLista.get(0).getPostalAddress().getTownName());
        });

        viewModel.getLoading().observe(this, loading -> {
            if (loading){
                progressBar.setVisibility(View.VISIBLE);
            }else {
                progressBar.setVisibility(View.GONE);
            }
        });

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String text) {
                bandName = text;
                adapter.clear();
                do {
                    viewModel.getAllBranchs(bandName, pagina);
                    pagina++;
                }while (pagina < 15);
                pagina = 1;
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                if (newText.length() > 2){
                    bandName = newText;
                    adapter.clear();
                    do {
                        viewModel.getAllBranchs(bandName, pagina);
                        pagina++;
                    }while (pagina < 15);
                }else if (newText.length() < 2){
                    pagina = 1;
                }
                pagina = 1;
                return false;
            }




        });

    }

    private void initViews() {

        recyclerView = findViewById(R.id.recyclerView);
        progressBar = findViewById(R.id.progress_bar);
        adapter = new RecyclerViewAdapter(listaBranch, this, this);
        viewModel = ViewModelProviders.of(this).get(BranchViewModel.class);
        searchView = findViewById(R.id.searchView);

    }

    @Override
    public void click(Branch branch) {

    }

    private void setScrollView(){

        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
            }

            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);

                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();

                int totalItemCount = gridLayoutManager.getItemCount();

                int lastVisible = gridLayoutManager.findLastVisibleItemPosition();

                boolean ultimoItem = lastVisible + 5 >= totalItemCount;

                if (totalItemCount > 0 && ultimoItem) {
                    pagina = pagina + 1;
                    Log.i("LOG", "valor da pagina dentro da soma " + pagina);
                    viewModel.getAllDependencias(pagina);
                }

            }

        });

    }

}