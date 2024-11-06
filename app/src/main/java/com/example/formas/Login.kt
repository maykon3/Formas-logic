package com.example.formas

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.formas.ui.theme.FormasTheme

@Composable
// Conteúdo da tela de cadastro
fun Login(navController: NavHostController) {

    var email by remember{
        mutableStateOf("")
    }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(top = 20.dp)
            .fillMaxSize()
            .paint(
                painter = painterResource(id = R.drawable.whatsapp_image_2024_11_05_at_22_47_52__1_),
                contentScale = ContentScale.Crop
            )
    ) {
    Row(
        modifier = Modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(painter = painterResource(id = R.drawable.group),
            contentDescription = "",
            modifier = Modifier.size(33.dp)

        )
        Text("AlgebrApp", fontSize = 20.sp, modifier = Modifier.padding( start = 10.dp))
    }
        Spacer(modifier = Modifier.padding(100.dp))

        Column() {
            Row(
                modifier = Modifier,
                verticalAlignment = Alignment.CenterVertically
            ){
                Image(painter = painterResource(id = R.drawable.vector),
                    contentDescription = "",
                    modifier = Modifier.size(18.dp) )
                Text("E-mail ou nome de usuário",  fontSize = 15.sp, modifier = Modifier.padding( start = 10.dp))

            }

        }



    }
}

@Preview
@Composable
private fun LoginPreview() {
    FormasTheme {
        Login(rememberNavController())
    }
}