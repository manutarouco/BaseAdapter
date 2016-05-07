package com.example.a180801394.baseadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Contato> listaContatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listaContatos = new ArrayList<>();
        listaContatos.add(new Contato("Fulano","(51)99999999"));
        listaContatos.add(new Contato("Sicrano","(51)88888888"));
        listaContatos.add(new Contato("Beltrano","(51)77777777"));

        updateLista();
    }

    private void updateLista() {
        ContatoAdapter adapter = new ContatoAdapter(this, listaContatos);

        ListView lista = (ListView) findViewById(R.id.listView);
        lista.setAdapter(adapter);

    }

}
