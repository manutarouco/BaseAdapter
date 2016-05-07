package com.example.a180801394.baseadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by 180801394 on 07/05/2016.
 */
public class ContatoAdapter extends BaseAdapter{
    private List<Contato> listaContatos;
    private Context contexto;

    public ContatoAdapter(Context contexto, List<Contato> listaContatos){
        this.contexto = contexto;
        this.listaContatos = listaContatos;
    }


    @Override
    public int getCount() {
        return listaContatos.size();
    }

    @Override
    public Object getItem(int position) {
        return listaContatos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        Contato contato = listaContatos.get(position);

        LayoutInflater inflater = (LayoutInflater)contexto.getSystemService
                (contexto.LAYOUT_INFLATER_SERVICE);

        View viewInflate = inflater.inflate(R.layout.list_item, null);
        TextView textNome = (TextView) viewInflate.findViewById(R.id.idNome);
        textNome.setText(contato.getNome());

        TextView textFone = (TextView) viewInflate.findViewById(R.id.idTelefone);
        textFone.setText(contato.getTelefone());

        return viewInflate;
    }
}
