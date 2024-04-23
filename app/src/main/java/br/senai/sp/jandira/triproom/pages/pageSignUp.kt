package br.senai.sp.jandira.triproom.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.triproom.R
import br.senai.sp.jandira.triproom.ui.theme.TripRoomTheme

@Composable
fun pageSignUp() {

    var nomeState = remember {
        mutableStateOf("")
    }
    var numeroState = remember {
        mutableStateOf("")
    }
    var emailState = remember {
        mutableStateOf("")
    }
    var senhaState = remember {
        mutableStateOf("")
    }
    var caixinhaState = remember {
        mutableStateOf(false)
    }
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
                    .height(35.dp)
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
                Image(modifier = Modifier
                    .height(120.dp)
                    .width(120.dp)
                    .padding(20.dp)
                    ,painter = painterResource(id = R.drawable.icon) ,
                    contentDescription = "")
            }

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceAround,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(300.dp)
            ) {

                OutlinedTextField(
                    value = nomeState.value,
                    onValueChange = {
                        nomeState.value = it
                    },
                    label = {
                        Text(text = "Username")
                    },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Person,
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
                    value = numeroState.value,
                    onValueChange = {
                        numeroState.value = it
                    },
                    label = {
                        Text(text = "Phone")
                    },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Phone,
                            contentDescription = "Email",
                            tint = Color(0xffCF06F0),
                        )
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

                OutlinedTextField(
                    value = emailState.value,
                    onValueChange = {
                        emailState.value = it
                    },
                    label = {
                        Text(text = "E-mail")
                    },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Email,
                            contentDescription = "Email",
                            tint = Color(0xffCF06F0),
                        )
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

                OutlinedTextField(
                    value = senhaState.value,
                    onValueChange = {
                        senhaState.value = it
                    },
                    label = {
                        Text(text = "Password")
                    },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Lock,
                            contentDescription = "Email",
                            tint = Color(0xffCF06F0),
                        )
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
            Row(
                modifier = Modifier
                    .width(200.dp)
                    .height(50.dp)
                    .padding(start = 37.dp),
                verticalAlignment = Alignment.CenterVertically,

                ) {


                Checkbox(
                    checked = caixinhaState.value,
                    onCheckedChange = {
                        caixinhaState.value = it
                    },
                    colors = CheckboxDefaults
                        .colors(
                            checkedColor = Color(0xffCF06F0),
                            uncheckedColor = Color(0xffCF06F0)
                        )
                )
                Text(text = "Over 18?")
            }

            Column(

                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Button(
                    onClick = { /*TODO*/ },
                    shape = RoundedCornerShape(20.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color((0xffCF06F0)))
                ) {
                    Row(
                        modifier = Modifier
                            .width(280.dp)
                            .height(48.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceAround
                    ) {
                        Text(
                            text = "Create Account",
                            fontSize = 26.sp
                        )
                    }
                }
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
                    .padding(end = 32.dp),
                horizontalArrangement = Arrangement.End

            ) {
                Text(
                    text = "Already have an account?",
                    color = Color(0xFFFA09C9C)
                )
                Text(
                    text = "Login",
                    color = Color(0xFFCF06F0),
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(start = 6.dp)
                )
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.Bottom
        ) {
            Box(
                modifier = Modifier
                    .width(120.dp)
                    .height(35.dp)
                    .background(
                        color = Color(0xFFCF06F0),
                        shape = RoundedCornerShape(
                            topEnd = 16.dp
                        )
                    )
            )
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