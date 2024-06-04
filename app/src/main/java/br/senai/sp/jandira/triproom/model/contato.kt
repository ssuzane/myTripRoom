package br.senai.sp.jandira.triproom.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tbl_contato")
data class contato (

    @PrimaryKey(autoGenerate = true) val Id: Int = 0,
    val Nome: String = "",
    val Telefone: String = "",
    val Email: String = "",
    val Senha: String = "",
    @ColumnInfo(name = "is_over_18") val IdadeMaior: Boolean = false
)

