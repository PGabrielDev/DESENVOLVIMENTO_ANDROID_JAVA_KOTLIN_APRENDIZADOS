package br.com.gabriel.controllers;

import android.content.ContentValues;
import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import br.com.gabriel.datasource.AppDataBase;
import br.com.gabriel.models.Product;

public class ProductController extends AppDataBase implements ICrud<Product>  {

    ContentValues dadosDoproduct;

    public ProductController(Context context) {
        super(context);
    }

    @Override
    public boolean incluir(Product product) {
        dadosDoproduct.put("nome", product.getNome());
        dadosDoproduct.put("fornecedor", product.getFornecedor());
        return  false;
    }

    @Override
    public boolean alterar(Product product) {
        dadosDoproduct.put("id", product.getId());
        dadosDoproduct.put("nome", product.getNome());
        dadosDoproduct.put("fornecedor", product.getFornecedor());
        return  false;
    }

    @Override
    public boolean Deletar(Product product) {
        dadosDoproduct.put("id", product.getId());
        return  false;
    }

    @Override
    public List<Product> listar(Product product) {
        List<Product> products = new ArrayList<>();
        return products;
    }
}
