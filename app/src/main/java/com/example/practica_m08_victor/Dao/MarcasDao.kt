package com.example.practica_m08_victor.Dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.practica_m08_victor.Entidad.Marcas


@Dao
interface MarcasDao {
    @Query("SELECT * FROM  Marcas")
     fun getAll(): List<Marcas>
    @Query("SELECT * FROM  Marcas")
    fun findAll():LiveData<List<Marcas>>

    @Update
     fun update(marca: Marcas)

    @Insert(onConflict= OnConflictStrategy.REPLACE)
     fun insertar(marcas: List<Marcas>)
}