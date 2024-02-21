package com.example.cardview2024.model;

import android.widget.Button;
import android.widget.ImageView;

public class Produtos {
    private String titulo;
    private String descricao;
    private int imagemProduto;
    private String price;
    private Button btnAdd;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getImagemProduto() {
        return imagemProduto;
    }

    public void setImagemProduto(int imagemProduto) {
        this.imagemProduto = imagemProduto;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Button getBtnAdd() {
        return btnAdd;
    }

    public void setBtnAdd(Button btnAdd) {
        this.btnAdd = btnAdd;
    }

    public Produtos(String titulo, String descricao, int imagemProduto, String price, Button btnAdd) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.imagemProduto = imagemProduto;
        this.price = price;
        this.btnAdd = btnAdd;
    }

    public Produtos() {
    }
}
