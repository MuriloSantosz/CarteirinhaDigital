package com.example.carteirinhadigital

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.carteirinhadigital.ui.theme.CarteirinhaDigitalTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CarteirinhaDigitalTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    CarteirinhaDigital(
                        nome = "Saas",
                        curso = "Devest",
                        modifier = Modifier.padding(innerPadding)

                    )
                }
            }
        }
    }
}

@Composable
fun CarteirinhaDigital(modifier: Modifier = Modifier, nome: String, curso: String){
    Box{
        Image(
            painter = painterResource(id = R.drawable.macacofundo),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 40.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.senai),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 40.dp)
                    .padding(horizontal = 25.dp)

            )
            Image(
                painter =painterResource(id = R.drawable.macaco),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .padding(35.dp)
                    .size(150.dp)
                    .clip(CircleShape)

            )
            Text(
                text = "Nome: ${nome}",
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(top = 15.dp),
                color = Color.Red,
                fontSize = 40.sp

            )
            Text(
                text = "Curso: ${curso}",
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(bottom = 50.dp),
                color = Color.Red,
                fontSize = 40.sp
            )
            QrCode(
                conteudo = "90000000001756396163",
                modifier = Modifier
                    .size(200.dp)
            )



    }

    }



}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CarteirinhaDigitalTheme() {

    }
}