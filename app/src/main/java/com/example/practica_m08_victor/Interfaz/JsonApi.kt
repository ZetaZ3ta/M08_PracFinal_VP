package com.example.practica_m08_victor.Interfaz

import com.example.practica_m08_victor.Entidad.Marcas
import retrofit2.Call
import retrofit2.http.GET

interface JsonApi {

    @GET("courses.json")
    fun getDataFromJson(): Call<List<Marcas>>
}
