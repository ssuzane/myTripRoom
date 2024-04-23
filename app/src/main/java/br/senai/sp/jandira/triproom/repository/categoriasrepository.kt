package br.senai.sp.jandira.triproom.repository

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import br.senai.sp.jandira.triproom.R
import br.senai.sp.jandira.triproom.model.categorias

class categoriasrepository {
    @Composable
    fun ListarTodasAsCategorias(): List<categorias.categorias> {

        val montain = categorias.categorias()
        montain.id = 1
        montain.imagem = painterResource(id = R.drawable.montains)
        montain.descricao = "Montain"

        val snow = categorias.categorias()
        snow.id = 2
        snow.imagem  = null
        montain.descricao = "Snow"

        val beach = categorias.categorias()
        beach.id = 3
        beach.imagem  = null
        beach.descricao = "Beach"

        return listOf(montain,snow, beach)
    }
}