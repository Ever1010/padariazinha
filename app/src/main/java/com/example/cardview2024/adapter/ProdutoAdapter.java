package com.example.cardview2024.adapter;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cardview2024.R;
import com.example.cardview2024.model.Produtos;

import java.util.List;

public class ProdutoAdapter extends RecyclerView.Adapter <ProdutoAdapter.MyViewHolder> {
private List<Produtos>produtos;
    public ProdutoAdapter(List<Produtos>listProdutos) {
        this.produtos=listProdutos;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.produtodetalhe, parent, false);
                return new MyViewHolder(itemLista);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {


        Produtos produtos1=produtos.get(position);

        holder.imagemProduto.setImageResource(produtos1.getImagemProduto());
        holder.titulo.setText(produtos1.getTitulo());
        holder.descricao.setText(produtos1.getDescricao());
        holder.price.setText(produtos1.getPrice());
       // holder.btnAdd.findViewById(R.id.btnAdd);
    }

    @Override
    public int getItemCount() {
        return produtos.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{


        private ImageView imagemProduto;

        private Button btnAdd;
        private TextView titulo;
        private TextView descricao;
        private TextView price;

        @SuppressLint("WrongViewCast")
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            titulo = itemView.findViewById(R.id.textViewTitulo);
            imagemProduto = itemView.findViewById(R.id.imagemFotoProduto);
            descricao = itemView.findViewById(R.id.textViewDescricao);
            price = itemView.findViewById(R.id.textViewPrice);
            btnAdd = itemView.findViewById(R.id.btnAdd);
        }
    }
}
