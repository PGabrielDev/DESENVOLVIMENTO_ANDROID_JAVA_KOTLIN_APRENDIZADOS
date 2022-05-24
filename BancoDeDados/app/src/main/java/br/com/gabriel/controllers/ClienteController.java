package br.com.gabriel.controllers;

import android.content.Context;
import android.util.Log;

import java.util.List;

import br.com.gabriel.api.AppUtils;
import br.com.gabriel.datasource.AppDataBase;
import br.com.gabriel.models.Client;

public class ClienteController extends AppDataBase implements ICrud<Client> {


    public ClienteController(Context context) {
        super(context);

        Log.d(AppUtils.TAG,"ClienteController: Conectado");
    }

    @Override
    public void incluir(Client client) {

    }

    @Override
    public void alterar(Client client) {

    }

    @Override
    public void Deletar(Client client) {

    }

    @Override
    public List<Client> listar(Client client) {
        return null;
    }
}
