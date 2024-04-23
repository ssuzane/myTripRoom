package br.senai.sp.jandira.triproom.model

import androidx.compose.ui.graphics.painter.Painter
import java.time.LocalDate

class categorias {

    data class categorias(
        var id: Int = 0,
        var imagem: Painter? = null,
        var descricao: String = ""
    )
}