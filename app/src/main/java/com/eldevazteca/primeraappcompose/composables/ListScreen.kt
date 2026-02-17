package com.eldevazteca.primeraappcompose.composables

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.eldevazteca.primeraappcompose.data.Articulo
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.res.painterResource
import com.eldevazteca.primeraappcompose.R

@ExperimentalMaterial3Api
@Composable
fun ListArticles() {
    val articulos = remember { mutableStateListOf<Articulo>() }
    var showDialog by remember { mutableStateOf(false) }
    var temporalText by remember { mutableStateOf("") }

    if (showDialog) {
        AlertDialog(onDismissRequest = { showDialog = false }, title = { Text("Agregar Articulo") }, text = {
            TextField(
                value = temporalText, onValueChange = { temporalText = it })
        },
            confirmButton = {
                Button(
                    onClick = {
                        articulos.add(Articulo(nombre = temporalText))
                        showDialog = false
                        temporalText = ""
                    }) {
                    Text("Agregar")
                }
            }
        )
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Mi lista de compras")}
            )
        },
        floatingActionButton = {
            FloatingActionButton(onClick = { showDialog = true }) {
                Icon(imageVector = Icons.Default.Add, contentDescription = null)
            }
        }
    ) {paddingValues ->
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            contentPadding = paddingValues
        ) {
            items (count = articulos.size) {articulo ->
                ElementCard(articulos[articulo])
            }
        }
    }
}