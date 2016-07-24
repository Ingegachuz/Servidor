package com.ingegachuz.mascotas;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.ingegachuz.mascotas.adapter.MascotaAdaptador;
import com.ingegachuz.mascotas.pojo.Mascota;

import java.util.ArrayList;

public class MascotasFavoritas extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascotas_favoritas);

        listaMascotas = (RecyclerView) findViewById(R.id.rvMascot);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm);

        inicializarAdaptador();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    public MascotaAdaptador adaptador;

    private void inicializarAdaptador() {
        adaptador = new MascotaAdaptador(mascotas, this);
        listaMascotas.setAdapter(adaptador);
    }

/*
    public void inicializarListaMascotas() {
        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota(R.drawable.chihuahua_icon_225x158, "Chiquito", "5"));
        mascotas.add(new Mascota(R.drawable.dog_bows_icon, "Catty", "4" ));
        mascotas.add(new Mascota(R.drawable.dog_icon2_225x158, "Orejas", "3" ));
        mascotas.add(new Mascota(R.drawable.dog_labrador_icon, "Cachorro", "4"));
        mascotas.add(new Mascota(R.drawable.kitten_icon_225x158, "Kitten", "3"));

    } */
}
