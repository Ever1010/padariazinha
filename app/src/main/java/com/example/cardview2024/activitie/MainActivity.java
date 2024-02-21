package com.example.cardview2024.activitie;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;

import com.example.cardview2024.R;
import com.example.cardview2024.adapter.ProdutoAdapter;
import com.example.cardview2024.model.Produtos;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerViewProdutos;
    private List<Produtos> produtos = new ArrayList<>();
    private Button btnAdd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerViewProdutos=findViewById(R.id.recyclerProdutos);
        //layout
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerViewProdutos.setLayoutManager(layoutManager);

        //adapter
        this.prepararProdutos();

        ProdutoAdapter adapter = new ProdutoAdapter(produtos);
        recyclerViewProdutos.setAdapter(adapter);
    }
    public void prepararProdutos(){
        Produtos

        p = new Produtos("Hamburguer","Este produto segue as nprmas de qualidade",R.drawable.lancheburguer,"34.45",btnAdd);
        this.produtos.add(p);

        p = new Produtos("X-Salada","Este produto segue as nprmas de qualidade",R.drawable.lanchesalada,"34.45",btnAdd);
        this.produtos.add(p);

        p = new Produtos("X-Tudo","Este produto segue as nprmas de qualidade",R.drawable.lancheduplo,"34.45",btnAdd);
        this.produtos.add(p);

        p = new Produtos("X-Bacon","Este produto segue as nprmas de qualidade",R.drawable.lanchebacon,"34.45",btnAdd);
        this.produtos.add(p);

        p = new Produtos("X-Provolone","Este produto segue as nprmas de qualidade",R.drawable.lancheprovolone,"34.45",btnAdd);
        this.produtos.add(p);

        p = new Produtos("Misto Quente","Este produto segue as nprmas de qualidade",R.drawable.lanchemisto,"34.45",btnAdd);
        this.produtos.add(p);

        p = new Produtos("Titulo do Produto","Este produto segue as nprmas de qualidade",R.drawable.lanchebauru,"34.45",btnAdd);
        this.produtos.add(p);




    }
}