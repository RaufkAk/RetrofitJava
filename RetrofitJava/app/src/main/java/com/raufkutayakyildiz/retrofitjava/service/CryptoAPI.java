package com.raufkutayakyildiz.retrofitjava.service;

import com.raufkutayakyildiz.retrofitjava.model.CryptoModel;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.GET;

public interface CryptoAPI {
    //GET,POST,UPDATE,DELETE

    //URL BASE--->www.website.com
    //GET ->price?key=xxx

    //https://raw.githubusercontent.com/atilsamancioglu/K21-JSONDataSet/master/crypto.jso
    @GET("atilsamancioglu/K21-JSONDataSet/master/crypto.json")
    Observable<List<CryptoModel>> getData();


    //Call<List<CryptoModel>> getData();

}
