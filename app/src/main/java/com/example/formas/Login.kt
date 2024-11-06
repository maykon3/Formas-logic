package com.example.formas

import androidx.compose.foundation.Image
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
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.formas.ui.theme.FormasTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
// Conteúdo da tela de cadastro
fun ConteudoLogin(navController: NavHostController) {

    var email by remember {
        mutableStateOf("") // variavel para o campo de texto email
    }
    var senha by remember {
        mutableStateOf("") // variavel para o campo de texto senha
    }
    var rememberMe by remember { mutableStateOf(false) }  // Variável para o botão de "Lembre de mim"

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(top = 20.dp)
            .fillMaxSize()
            .paint(
                painter = painterResource(id = R.drawable.fundologin),
                contentScale = ContentScale.Crop
            )
    ) {
        Row(
            modifier = Modifier.padding(top = 25.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.group),
                contentDescription = "",
                modifier = Modifier.size(33.dp)

            )
            Text("AlgebrApp", color = Color.White, fontSize = 17.sp, modifier = Modifier.padding(start = 10.dp))
        }
        Spacer(modifier = Modifier.padding(100.dp))

        Column() {
            Row(
                modifier = Modifier
                    .padding(start = 30.dp)
                    .padding(bottom = 14.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.vector),
                    contentDescription = "",
                    modifier = Modifier.size(18.dp)
                )
                Text(
                    "E-mail ou Usuário",
                    color = Color.White,
                    fontSize = 14.sp,
                    modifier = Modifier.padding(start = 10.dp)
                )

            }

            TextField(
                value = email,
                onValueChange = { newText -> email = newText },
                label = { Text("Digite seu Email", fontSize = 15.sp, modifier = Modifier.padding(start = 12.dp))},
                placeholder = { Text("Exemplo de Placeholder ") },
                modifier = Modifier
                    .width(331.dp)
                    .height(28.dp),
                shape = RoundedCornerShape(30.dp), // Define o arredondamento das bordas
            )

            Spacer(modifier = Modifier.padding(15.dp))

            Column() {
                Row(
                    modifier = Modifier
                        .padding(start = 30.dp)
                        .padding(bottom = 10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.vector1),
                        contentDescription = "",
                        modifier = Modifier.size(18.dp)
                    )
                    Text(
                        "Senha",
                        color = Color.White,
                        fontSize = 15.sp,
                        modifier = Modifier.padding(start = 10.dp)
                    )

                }

                TextField(
                    value = senha,
                    onValueChange = { newText -> senha = newText },
                    label = { Text("Digite sua Senha", fontSize = 15.sp, modifier = Modifier.padding(start = 12.dp)) },
                    placeholder = { Text("Exemplo de Placeholder ") },
                    modifier = Modifier
                        .width(330.dp)
                        .height(28.dp), // Define a altura exata
                    shape = RoundedCornerShape(30.dp), // Arredondamento das bordas
                )

            }

            Spacer(modifier = Modifier.height(16.dp))

            // Switch de "Lembre de mim"
            Row(
                verticalAlignment = Alignment.CenterVertically,

            ) {
                Text("Lembre de mim", color = Color.White ,fontSize = 16.sp,
                    modifier = Modifier
                        .padding(start = 40.dp)
                        .padding(top = 30.dp)
                )

                Switch(
                    modifier = Modifier
                        .padding(start = 60.dp)
                        .padding(top = 30.dp)
                        .scale(0.8f),
                    checked = rememberMe,
                    onCheckedChange = { rememberMe = it },
                    colors = SwitchDefaults.colors(
                        uncheckedThumbColor = Color(corRoxa),
                        checkedTrackColor = Color(corRoxa), // Cor da trilha (track) quando ligado
                        )
                )
            }


        }
    }
}

@Preview
@Composable
private fun LoginPreview() {
    FormasTheme {
        ConteudoLogin(rememberNavController())
    }
}