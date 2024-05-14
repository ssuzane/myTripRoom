package br.senai.sp.jandira.triproom.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import br.senai.sp.jandira.triproom.ui.theme.TripRoomTheme

@Composable
fun PageLogin(nav: NavHostController) {

    var emailState = remember {
        mutableStateOf("")
    }
    var senhaState = remember {
        mutableStateOf("")
    }
    TripRoomTheme {
        Column (
            modifier = Modifier
                .fillMaxSize()
        ){

            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp),
                horizontalArrangement = Arrangement.End
            ){
                Box(modifier = Modifier
                    .width(120.dp)
                    .height(35.dp)
                    .background(
                        color = Color(0xFFCF06F0),
                        shape = RoundedCornerShape(
                            bottomStart = 16.dp
                        )
                    )
                ){}
            }


            Column (modifier = Modifier
                .padding(22.dp)
            ){
                Text(text = "Login",
                    color = Color(0xffCF06F0),
                    fontSize = 48.sp,
                    fontWeight = FontWeight.Bold,
                )
                Text(text = "Please sign in to continue.",
                    color = Color(0xFFA09C9C)
                )
            }


            Column (
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceAround,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
            ){
                OutlinedTextField(
                    value = emailState.value,
                    onValueChange = {emailState.value = it},
                    label = {
                        Text(text = "E-mail")
                    },
                    leadingIcon = {
                        Icon(imageVector = Icons.Default.Lock,
                            contentDescription = "",
                            tint = Color(0xffCF06F0),
                        )
                    },
                    colors = OutlinedTextFieldDefaults
                        .colors(
                            focusedBorderColor = Color(0xffCF06F0),
                            unfocusedBorderColor = Color(0xffCF06F0),
                        ),
                    shape = RoundedCornerShape(16.dp),
                    modifier = Modifier
                        .width(327.dp)
                )

                OutlinedTextField(
                    value = senhaState.value,
                    onValueChange = {senhaState.value = it},
                    label = {
                        Text(text = "Password")
                    },
                    leadingIcon = {
                        Icon(imageVector = Icons.Default.Email,
                            contentDescription = "",
                            tint = Color(0xffCF06F0),)
                    },
                    colors = OutlinedTextFieldDefaults
                        .colors(
                            focusedBorderColor = Color(0xffCF06F0),
                            unfocusedBorderColor = Color(0xffCF06F0)
                        ),
                    shape = RoundedCornerShape(16.dp),
                    modifier = Modifier
                        .width(327.dp)
                )


            }

            Column (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(125.dp)
                    .padding(28.dp),
                verticalArrangement = Arrangement.SpaceBetween,
                horizontalAlignment = Alignment.End
            ){
                Button(onClick = { /*TODO*/ },
                    shape = RoundedCornerShape(20.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color((0xffCF06F0)))
                ) {
                    Row (
                        modifier = Modifier
                            .width(134.dp)
                            .height(35.dp)
                        ,
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceAround
                    ){
                        Text(text = "Sing in",
                            fontSize = 20.sp)
                        Icon(imageVector = Icons.Default.ArrowForward,
                            contentDescription = "",
                            tint = Color(0xFFFFFFFF),
                        )
                    }
                }
                Row {
                    Text(text = "Don’t have an account?",
                        color = Color(0xFFFA09C9C))
                    Text(text = "Sign in",
                        color = Color(0xFFCF06F0),
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(start = 6.dp)
                    )
                }
            }

            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.Bottom
            ){
                Box(modifier = Modifier
                    .width(120.dp)
                    .height(35.dp)
                    .background(
                        color = Color(0xFFCF06F0),
                        shape = RoundedCornerShape(
                            topEnd = 16.dp
                        )
                    )
                ){

                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PageLoginpreview() {
    TripRoomTheme {
        PageLogin(nav = rememberNavController())
    }
}