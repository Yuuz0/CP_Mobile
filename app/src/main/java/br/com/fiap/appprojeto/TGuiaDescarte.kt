package br.com.fiap.appprojeto

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.fiap.appprojeto.ui.theme.AppProjetoTheme

@Composable
fun GDScreen(navController: NavController) {

    Box() {
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(180.dp)
                    .background(Color(0xFF03A9F4))

            ) {
                Image(
                    painter = painterResource(id = R.drawable.logodescarte),
                    contentDescription = "Imagem logo do Descarte",
                    modifier = Modifier
                        .size(100.dp)
                        .padding(top = 16.dp)
                )
                Text(
                    text = "Guia de Descarte",
                    fontSize = 24.sp,
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(top = 12.dp, bottom = 24.dp)
                )
            }
            Column (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
            ){
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp),
                    colors = CardDefaults
                        .cardColors(containerColor = Color(0xfff9f6f6)),
                    elevation = CardDefaults.cardElevation(4.dp)
                ){
                    Row (
                        modifier = Modifier
                            .padding()
                            .fillMaxWidth()
                            .height(200.dp)
                            .background(Color(0xFF03A9F4))
                    ){
                        Image(painter = painterResource(id = R.drawable.reciclar),
                            contentDescription = "Tartatuga comendo lixo",
                            modifier = Modifier
                                .size(200.dp)
                                .clip(shape = CircleShape),
                            alignment = Alignment.CenterStart
                            )
                        Column {
                            Text(
                                text = "Por que reciclar?",
                                fontSize = 22.sp,
                                color = Color.White,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(end = 3.dp)
                            )
                            Text(
                                text = "Dentre as muitas razões do porque reciclar, as mais importantes são economia e prevenção. Seu processo ajuda a diminuir o desperdício de energia, água, a contaminação do solo e lençóis freáticos...",
                                fontSize = 11.sp,
                                fontWeight = FontWeight.Thin,
                                color = Color.White,
                                modifier = Modifier.padding(2.dp),
                                letterSpacing = 1.sp
                            )
                        }
                    }
                }
                Row (
                    verticalAlignment = Alignment.Top,
                    modifier = Modifier
                        .width(200.dp)
                ){
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .fillMaxWidth(),
                        shape = RoundedCornerShape(16.dp),
                        colors = ButtonDefaults.buttonColors(Color(0xFF8BE095))
                    ) {
                        Text(
                            text = "Saiba mais",
                            fontWeight = FontWeight.Bold,
                            color = Color.White,
                            fontSize = 13.sp,
                        )
                    }
                }
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(170.dp),
                    colors = CardDefaults
                        .cardColors(containerColor = Color(0xfff9f6f6)),
                    elevation = CardDefaults.cardElevation(4.dp)
                ){
                    Row (
                        modifier = Modifier
                            .padding()
                            .fillMaxWidth()
                            .height(200.dp)
                            .background(Color(0xFF03A9F4))
                    ){
                        Image(
                            painter = painterResource(id = R.drawable.reciclar2),
                            contentDescription = "Imagen de latas de lixo reciclaveis",
                            modifier = Modifier
                                .size(200.dp)
                                .clip(shape = CircleShape),
                            alignment = Alignment.CenterStart
                        )
                        Column {
                            Text(
                                text = "Como reciclar?",
                                fontSize = 22.sp,
                                color = Color.White,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(end = 3.dp)
                            )
                            Text(
                                text = "A reciclagem é realizada especialmente por meio da chamada coleta seletiva. Esse tipo de coleta, usualmente oferecido pelos serviços públicos de coleta de lixo, recolhe os materiais recicláveis...",
                                fontSize = 11.sp,
                                fontWeight = FontWeight.Thin,
                                color = Color.White,
                                modifier = Modifier.padding(2.dp),
                                letterSpacing = 1.sp
                            )
                        }


                    }
                }
                Row (
                    verticalAlignment = Alignment.Top,
                    modifier = Modifier
                        .width(200.dp)
                ){
                    Button(
                        onClick = { /*TODO*/ },
                        modifier = Modifier
                            .fillMaxWidth(),
                        shape = RoundedCornerShape(16.dp),
                        colors = ButtonDefaults.buttonColors(Color(0xFF8BE095))
                    ) {
                        Text(
                            text = "Saiba como Reciclar",
                            fontWeight = FontWeight.Bold,
                            color = Color.White,
                            fontSize = 13.sp,
                        )
                    }
                }

            }
        }


    }
}

