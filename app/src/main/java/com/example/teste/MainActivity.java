package com.example.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Ementa ementa;
    EditText a2;
    EditText a1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ementa = new Ementa("ementa");
        a1 = findViewById(R.id.a1);
        a2 = findViewById(R.id.a2);

    }
    public void click_adicionar_prato(View v) {
        if(a2.getText().equals(null)) {
            ementa.inserir_prato(new Prato(a1.getText().toString()));
        }
        else {
            ementa.inserir_prato(new Prato(a1.getText().toString(), Double.parseDouble(a2.getText().toString())));
        }
    }
    public void click_quantidade_pratos(View v) {
        Toast.makeText(getApplicationContext(),""+ementa.quantidadePratos(), Toast.LENGTH_SHORT).show();
    }
    public void click_maior_quantidade_ingredientes(View v) {
        Toast.makeText(getApplicationContext(),""+ementa.maior_prato().toString(),Toast.LENGTH_SHORT).show();
    }
    public void click_maior_dificuldade_ingredientes(View v) {
        Toast.makeText(getApplicationContext(),""+ementa.maior_prato().toString(),Toast.LENGTH_SHORT).show();
    }
    public void click_list(View v) {
        Intent mainActivity = new Intent(getApplicationContext(), MainActivity2.class);
        startActivity(mainActivity);
    }
}