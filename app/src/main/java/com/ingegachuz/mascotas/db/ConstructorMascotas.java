package com.ingegachuz.mascotas.db;

import android.content.ContentValues;
import android.content.Context;

import com.ingegachuz.mascotas.R;
import com.ingegachuz.mascotas.pojo.Mascota;

import java.util.ArrayList;

/**
 * Created by Ing_Gachuz on 12/06/2016.
 */
public class ConstructorMascotas {

    private static final int LIKE = 1;
    private Context context;

    public ConstructorMascotas(Context context) {
        this.context = context;
    }

    public ArrayList<Mascota> obtenerDatos(){
       /* ArrayList<Mascota>mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota(R.drawable.chihuahua_icon_225x158, "Chiquito", "4"));
        mascotas.add(new Mascota(R.drawable.dog_bows_icon, "Catty", "4"));
        mascotas.add(new Mascota(R.drawable.dog_icon2_225x158, "Orejas", "2"));
        mascotas.add(new Mascota(R.drawable.dog_labrador_icon, "Cachorro", "3"));
        mascotas.add(new Mascota(R.drawable.kitten_icon_225x158, "Kitten", "2"));
        return mascotas; */

        BaseDatos db = new BaseDatos(context);
        insertarTresMascotas(db);
        return db.obtenerTodaslasMascotas();
    }

    public void insertarTresMascotas(BaseDatos db){
        ContentValues contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_NOMBRE, "Chiquito");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_FOTO, R.drawable.chihuahua_icon_225x158);

        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_NOMBRE, "Catty");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_FOTO, R.drawable.dog_bows_icon);

        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_NOMBRE, "Orejas");
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_FOTO, R.drawable.dog_icon2_225x158);

        db.insertarMascota(contentValues);
    }

    public void darLikeMascota(Mascota mascota){
        BaseDatos db = new BaseDatos(context);
        ContentValues contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_LIKES_MASCOTA_ID_MASCOTA, mascota.getId());
        contentValues.put(ConstantesBaseDatos.TABLE_LIKES_MASCOTA_NUMERO_LIKES, LIKE);
        db.insertarLikeMascota(contentValues);
    }

    public int obtenerLikesMascota(Mascota mascota){
        BaseDatos db = new BaseDatos(context);
        return db.obtenerLikesMascota(mascota);

    }
}
