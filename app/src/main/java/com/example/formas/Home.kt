package com.example.formas

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
                onClick = { navController.navigate("matematica") },
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
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
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
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
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
            onClick = { navController.navigate("retangulo")},
            shape = RoundedCornerShape(30.dp),
            modifier = Modifier
                .width(200.dp)
                .height(40.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(corRoxa)
            )
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
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
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
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
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
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
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
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
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
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
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
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

@Composable
fun PageMate(navController: NavController) {
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
            "O País da Matemágica e O Número de Ouro",
            color = Color.White,
            textAlign = TextAlign.Center,
            fontSize = 24.sp,
            fontWeight = FontWeight.Light,
            modifier = Modifier
                .padding(10.dp)
        )

        Spacer(modifier = Modifier.padding(top = 20.dp))

        Row {

            Button(
                onClick = { navController.navigate("home") },
                shape = RoundedCornerShape(30.dp),
                modifier = Modifier
                    .width(172.dp)
                    .height(40.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White
                )
            ) {
                Text(
                    "Geometria",
                    color = Color.Black,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Light
                )
            }

            Spacer(modifier = Modifier.padding(10.dp))

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
                Text(
                    "Matemática",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Light
                )
            }


        }

        Spacer(modifier = Modifier.padding(top = 20.dp))

        Text(
            "Matemática",
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
                .offset(y = (-3).dp)
        )

        Text(
            "Olá! Vamos mergulhar nesta plataforma incrível que tenho repleta de ferramentas para lógica e matemática. É como ter uma caixa de ferramentas supercarregada cheia de tudo que você precisa para lidar com todos os tipos de quebra-cabeças e equações alucinantes.",
            fontWeight = FontWeight.Medium,
            color = Color.White,
            fontSize = 15.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(20.dp)
                .offset(y = (-17).dp)
        )

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
            Text(
                "Conheça seu número",
                fontSize = 15.sp,
                fontWeight = FontWeight.Light
            )
        }

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
            Text(
                "Maior divisor comum",
                fontSize = 15.sp,
                fontWeight = FontWeight.Light
            )
        }

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
            Text(
                "Menor multiplo comum",
                fontSize = 14.sp,
                fontWeight = FontWeight.Light
            )
        }

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
            Text(
                "Par ou ímpar",
                fontSize = 15.sp,
                fontWeight = FontWeight.Light
            )
        }


    }

}

@Composable
fun CalcReta(navController: NavController) {
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

        Spacer(modifier = Modifier.padding(top = 30.dp))

        Text(
            "Geometria do Retângulo",
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
                .offset(y = (-3).dp)
        )

        Spacer(modifier = Modifier.padding(top = 10.dp))

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

        Spacer(modifier = Modifier.padding(top = 5.dp))

        Text(
            "Esta calculadora permite calcular diferentes informações sobre o Retângulo. Insira as dimensões para obter o resultado.",
            fontWeight = FontWeight.Light,
            color = Color.White,
            fontSize = 17.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(10.dp)
                .offset(y = (-1).dp)
        )

        Spacer(modifier = Modifier.padding(top = 10.dp))

        Card(
            shape = RoundedCornerShape(30.dp),
            modifier = Modifier
                .width(370.dp)
                .height(258.dp),
        ) {
            Row(
                modifier = Modifier.padding(start = 5.dp)
            ) {
                Column(
                    modifier = Modifier.padding(start = 5.dp)
                ) {
                    Spacer(modifier = Modifier.padding(top = 30.dp))

                    Image(
                        painter = painterResource(id = R.drawable.area_retangulo),
                        contentDescription = "",
                    )

                    Card(
                        shape = RoundedCornerShape(10.dp),
                        modifier = Modifier
                            .width(160.dp)
                            .height(50.dp)
                            .offset(x = 15.dp),
                        colors = CardDefaults.cardColors(containerColor = Color(corArea))
                    ) {
                        Text(
                            "Área :",
                            modifier = Modifier
                                .padding(top = 15.dp)
                                .padding(start = 15.dp),
                            color = Color.White,
                            fontWeight = FontWeight.Light,
                            fontSize = 15.sp,
                        )
                    }

                }
                Column {
                    Spacer(modifier = Modifier.padding(top = 21.dp))

                    var base by remember { mutableStateOf("") }
                    OutlinedTextField(
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .width(140.dp)
                            .height(60.dp),
                        value = base,
                        onValueChange = { newText -> base = newText },
                        label = {
                            Text(
                                "Base (b):",
                                color = Color.White,
                                fontSize = 15.sp,
                            )
                        },
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedBorderColor = Color(corRoxa),
                            unfocusedBorderColor = Color(corRoxa),
                            focusedContainerColor = Color(corRoxa),
                            unfocusedContainerColor = Color(corRoxa)
                        ),
                        shape = RoundedCornerShape(10.dp),
                    )

                    Spacer(modifier = Modifier.padding(top = 10.dp))

                    var altura by remember { mutableStateOf("") }
                    OutlinedTextField(
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .width(140.dp)
                            .height(60.dp),
                        value = altura,
                        onValueChange = { newText -> altura = newText },
                        label = {
                            Text(
                                "Altura (h): ",
                                color = Color.White,
                                fontSize = 15.sp,
                            )
                        },
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedBorderColor = Color(corRoxa),
                            unfocusedBorderColor = Color(corRoxa),
                            focusedContainerColor = Color(corRoxa),
                            unfocusedContainerColor = Color(corRoxa)
                        ),
                        shape = RoundedCornerShape(10.dp),
                    )

                    Spacer(modifier = Modifier.padding(top = 20.dp))

                    Button(
                        onClick = { navController.navigate("") },
                        shape = RoundedCornerShape(10.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(corCalc)),
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .width(140.dp)
                            .height(50.dp)
                    ) {
                        Text(
                            "Calcular",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Light
                        )
                    }

                }
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

@Preview
@Composable
private fun PagePreview() {
    FormasTheme {
        PageMate(rememberNavController())
    }
}

@Preview
@Composable
private fun CalcPreview() {
    FormasTheme {
        CalcReta(rememberNavController())
    }
}