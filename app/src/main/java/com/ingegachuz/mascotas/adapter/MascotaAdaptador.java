package com.ingegachuz.mascotas.adapter;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.ingegachuz.mascotas.db.ConstructorMascotas;
import com.ingegachuz.mascotas.pojo.Mascota;
import com.ingegachuz.mascotas.MascotasFavoritas;
import com.ingegachuz.mascotas.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by Inge on 29/05/2016.
 */
public class MascotaAdaptador extends RecyclerView.Adapter<MascotaAdaptador.MascotaViewHolder> {
    ArrayList<Mascota> mascotas;
    Activity activity;

    public MascotaAdaptador(ArrayList<Mascota> mascotas, Activity activity){
        this.mascotas = mascotas;
        this.activity = activity;
    }

    @Override
    public MascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_grid_mascota, parent, false);
        return new MascotaViewHolder(v);

    }

    @Override
    public void onBindViewHolder(final MascotaViewHolder mascotaViewHolder, int position) {
        final Mascota mascota = mascotas.get(position);
       // mascotaViewHolder.imgFoto.setImageResource(mascota.getUrlfoto());
        Picasso.with(activity)
                .load(mascota.getUrlfoto())
                .placeholder(R.drawable.chihuahua_icon_225x158)
                .into(mascotaViewHolder.imgFoto);
       // mascotaViewHolder.tvNombrecv.setText(mascota.getNombre());
        mascotaViewHolder.tvCantidad.setText(String.valueOf(mascota.getLikes()));

       mascotaViewHolder.imgFoto.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
              // Toast.makeText(activity, mascota.getNombre(), Toast.LENGTH_SHORT).show();
               Intent intent = new Intent(activity, MascotasFavoritas.class);
               intent.putExtra("url", mascota.getUrlfoto());
               intent.putExtra("like", mascota.getLikes());
               activity.startActivity(intent);
           }
       });

       /* mascotaViewHolder.btnLike.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(activity, "Diste Like a" + mascota.getNombre(), Toast.LENGTH_SHORT).show();

                ConstructorMascotas constructorMascotas = new ConstructorMascotas(activity);
                constructorMascotas.darLikeMascota(mascota);
                mascotaViewHolder.tvCantidad.setText(constructorMascotas.obtenerLikesMascota(mascota));

            }
        }); */

    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }


    public static class MascotaViewHolder extends RecyclerView.ViewHolder {

        private ImageView imgFoto;
        //private TextView tvNombrecv;
       // private ImageButton btnLike;
        private TextView tvCantidad;

        public MascotaViewHolder(View itemView) {
            super(itemView);
            imgFoto      = (ImageView) itemView.findViewById(R.id.imgFoto);
            //tvNombrecv   = (TextView) itemView.findViewById(R.id.tvNombreCV);
            tvCantidad   = (TextView)itemView.findViewById((R.id.tvCantidad));
           // btnLike      = (ImageButton)itemView.findViewById(R.id.btnLike);
        }
    }
}
