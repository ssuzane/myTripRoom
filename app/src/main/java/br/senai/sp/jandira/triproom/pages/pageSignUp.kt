package br.senai.sp.jandira.triproom.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.triproom.R
import br.senai.sp.jandira.triproom.ui.theme.TripRoomTheme

@Composable
fun pageSignUp() {
    TripRoomTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {

            Row(modifier = Modifier
                .fillMaxWidth()
                .height(50.dp),
                horizontalArrangement = Arrangement.End
            ) {

                Box(modifier = Modifier
                    .width(120.dp)
                    .height(25.dp)
                    .background(
                        color = Color(0xFFCF06F0),
                        shape = RoundedCornerShape(
                            bottomStart = 16.dp
                        )
                    )
                )
            }
            Column (modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text(text = "Sign Up",
                    color = Color(0xffCF06F0),
                    fontSize = 40.sp,
                    fontWeight = FontWeight.Bold,
                )
                Text(text = "Create a new account.",
                    color = Color(0xFFA09C9C)
                )
                Image(modifier = Modifier.height(120.dp).width(120.dp).padding(20.dp) ,painter = painterResource(id = R.drawable.icon) , contentDescription = "")
            }

            Column (
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceAround,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(20.dp)
            ){

                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    label = {
                        Text(text = "E-mail")
                    },
                    leadingIcon = {
                        Icon(imageVector = Icons.Default.AccountCircle,
                            contentDescription = "susanna",
                            tint = Color(0xffCF06F0),
                        )
                    },
                    colors = OutlinedTextFieldDefaults
                        .colors(
                            focusedBorderColor = Color(0xffCF06F0)
                        ),
                    shape = RoundedCornerShape(12.dp),
                    modifier = Modifier
                        .width(327.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun pageSignUpPreview() {
    TripRoomTheme {
        pageSignUp()
    }
}