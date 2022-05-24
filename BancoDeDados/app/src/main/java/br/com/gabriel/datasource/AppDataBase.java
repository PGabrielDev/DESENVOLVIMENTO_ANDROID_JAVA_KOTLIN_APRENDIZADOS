package br.com.gabriel.datasource;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

import br.com.gabriel.api.AppUtils;

public class AppDataBase extends SQLiteOpenHelper {

    public static final String DB_NAME="App_MinhaIdea.sqlite";
    public static final int DB_VERSION=1;

    public AppDataBase(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
        Log.d(AppUtils.TAG, "AppDataBase: Criando Banco de dados");
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
