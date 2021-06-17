package com.openbanking.view.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.openbanking.R;
import com.openbanking.model.bradesco.dependencias.Branch;
import com.openbanking.view.interfaces.DependenciaOnClick;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private List<Branch> branchList;
    private DependenciaOnClick listener;
    private Context context;

    public RecyclerViewAdapter (List<Branch> branchList, DependenciaOnClick listener, Context context){
        this.context = context;
        this.branchList = branchList;
        this.listener = listener;
        Log.i("LOG", "Tamanho da lista dentro do RecyclerView: " + branchList.size());
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycler, parent, false);
        Log.i("LOG", "Tamanho da lista dentro do onCreateViewHolder: " + branchList.size());
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Branch branch = branchList.get(position);

        holder.onBind(branch);
        Log.i("LOG", "tamanho da lista dentro do onBindViewHolder: " + branchList.size());
        holder.itemView.setOnClickListener(v -> listener.click(branch));
    }

    @Override
    public int getItemCount() {
        //Log.i("LOG", "tamanho da lista dentro do getItemCount(): " + branchList.size());
        return branchList.size();
    }

    public void atualizarLista(List<Branch> novaLista){

        if (this.branchList.isEmpty()){
            this.branchList = novaLista;
            Log.i("LOG", "tamanho da lista dentro do atualizarLista: " + branchList.size());
        }else {
            this.branchList.addAll(novaLista);
            Log.i("LOG", "tamanho da lista dentro do atualizarLista2: " + branchList.size());
        }
        notifyDataSetChanged();
    }

    public void clear(){
        this.branchList.clear();
        notifyDataSetChanged();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView textViewNome;
        private TextView textViewEndereco;

        public ViewHolder(@NonNull View itemView){
            super(itemView);

            textViewNome = itemView.findViewById(R.id.nomeItem);
            textViewEndereco = itemView.findViewById(R.id.enderecoItem);
        }

        public void onBind(Branch branch) {

            textViewNome.setText(branch.getIdentification().getName());
            textViewEndereco.setText(branch.getPostalAddress().getAddress());

        }
    }

}
