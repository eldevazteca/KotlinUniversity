package com.eldevazteca.examenuno

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.animation.togetherWith
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import com.eldevazteca.examenuno.screens.HomeScreen
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import com.eldevazteca.examenuno.screens.ProfileScreen
import com.eldevazteca.examenuno.ui.theme.ExamenUnoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ExamenUnoTheme {
                var currentScreen by rememberSaveable { mutableStateOf("home") }
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    AnimatedContent(
                        targetState = currentScreen,
                        transitionSpec = {
                            if (targetState == "profile") {
                                slideInHorizontally { it }.togetherWith(slideOutHorizontally { -it })
                            } else {
                                slideInHorizontally { -it }.togetherWith(slideOutHorizontally { it })
                            }
                        },
                        label = "screen_transition"
                    ) { targetScreen ->
                        when (targetScreen) {
                            "home" -> HomeScreen(
                                modifier = Modifier.padding(innerPadding),
                                onProfileClick = { currentScreen = "profile" }
                            )
                            "profile" -> ProfileScreen(
                                modifier = Modifier.padding(innerPadding),
                                onBack = { currentScreen = "home" }
                            )
                        }
                    }
                }
            }
        }
    }
}