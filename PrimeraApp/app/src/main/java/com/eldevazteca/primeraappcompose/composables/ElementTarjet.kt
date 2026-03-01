package com.eldevazteca.primeraappcompose.composables

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.eldevazteca.primeraappcompose.data.Articulo

@Composable
fun ElementCard(articulo: Articulo) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .height(150.dp)
    ) {
        Text(
            articulo.nombre,
            style = MaterialTheme.typography.titleLarge )
    }
}