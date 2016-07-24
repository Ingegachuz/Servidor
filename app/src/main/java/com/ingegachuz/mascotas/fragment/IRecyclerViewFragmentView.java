package com.ingegachuz.mascotas.fragment;

import com.ingegachuz.mascotas.adapter.MascotaAdaptador;
import com.ingegachuz.mascotas.pojo.Mascota;

import java.util.ArrayList;

/**
 * Created by Ing_Gachuz on 12/06/2016.
 */
public interface IRecyclerViewFragmentView {

    public void generarLinearLayoutVertical();
    public void generarGridLayout();

    public MascotaAdaptador crearAdaptador(ArrayList<Mascota> mascotas);

    public void inicializarAdaptadorRV(MascotaAdaptador adaptador);
}
