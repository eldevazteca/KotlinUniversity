package com.eldevazteca.primeraappcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.eldevazteca.primeraappcompose.composables.AddCoffee
import com.eldevazteca.primeraappcompose.composables.HomeWorkScreen
import com.eldevazteca.primeraappcompose.composables.ListArticles
import com.eldevazteca.primeraappcompose.composables.PantallaPerfil
import com.eldevazteca.primeraappcompose.ui.theme.PrimeraAppComposeTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PrimeraAppComposeTheme {
                //? Vista inicial de la division de vistas verticalmente
                // PantallaPerfil(modifier = Modifier)

                //? Vista de tarea -> Pantalla de seleccion
                Scaffold() { innerPadding ->
                    HomeWorkScreen(modifier = Modifier.padding(innerPadding))
                }

                //? Vista del boton de sumatoria de cafes
                // AddCoffee(modifier = Modifier)

                //? Vista de la creacion de cards en lista
                // ListArticles()
            }
        }
    }
}