package com.ingegachuz.mascotas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

/**
 * Created by Inge on 23/06/2016.
 */
public class DetalleMascota extends AppCompatActivity {
    private static final String KEY_EXTRA_URL = "url";
    private static final String KEY_EXTRA_LIKES = "like";
    private ImageView imgFotoDetalle;
    private TextView tvCantidadDetalle;

    @Override
    public void  onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_mascota_foto);

        Bundle extras = getIntent().getExtras();
        String url    = extras.getString(KEY_EXTRA_URL);
        int Likes     = extras.getInt(KEY_EXTRA_LIKES);

        tvCantidadDetalle   = (TextView) findViewById(R.id.tvCantidadDetalle);
        tvCantidadDetalle.setText(String.valueOf(Likes));

        imgFotoDetalle = (ImageView) findViewById(R.id.imgFotoDetalle);
        Picasso.with(this)
                .load(url)
                .placeholder(R.drawable.chihuahua_icon_225x158)
                .into(imgFotoDetalle);

    }

}
