package com.ingegachuz.mascotas.restApi;


import com.ingegachuz.mascotas.restApi.model.UsuarioResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by Ing_Gachuz on 17/07/2016.
 */
public interface Endpoints {

    @FormUrlEncoded
    @POST(ConstantesRest.KEY_POST_ID_TOKEN)
    Call<UsuarioResponse> registrarTokenID(@Field("token") String token);
}
