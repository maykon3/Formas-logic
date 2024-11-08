package com.example.formas

import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
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
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
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
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 20.dp)
            .paint(
                painter = painterResource(id = R.drawable.fundologin),
                contentScale = ContentScale.Crop
            ),
        horizontalAlignment = Alignment.CenterHorizontally,

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
            Text(
                "AlgebrApp",
                color = Color.White,
                fontSize = 17.sp,
                modifier = Modifier.padding(start = 10.dp)
            )
        }

        Spacer(modifier = Modifier.padding(50.dp))

        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            OutlinedTextField(
                value = email,
                onValueChange = { newText -> email = newText },
                label = {
                    Text(
                        "E-mail ou nome de usuário",
                        color = Color.White,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium
                    )
                },
                leadingIcon = {
                    Image(
                        painter = painterResource(R.drawable.vector),
                        contentDescription = "Ícone do campo de texto",
                        modifier = Modifier.size(20.dp)
                    )
                },
                modifier = Modifier
                    .width(334.82.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color(corRoxa),
                    unfocusedBorderColor = Color(corRoxa)

                )
            )
            Spacer(modifier = Modifier.padding(2.dp))

            OutlinedTextField(
                value = senha,
                onValueChange = { newText -> senha = newText },
                label = {
                    Text(
                        "Senha",
                        color = Color.White,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Medium
                    )
                },
                leadingIcon = {
                    Image(
                        painter = painterResource(R.drawable.vector1),
                        contentDescription = "Ícone do campo de texto",
                        modifier = Modifier.size(20.dp)
                    )
                },
                modifier = Modifier
                    .padding(top = 8.dp)
                    .width(334.82.dp),
                colors = OutlinedTextFieldDefaults.colors(
                    focusedBorderColor = Color(corRoxa),
                    unfocusedBorderColor = Color(corRoxa)

                )
            )

            Text(
                "Esqueci minha senha",
                fontSize = 16.sp,
                color = Color.White,
                textDecoration = TextDecoration.Underline,
                fontWeight = FontWeight.Medium,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 30.dp)
                    .padding(top = 10.dp)
            )

            Row(
                modifier = Modifier.padding(start = 30.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    "Lembrar de mim",
                    fontSize = 16.sp,
                    color = Color.White
                )
                Switch(
                    modifier = Modifier
                        .scale(0.8f)
                        .padding(start = 100.dp),
                    checked = rememberMe,
                    onCheckedChange = { rememberMe = it },
                    colors = SwitchDefaults.colors(
                        uncheckedThumbColor = Color(corRoxa),
                        checkedTrackColor = Color(corRoxa)
                    )
                )
            }

            Button(
                onClick = { /* ação ao clicar */ },
                shape = RoundedCornerShape(30.dp),
                modifier = Modifier
                    .width(124.dp)
            ) {
                Text(
                    text = "Entrar",
                    color = Color.White,
                    fontSize = 20.sp,
                    modifier = Modifier
                        .align(alignment = Alignment.CenterVertically)

                )
            }



            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(horizontal = 25.dp)
            ) {
                Image(
                    painter = painterResource(R.drawable.line_6),
                    contentDescription = "",
                    modifier = Modifier
                        .size(width = 109.dp, height = 50.dp)
                )
                Text(
                    "OU",
                    fontSize = 13.sp,
                    fontWeight = FontWeight.Medium,
                    color = Color(corRoxa),
                    modifier = Modifier.padding(start = 10.dp, end = 10.dp)
                )

                Image(
                    painter = painterResource(R.drawable.line_6),
                    contentDescription = "",
                    modifier = Modifier
                        .size(width = 109.dp, height = 50.dp)
                )
            }

            Text(
                "Entrar com contas de redes sociais:",
                color = Color.White,
                modifier = Modifier
                    .padding(horizontal = 20.dp)
                    .padding(top = 2.dp)
            )
            Image(
                painter = painterResource(R.drawable.group_105),
                contentDescription = "",
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .size(width = 120.dp, height = 80.dp)
            )
            OutlinedCard(
                modifier = Modifier
                    .width(268.dp)
                    .height(47.dp),
                colors = androidx.compose.material3.CardDefaults.outlinedCardColors(
                    containerColor = Color.Transparent  // Define a cor de fundo como transparente
                ),
                border = BorderStroke(1.5.dp, Color(corRoxa)) // Define a borda do carda com a cor escolhida, 1.5dp e o tamanho da borda 
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxSize(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "Não tem uma conta? ",
                        fontSize = 14.sp,
                        color = Color.White
                    )

                    Text(
                        "Cadastre-se",
                        fontSize = 16.sp,
                        color = Color.White,
                        textDecoration = TextDecoration.Underline,
                        fontWeight = FontWeight.Medium,

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



@Preview
@Composable
fun LoginPreview() {
    FormasTheme {
        ConteudoLogin(rememberNavController())
    }
}
