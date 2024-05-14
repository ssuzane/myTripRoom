package br.senai.sp.jandira.triproom.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Place
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.triproom.R
import br.senai.sp.jandira.triproom.repository.categoriasrepository
import br.senai.sp.jandira.triproom.repository.viagemrepository
import br.senai.sp.jandira.triproom.ui.theme.TripRoomTheme

@Composable
    fun PageHome(nav: NavHostController) {

    val Viagem = viagemrepository().ListarTodasAsViagens()

    val Categoria = categoriasrepository().ListarTodasAsCategorias()

    var buscarState = remember {
        mutableStateOf("")
    }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xffF6F6F6)),
    ) {

        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .height(220.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.fundo),
                contentDescription = "",
                contentScale = ContentScale.Crop

            )


            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(130.dp),
                    horizontalAlignment = Alignment.End
                ) {
                    Surface(
                        modifier = Modifier
                            .width(60.dp)
                            .height(60.dp),
                        shape = RoundedCornerShape(50.dp)

                    )
                    {
                        Image(
                            painter = painterResource(id = R.drawable.iconperfil),
                            contentDescription = ""
                        )

                    }
                    Text(
                        text = "Susu",
                        color = Color.White,
                    )
                }

                Column(
                    modifier = Modifier
                ) {
                    Row {
                        Icon(
                            imageVector = Icons.Default.Place,
                            contentDescription = "",
                            tint = Color.White
                        )
                        Text(
                            text = "You're in Paris",
                            color = Color.White,
                            fontSize = 14.sp,
                        )
                    }
                    Text(
                        text = "My Trips",
                        color = Color.White,
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
        Row(
            modifier = Modifier
                .padding(16.dp)
        ) {
            Text(
                text = "Categories",
                color = Color(0xFF868181),
                fontSize = 16.sp
            )
        }
        LazyRow(
            modifier = Modifier
                .padding(start = 16.dp)

        ) {
            item(Categoria) {
                Card(
                    modifier = Modifier
                        .width(102.dp)
                        .height(64.dp)
                        .padding(end = 8.dp),
                    colors = CardDefaults.cardColors(containerColor = Color(0xFFCF06F0)),
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {

                    }
                }
            }
        }
    }
}

