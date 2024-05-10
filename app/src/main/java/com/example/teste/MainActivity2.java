package com.example.teste;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity2 extends AppCompatActivity {

    ListView lv1;
    Ementa ementa = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        lv1 = findViewById(R.id.lv1);

        String [] pratos = new String[ementa.quantidadePratos()];
        for (int num = 0; ementa.quantidadePratos() > num; num++) {
            pratos[num] = ementa.getPratos().get(num).toString();

            ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.activity_main2, pratos);
            lv1.setAdapter(adapter);
        }

    }

}