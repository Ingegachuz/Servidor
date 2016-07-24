package com.ingegachuz.mascotas;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v7.widget.Toolbar;

import com.ingegachuz.mascotas.activity.ActivityAcercade;
import com.ingegachuz.mascotas.activity.ActivityConfigurarCuenta;
import com.ingegachuz.mascotas.activity.ActivityContacto;
import com.ingegachuz.mascotas.activity.ActivityRecibirNotificaciones;
import com.ingegachuz.mascotas.adapter.MascotaAdaptador;
import com.ingegachuz.mascotas.adapter.PageAdapter;
import com.ingegachuz.mascotas.fragment.PerfilFragment;
import com.ingegachuz.mascotas.fragment.RecyclerViewFragment;
import com.ingegachuz.mascotas.pojo.Mascota;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar   = (Toolbar)   findViewById(R.id.toolbar);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        setUpViewPager();



        if (toolbar != null){
            setSupportActionBar(toolbar);
        }
    }

    private ArrayList<Fragment> agregarFragments(){
        ArrayList<Fragment> fragments = new ArrayList<>();

        fragments.add(new RecyclerViewFragment());
        fragments.add(new PerfilFragment());

        return fragments;
    }
    private void setUpViewPager(){
        viewPager.setAdapter(new PageAdapter(getSupportFragmentManager(), agregarFragments()));
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_mascotas);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_perfil);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_opciones, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){

            case R.id.mContacto:
                Intent i = new Intent(this, ActivityContacto.class);
                startActivity(i);
                break;

            case R.id.mAcercade:
                Intent e = new Intent(this, ActivityAcercade.class);
                startActivity(e);
                break;

            case R.id.mConfigurarCuenta:
                Intent o = new Intent(this,ActivityConfigurarCuenta.class);
                startActivity(o);
                break;

            case R.id.mRecibirNotificaciones:
                Intent r = new Intent(this, ActivityRecibirNotificaciones.class);
                startActivity(r);
                break;

            case R.id.btnAction:
                Intent s = new Intent(this, MascotasFavoritas.class);
                startActivity(s);
                break;
        }
        return super.onOptionsItemSelected(item);
    }



 }
