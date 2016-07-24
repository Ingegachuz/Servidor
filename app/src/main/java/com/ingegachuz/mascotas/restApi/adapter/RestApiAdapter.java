package com.ingegachuz.mascotas.restApi.adapter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ingegachuz.mascotas.restApi.ConstantesRest;
import com.ingegachuz.mascotas.restApi.ConstantesRestApi;
import com.ingegachuz.mascotas.restApi.Endpoints;
import com.ingegachuz.mascotas.restApi.EndpointsApi;
import com.ingegachuz.mascotas.restApi.deserializador.MascotaDeserializador;
import com.ingegachuz.mascotas.restApi.model.MascotaResponse;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Inge on 24/06/2016.
 */
public class RestApiAdapter {

    public Endpoints establecerConexionRestApi(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ConstantesRest.ROOT_URL1)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(Endpoints.class);
    }

    public EndpointsApi establecerConexionRestApiInstagram(Gson gson){
       Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ConstantesRestApi.ROOT_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        return retrofit.create(EndpointsApi.class);
    }

    public Gson construyeGsonDeserializadorMediaRecent(){
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(MascotaResponse.class, new MascotaDeserializador());
        return gsonBuilder.create();
    }
}
