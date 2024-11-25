package com.example.formas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.formas.ui.theme.FormasTheme
import com.example.formas.ui.theme.Typography

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FormasTheme {
                val navController = rememberNavController()

                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    content = { innerPadding ->
                        Column(
                            modifier = Modifier
                                .padding(innerPadding)
                                .fillMaxSize(),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            NavHost(navController = navController, startDestination = "splash") {
                                composable("splash") { Inicio(navController) }
                                composable("login") { ConteudoLogin(navController) }
                                composable("cadastro") { TelaCadastro(navController) }
                                composable("novo") { CadastroSucesso(navController) }
                                composable("esqueci"){ Esqueci(navController) }
                                composable("mudarsenha") { SenhaNova(navController) }
                                composable("senhaalterada") { NewPass(navController) }
                                composable("home") { Home(navController) }
                            }
                        }
                    }
                )
            }
        }
    }
}


val corRoxa = 0xFFFF5952D1
val corEscura = 0xFFFF213F4E
val corAzul = 0xFFFF3288F6
val corText = 0xFFFF03022C

@Composable
// Conteúdo da tela de login
fun Inicio(navController: NavHostController) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .paint(
                painter = painterResource(id = R.drawable.fundologin),
                contentScale = ContentScale.Crop
            )


    ) {
        Text("Simplificando Estudos, Ampliando Habilidades.",
            color = Color.White ,
            textAlign = TextAlign.Center,
            fontSize = 22.sp,
            fontWeight = FontWeight.Medium,
            modifier = Modifier
                .padding(10.dp),
            style = TextStyle(//para fazer o texto ter uma sombra
                shadow = Shadow(
                    color = Color.Black,  // Cor da sombra
                    offset = Offset(2f, 8f),  // Deslocamento (x, y)
                    blurRadius = 6f  // Grau de desfoque da sombra
                )
            ))

        Image(painter = painterResource(id = R.drawable.group), contentDescription = "", modifier = Modifier. padding(top = 80.dp) )

        Spacer(modifier = Modifier.padding(top = 40.dp))

        Text("AlgebrApp", fontSize = 38.sp)

        Spacer(modifier = Modifier.padding(top = 70.dp))


        ElevatedButton(
            elevation = ButtonDefaults.elevatedButtonElevation(8.dp, focusedElevation = 10.dp, hoveredElevation = 10.dp, pressedElevation = 20.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(corRoxa)),
            onClick = { navController.navigate("login") },
            modifier = Modifier
                .width(249.dp)
                .height(53.dp),

        ) {
            Text("Começar", fontSize = 25.sp, fontWeight = FontWeight.Medium )
        }

    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FormasTheme {
        Inicio(rememberNavController())
    }
}
