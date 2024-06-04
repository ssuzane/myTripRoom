package br.senai.sp.jandira.triproom.DAO

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [contatos::class], version = 2)
abstract class contatodb:RoomDatabase() {
    abstract fun usuarioDAO(): contatos

    companion object {
        private lateinit var instancia: contatodb

        fun getBancoDeDados(context: Context): contatodb {
            instancia = Room.databaseBuilder(
                context,
                contatodb::class.java,
                "db_usuarios"
            )
                .allowMainThreadQueries()
                .fallbackToDestructiveMigration()
                .build()

            return instancia
        }
    }
}