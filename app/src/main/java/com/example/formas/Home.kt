package com.example.formas

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.formas.ui.theme.FormasTheme

@Composable
fun Home(navController: NavController) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .paint(
                painter = painterResource(id = R.drawable.home),
                contentScale = ContentScale.Crop
            )
    ) {
        Spacer(modifier = Modifier.padding(top = 20.dp))

        Row(
            modifier = Modifier.padding(top = 20.dp),
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

        Spacer(modifier = Modifier.padding(top = 20.dp))

        Text(
            "Visualize as possibilidades da matemática.",
            color = Color.White,
            textAlign = TextAlign.Center,
            fontSize = 22.sp,
            fontWeight = FontWeight.Light,
            modifier = Modifier
                .padding(10.dp)
        )

        Spacer(modifier = Modifier.padding(top = 20.dp))

        Row {

            Button(
                onClick = { },
                shape = RoundedCornerShape(30.dp),
                modifier = Modifier
                    .width(172.dp)
                    .height(40.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(corRoxa)
                )
            ) {
                Text("Geometria", fontSize = 15.sp, fontWeight = FontWeight.Light)
            }

            Spacer(modifier = Modifier.padding(10.dp))

            Button(
                onClick = { },
                shape = RoundedCornerShape(30.dp),
                modifier = Modifier
                    .width(172.dp)
                    .height(40.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White
                )
            ) {
                Text(
                    "Matemática",
                    color = Color.Black,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Light
                )
            }


        }

        Spacer(modifier = Modifier.padding(top = 5.dp))

        Text(
            "Formas Geométricas em 2D",
            color = Color.White,
            textAlign = TextAlign.Center,
            fontSize = 20.sp,
            fontWeight = FontWeight.Medium,
            modifier = Modifier
                .padding(10.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.line_10),
            contentDescription = "",
            modifier = Modifier
                .offset(y = (-2).dp)
        )

        Spacer(modifier = Modifier.padding(top = 10.dp))

        Button(
            onClick = { },
            shape = RoundedCornerShape(30.dp),
            modifier = Modifier
                .width(200.dp)
                .height(40.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(corRoxa)
            )
        ) {
            Row (
                verticalAlignment = Alignment.CenterVertically
            ){
                Image(
                    painter = painterResource(R.drawable.ret_ngulo),
                    contentDescription = ""
                )

                Spacer(modifier = Modifier.padding(start = 10.dp))

                Text("Retângulo", fontSize = 15.sp, fontWeight = FontWeight.Light)
            }
        }

        Spacer(modifier = Modifier.padding(top = 14.dp))

        Button(
            onClick = { },
            shape = RoundedCornerShape(30.dp),
            modifier = Modifier
                .width(200.dp)
                .height(40.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(corRoxa)
            )
        ) {
            Row (
                verticalAlignment = Alignment.CenterVertically
            ){
                Image(
                    painter = painterResource(R.drawable.quadrado),
                    contentDescription = ""
                )

                Spacer(modifier = Modifier.padding(start = 10.dp))

                Text("Quadrado", fontSize = 15.sp, fontWeight = FontWeight.Light)
            }
        }

        Spacer(modifier = Modifier.padding(top = 14.dp))

        Button(
            onClick = { },
            shape = RoundedCornerShape(30.dp),
            modifier = Modifier
                .width(200.dp)
                .height(40.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(corRoxa)
            )
        ) {
            Row (
                verticalAlignment = Alignment.CenterVertically
            ){
                Image(
                    painter = painterResource(R.drawable.circulo),
                    contentDescription = ""
                )

                Spacer(modifier = Modifier.padding(start = 10.dp))

                Text("Círculo", fontSize = 15.sp, fontWeight = FontWeight.Light)
            }
        }

        Spacer(modifier = Modifier.padding(top = 14.dp))

        Button(
            onClick = { },
            shape = RoundedCornerShape(30.dp),
            modifier = Modifier
                .width(200.dp)
                .height(40.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(corRoxa)
            )
        ) {
            Row (
                verticalAlignment = Alignment.CenterVertically
            ){
                Image(
                    painter = painterResource(R.drawable.trape),
                    contentDescription = ""
                )

                Spacer(modifier = Modifier.padding(start = 10.dp))

                Text("Trapezoide", fontSize = 15.sp, fontWeight = FontWeight.Light)
            }
        }

        Spacer(modifier = Modifier.padding(top = 14.dp))

        Button(
            onClick = { },
            shape = RoundedCornerShape(30.dp),
            modifier = Modifier
                .width(200.dp)
                .height(40.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(corRoxa)
            )
        ) {
            Row (
                verticalAlignment = Alignment.CenterVertically
            ){
                Image(
                    painter = painterResource(R.drawable.poligonp),
                    contentDescription = ""
                )

                Spacer(modifier = Modifier.padding(start = 10.dp))

                Text("Polígono", fontSize = 15.sp, fontWeight = FontWeight.Light)
            }
        }

        Spacer(modifier = Modifier.padding(top = 5.dp))

        Text(
            "Formas Geométricas em 3D",
            color = Color.Black,
            textAlign = TextAlign.Center,
            fontSize = 20.sp,
            fontWeight = FontWeight.Medium,
            modifier = Modifier
                .padding(10.dp)
        )

        Image(
            painter = painterResource(id = R.drawable.line_10),
            contentDescription = "",
            modifier = Modifier
                .offset(y = (-2).dp)
        )

        Spacer(modifier = Modifier.padding(top = 20.dp))

        Button(
            onClick = { },
            shape = RoundedCornerShape(30.dp),
            modifier = Modifier
                .width(200.dp)
                .height(40.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(corRoxa)
            )
        ) {
            Row (
                verticalAlignment = Alignment.CenterVertically
            ){
                Image(
                    painter = painterResource(R.drawable.cubo),
                    contentDescription = ""
                )

                Spacer(modifier = Modifier.padding(start = 10.dp))

                Text("Cubo", fontSize = 15.sp, fontWeight = FontWeight.Light)
            }
        }

        Spacer(modifier = Modifier.padding(top = 13.dp))

        Button(
            onClick = { },
            shape = RoundedCornerShape(30.dp),
            modifier = Modifier
                .width(200.dp)
                .height(40.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(corRoxa)
            )
        ) {
            Row (
                verticalAlignment = Alignment.CenterVertically
            ){
                Image(
                    painter = painterResource(R.drawable.cuboide),
                    contentDescription = ""
                )

                Spacer(modifier = Modifier.padding(start = 10.dp))

                Text("Cubóide", fontSize = 15.sp, fontWeight = FontWeight.Light)
            }
        }

        Spacer(modifier = Modifier.padding(top = 13.dp))

        Button(
            onClick = { },
            shape = RoundedCornerShape(30.dp),
            modifier = Modifier
                .width(200.dp)
                .height(40.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(corRoxa)
            )
        ) {
            Row (
                verticalAlignment = Alignment.CenterVertically
            ){
                Image(
                    painter = painterResource(R.drawable.romboedro),
                    contentDescription = ""
                )

                Spacer(modifier = Modifier.padding(start = 10.dp))

                Text("Romboedro", fontSize = 15.sp, fontWeight = FontWeight.Light)
            }
        }


    }
}

@Preview
@Composable
private fun HomePreview() {
    FormasTheme {
        Home(rememberNavController())
    }
}