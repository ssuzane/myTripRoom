package br.senai.sp.jandira.triproom.model

@Entity(table)
data class contato (

    val Id: Int = 0,
    val Nome: String = "",
    val Telefone: String = "",
    val Email: String = "",
    val Senha: String = "",
    val IdadeMaior: Boolean = false
)


