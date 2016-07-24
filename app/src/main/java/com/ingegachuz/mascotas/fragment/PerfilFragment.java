package com.ingegachuz.mascotas.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.ingegachuz.mascotas.MainActivity;
import com.ingegachuz.mascotas.MascotasFavoritas;
import com.ingegachuz.mascotas.R;
import com.ingegachuz.mascotas.adapter.GridAdapter;


/**
 * A simple {@link Fragment} subclass.
 */
public class PerfilFragment extends Fragment {

    public PerfilFragment() {
        // Required empty public constructor
    }

    private RecyclerView listaMascotas;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_perfil, container, false);

        // listaMascotas = (RecyclerView) x.findViewById(R.id.rvMascotas);

        GridView grid = (GridView) v.findViewById(R.id.grid);
        grid.setAdapter(new GridAdapter(getActivity()));

        return v;

            }

    }