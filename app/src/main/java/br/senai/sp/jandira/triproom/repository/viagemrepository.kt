package br.senai.sp.jandira.triproom.repository

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import br.senai.sp.jandira.triproom.R
import br.senai.sp.jandira.triproom.model.viagem
import java.time.LocalDate

class viagemrepository {

    @Composable
    fun ListarTodasAsViagens(): List<viagem.Viagem> {

        val londres = viagem.Viagem()
        londres.id = 1
        londres.destino = "londres cidade do século 21 com uma história que remonta à era romana."
        londres.dataChegada = LocalDate.of(2019,2,18)
        londres.dataPartida = LocalDate.of(2019,2,21)
        londres.imagem = painterResource(id = R.drawable.londres)


        val Porto = viagem.Viagem()
        Porto.id = 2
        Porto.destino = "Porto"
        Porto.descricao = "A região onde hoje fica a cidade do Porto tem vestígios de ocupação humana desde o século VIII A.C., mas foram os romanos, no século I A.C., que passaram a chamar a pequena aldeia na foz do rio Douro de Portus Cale"
        Porto.dataChegada = LocalDate.of(2022,11,3)
        Porto.dataPartida = LocalDate.of(2019,11,12)
        Porto.imagem = painterResource(id = R.drawable.porto)

        val Argentina = viagem.Viagem()
        Argentina.id = 3
        Argentina.destino = "Argentina"
        Argentina.descricao = "A Argentina é um país da América do Sul com uma área extensa que abrange montanhas dos Andes, lagos glaciais e pradarias nos Pampas, ocupadas tradicionalmente por seu famoso gado. "
        Argentina.dataChegada = LocalDate.of(2024,12,1)
        Argentina.dataPartida = LocalDate.of(2025,2,29)
        Argentina.imagem = painterResource(id = R.drawable.argentina)

        val CoreiaDoSul = viagem.Viagem()
        CoreiaDoSul.id = 4
        CoreiaDoSul.destino = "Coreia do Sul"
        CoreiaDoSul.descricao = "A Coreia do Sul, uma nação do Leste da Ásia localizada na metade sul da Península da Coreia, compartilha uma das fronteiras mais militarizadas do mundo com a Coreia do Norte."
        CoreiaDoSul.dataChegada = LocalDate.of(2023,6,16)
        CoreiaDoSul.dataPartida = LocalDate.of(2023,10,7)
        CoreiaDoSul.imagem = painterResource(id = R.drawable.coreiadosul)


        val Japao = viagem.Viagem()
        Japao.id = 5
        Japao.destino = "Japao"
        Japao.descricao = "O Japão, país insular no Oceano Pacífico, tem cidades densas, palácios imperiais, parques nacionais montanhosos e milhares de santuários e templos"
        Japao.dataChegada = LocalDate.of(2023,6,16)
        Japao.dataPartida = LocalDate.of(2023,10,7)
        Japao.imagem = null

        return listOf(londres,Porto,Argentina,CoreiaDoSul,Japao)
    }
}