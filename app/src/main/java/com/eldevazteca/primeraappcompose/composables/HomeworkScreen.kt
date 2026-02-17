package com.eldevazteca.primeraappcompose.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.eldevazteca.primeraappcompose.R

@Composable
fun HomeWorkScreen(modifier: Modifier) {
    Column (
        modifier = modifier
            .fillMaxSize()
            .background(Color.Gray)
            .padding(10.dp)
    ) {
        Text(
            "Elige que personaje deseas eliminar",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(12.dp))
                .background(Color.DarkGray)
                .padding(8.dp),
            color = Color.White
        )
        Spacer(modifier = Modifier.height(20.dp))
        Row(
            modifier = Modifier
                .padding(vertical = 20.dp)
                .fillMaxWidth()
                .height(50.dp),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Button(onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Black,
                    contentColor = Color.White
                ),
                modifier = Modifier
                    .height(60.dp)) {
                Text("Therian")
            }
            Button(onClick = {},
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Magenta,
                    contentColor = Color.White
                ),
                modifier = Modifier
                    .height(60.dp)) {
                Text("Furro")
            }
        }

        Spacer(modifier = Modifier.weight(1f))

        Row(
            modifier = Modifier
                .padding(vertical = 20.dp)
                .fillMaxWidth()
        ) {
            Image(
                painterResource(R.drawable.loc_dog),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp, vertical = 50.dp)
                    .border(2.dp, Color.White, RoundedCornerShape(12.dp)),
                contentScale = ContentScale.Crop,
            )
        }

        Spacer(modifier = Modifier.weight(1f))

        Row(
            modifier = Modifier
                .padding(vertical = 20.dp)
                .fillMaxWidth()
        ) {
            Button(
                onClick = {}, modifier = Modifier
                    .padding(horizontal = 50.dp)
                    .fillMaxWidth()
                    .height(60.dp)
            ) {
                Text("Hola")
            }
        }
    }
}