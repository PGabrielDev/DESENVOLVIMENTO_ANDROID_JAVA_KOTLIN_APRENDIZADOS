package br.com.gabriel.datasource;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

import br.com.gabriel.api.AppUtils;
import br.com.gabriel.datamodel.ClienteDataModel;
import br.com.gabriel.datamodel.ProductDataModel;

public class AppDataBase extends SQLiteOpenHelper {

    public static final String DB_NAME="App_MinhaIdea.sqlite";
    public static final int DB_VERSION=1;
    SQLiteDatabase db;
    public AppDataBase(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
        Log.d(AppUtils.TAG, "AppDataBase: Criando Banco de dados");
        db = getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.d(AppUtils.TAG, "AppDataBase: Tentando criar tabela de Cliente");
        db.execSQL(ClienteDataModel.createTable());
        Log.d(AppUtils.TAG, "AppDataBase: Tabela de Cliente Criada");
        Log.d(AppUtils.TAG, "AppDataBase: Tentando criar tabela de Produto");
        db.execSQL(ProductDataModel.createTable());
        Log.d(AppUtils.TAG, "AppDataBase: Tabela de Produto Criada");



    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public boolean insert(String tabela, ContentValues dados){
        db = getWritableDatabase();
        Boolean flSucesso = false;
        try {
           flSucesso =  db.insert(tabela,null,dados) > 0;
        }catch (Exception ex){
            Log.d(AppUtils.TAG, "Insert: error -> " + ex.getMessage());

        }
        return flSucesso;
    }
}
