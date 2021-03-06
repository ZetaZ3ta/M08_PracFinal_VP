package com.example.practica_m08_victor.Dao

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.practica_m08_victor.Entidad.Marcas


@Database(entities = [Marcas::class], version = 1,exportSchema = false)
abstract class MarcasDaoDB : RoomDatabase(){
    abstract fun marcasDao(): MarcasDao

    companion object {
        private var INSTANCE: MarcasDaoDB? = null

        fun getInstance(context: Context): MarcasDaoDB {
            if (INSTANCE == null) {
                INSTANCE = Room.databaseBuilder(
                    context.applicationContext, MarcasDaoDB::class.java, "BBDD_Victor"
                ).allowMainThreadQueries().build()
            }
            return INSTANCE!!
        }
    }
}