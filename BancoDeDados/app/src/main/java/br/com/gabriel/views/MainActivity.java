package br.com.gabriel.views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import br.com.gabriel.R;
import br.com.gabriel.api.AppUtils;
import br.com.gabriel.controllers.ClienteController;

public class MainActivity extends AppCompatActivity {

    ClienteController clienteController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(AppUtils.TAG, "onCreate: App minha Idea...");
        clienteController = new ClienteController(getApplicationContext());

    }
}