package com.example.formas

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.formas.ui.theme.FormasTheme


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TelaCadastro(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(corEscura))
    ) {
        Row(
            modifier = Modifier
                .padding(top = 30.dp)
                .padding(start = 25.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Image(
                painter = painterResource(id = R.drawable.vector2),
                contentDescription = "",
                modifier = Modifier
                    .padding(end = 90.dp)
                    .size(20.dp)
                    .clickable { navController.navigate("login") }
            )
            Image(
                painter = painterResource(id = R.drawable.group),
                contentDescription = "",
                modifier = Modifier
                    .size(33.dp)

            )
            Text(
                "AlgebrApp",
                color = Color.White,
                fontSize = 17.sp,
                modifier = Modifier.padding(start = 10.dp)
            )
        }

        Spacer(modifier = Modifier.padding(10.dp))

        Text(
            "Criar Conta",
            color = Color.White,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(start = 10.dp)
                .align(Alignment.CenterHorizontally)
        )

        Spacer(modifier = Modifier.padding(5.dp))

        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
        ) {

            Card(
                modifier = Modifier
                    .fillMaxSize(),
                colors = CardDefaults.cardColors(containerColor = Color(corAzul)),
                shape = RoundedCornerShape(topEnd = 20.dp, topStart = 20.dp)
            ) {
                Column(
                    modifier = Modifier.padding(top = 30.dp)
                ) {

                    var email by remember {
                        mutableStateOf("") // variavel para o campo de texto email
                    }
                    var nome by remember {
                        mutableStateOf("") // variavel para o campo de texto email
                    }
                    var numero by remember {
                        mutableStateOf("") // variavel para o campo de texto email
                    }
                    var nascimento by remember {
                        mutableStateOf("") // variavel para o campo de texto email
                    }
                    var senha by remember {
                        mutableStateOf("") // variavel para o campo de texto email
                    }
                    var senha2 by remember {
                        mutableStateOf("") // variavel para o campo de texto email
                    }



                    OutlinedTextField(
                        modifier = Modifier
                            .padding(start = 27.dp)
                            .width(340.dp),
                        value = nome,
                        onValueChange = { newText -> nome = newText },
                        label = {
                            Text(
                                "Nome",
                                color = Color.Black,
                                fontSize = 16.sp,
                                modifier = Modifier.padding(start = 15.dp)
                            )
                        },
                        colors = TextFieldDefaults.textFieldColors(containerColor = Color.White),
                        shape = RoundedCornerShape(30.dp),
                        textStyle = TextStyle(
                            fontSize = 16.sp, textAlign = TextAlign.Start
                        )
                    )

                    Spacer(modifier = Modifier.padding(top = 5.dp)) // espaçamento entre um bloco e outro

                    OutlinedTextField(
                        modifier = Modifier
                            .padding(start = 27.dp)
                            .width(340.dp),
                        value = email,
                        onValueChange = { newText -> email = newText },
                        label = {
                            Text(
                                "Email",
                                color = Color.Black,
                                fontSize = 16.sp,
                                modifier = Modifier.padding(start = 15.dp)
                            )
                        },
                        colors = TextFieldDefaults.textFieldColors(containerColor = Color.White),
                        shape = RoundedCornerShape(30.dp),
                        textStyle = TextStyle(
                            fontSize = 16.sp, textAlign = TextAlign.Start
                        )
                    )
                    Spacer(modifier = Modifier.padding(top = 5.dp)) // espaçamento entre um bloco e outro

                    OutlinedTextField(
                        modifier = Modifier
                            .padding(start = 27.dp)
                            .width(340.dp),
                        value = numero,
                        onValueChange = { newText -> numero = newText },
                        label = {
                            Text(
                                "Numero",
                                color = Color.Black,
                                fontSize = 16.sp,
                                modifier = Modifier.padding(start = 15.dp)
                            )
                        },
                        colors = TextFieldDefaults.textFieldColors(containerColor = Color.White),
                        shape = RoundedCornerShape(30.dp),
                        textStyle = TextStyle(
                            fontSize = 16.sp, textAlign = TextAlign.Start
                        )
                    )
                    Spacer(modifier = Modifier.padding(top = 5.dp)) // espaçamento entre um bloco e outro

                    OutlinedTextField(
                        modifier = Modifier
                            .padding(start = 27.dp)
                            .width(340.dp),
                        value = nascimento,
                        onValueChange = { newText -> nascimento = newText },
                        label = {
                            Text(
                                "Data De Nascimento",
                                color = Color.Black,
                                fontSize = 17.sp,
                                modifier = Modifier.padding(start = 15.dp)
                            )
                        },
                        colors = TextFieldDefaults.textFieldColors(containerColor = Color.White),
                        shape = RoundedCornerShape(30.dp),
                        textStyle = TextStyle(
                            fontSize = 16.sp, textAlign = TextAlign.Start
                        )
                    )

                    Spacer(modifier = Modifier.padding(top = 5.dp)) // espaçamento entre um bloco e outro

                    OutlinedTextField(
                        modifier = Modifier
                            .padding(start = 27.dp)
                            .width(340.dp),
                        value = senha,
                        onValueChange = { newText -> senha = newText },
                        label = {
                            Text(
                                "Senha",
                                color = Color.Black,
                                fontSize = 16.sp,
                                modifier = Modifier.padding(start = 15.dp)
                            )
                        },
                        colors = TextFieldDefaults.textFieldColors(containerColor = Color.White),
                        shape = RoundedCornerShape(30.dp),
                        textStyle = TextStyle(
                            fontSize = 16.sp, textAlign = TextAlign.Start
                        )
                    )
                    Spacer(modifier = Modifier.padding(top = 5.dp)) // espaçamento entre um bloco e outro

                    OutlinedTextField(
                        modifier = Modifier
                            .padding(start = 27.dp)
                            .width(340.dp),
                        value = senha2,
                        onValueChange = { newText -> senha2 = newText },
                        label = {
                            Text(
                                "Confirma Senha",
                                color = Color.Black,
                                fontSize = 16.sp,

                                modifier = Modifier.padding(start = 15.dp)
                            )
                        },
                        colors = TextFieldDefaults.textFieldColors(containerColor = Color.White),
                        shape = RoundedCornerShape(30.dp),
                        textStyle = TextStyle(
                            fontSize = 16.sp, textAlign = TextAlign.Start
                        )
                    )


                }

                Spacer(modifier = Modifier.padding(10.dp))

                Button(
                    onClick = { navController.navigate("login") },
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .width(150.dp)
                ) {
                    Text("Cadastrar", fontSize = 17.sp)
                }

                OutlinedCard(
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(top = 10.dp)
                        .width(268.dp)
                        .height(47.dp),
                    colors = androidx.compose.material3.CardDefaults.outlinedCardColors(
                        containerColor = Color.Transparent  // Define a cor de fundo como transparente
                    ),
                    border = BorderStroke(1.5.dp, Color(corRoxa))
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "Já tem uma conta? ",
                            fontSize = 14.sp,
                            color = Color.White
                        )

                        Text(
                            "Login",
                            fontSize = 16.sp,
                            color = Color.White,
                            textDecoration = TextDecoration.Underline,
                            fontWeight = FontWeight.Medium,
                            modifier = Modifier.clickable {
                                navController.navigate("login")
                            }
                        )

                    }

                }

                Spacer(modifier = Modifier.padding(10.dp))

                Text(
                    "Ao continuar, estou de acordo com os Termos de Uso e com o Aviso de Privacidade ",
                    color = Color.Black,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Medium,
                    textDecoration = TextDecoration.Underline,
                    fontSize = 15.sp,
                    modifier = Modifier
                        .padding(horizontal = 20.dp)
                        .padding(top = 2.dp)
                )

            }
        }


    }
}

@Preview(showBackground = true)
@Composable
fun CadastroPreview() {
    FormasTheme {
        TelaCadastro(rememberNavController())
    }
}