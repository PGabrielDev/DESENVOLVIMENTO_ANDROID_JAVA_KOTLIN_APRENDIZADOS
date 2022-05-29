package br.com.gabriel.views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import br.com.gabriel.R;
import br.com.gabriel.api.AppUtils;
import br.com.gabriel.controllers.ClienteController;
import br.com.gabriel.controllers.ProductController;
import br.com.gabriel.models.Client;

public class MainActivity extends AppCompatActivity {

    ClienteController clienteController;
    ProductController  productController;
    Client client;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(AppUtils.TAG, "onCreate: App minha Idea...");
        clienteController = new ClienteController(getApplicationContext());
        productController = new ProductController(getApplicationContext());
//        client = new Client("Gabriel", "gabrielgatomimado@hotmail.com");
//        if(clienteController.incluir(client)){
//            Toast.makeText(MainActivity.this, "cliente " + client.getNome() + " Incluido com sucesso...",
//                    Toast.LENGTH_SHORT).show();
//        }else {
//            Toast.makeText(MainActivity.this, "cliente " + client.getNome() + " Não Incluido com sucesso...",
//                    Toast.LENGTH_SHORT).show();
//        }
        if(clienteController.Deletar(1)){
            Toast.makeText(MainActivity.this, "cliente de id: " + 1 + " Incluido com sucesso...",
            Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(MainActivity.this, "cliente " + 1 + " Não Incluido com sucesso...",
            Toast.LENGTH_SHORT).show();
        }

    }
}