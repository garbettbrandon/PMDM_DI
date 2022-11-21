package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;

public class AdapterChat extends RecyclerView.Adapter<AdapterChat.ViewHolder> {

    private ArrayList<MainChat> datos;

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private final TextView contacto;
        private final TextView mensaje;

        public ViewHolder(View view) {
            super(view);
            contacto = (TextView) view.findViewById(R.id.contacto);
            mensaje = (TextView) view.findViewById(R.id.mensaje);
        }
        public TextView getTextContacto() {
            return contacto;
        }
        public TextView getTextMensaje() {
            return mensaje;
        }
    }

    public AdapterChat(MainChat[] generateContactos) {
        datos = new ArrayList<MainChat>();
        add(generateContactos);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.activity_main, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {
        viewHolder.getTextContacto().setText(datos.get(position).nombre);
        viewHolder.getTextMensaje().setText(datos.get(position).mensaje);
    }

    @Override
    public int getItemCount() {
        return datos.size();
    }

    public void add(MainChat[] dataSet){
        datos.addAll(Arrays.asList(dataSet));
        notifyDataSetChanged();
    }

}
