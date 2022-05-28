package br.com.gabriel.controllers;

import android.content.ContentValues;
import android.content.Context;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import br.com.gabriel.api.AppUtils;
import br.com.gabriel.datasource.AppDataBase;
import br.com.gabriel.models.Client;

public class ClienteController extends AppDataBase implements ICrud<Client> {

    ContentValues dadosDoClient;
    public ClienteController(Context context) {
        super(context);

        Log.d(AppUtils.TAG,"ClienteController: Conectado");
    }

    @Override
    public boolean incluir(Client client) {
        dadosDoClient = new ContentValues();
        dadosDoClient.put("nome", client.getNome());
        dadosDoClient.put("email", client.getEmail());
        return insert("cliente", dadosDoClient);
    }

    @Override
    public boolean alterar(Client client) {
        dadosDoClient.put("id", client.getId());
        dadosDoClient.put("nome", client.getNome());
        dadosDoClient.put("email", client.getEmail());
        return false;
    }

    @Override
    public boolean Deletar(Client client) {
        dadosDoClient.put("id", client.getId());
        return false;
    }

    @Override
    public List<Client> listar(Client client) {
        List<Client> clients =  new ArrayList<>();

        return  clients;

    }
}
