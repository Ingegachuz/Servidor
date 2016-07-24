package com.ingegachuz.mascotas.restApi.model;

import com.ingegachuz.mascotas.pojo.Mascota;

import java.util.ArrayList;

/**
 * Created by Inge on 24/06/2016.
 */
public class MascotaResponse {


    ArrayList<Mascota> mascotas;

    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }
}
