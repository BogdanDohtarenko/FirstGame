package com.ideasapp.firstgame.presentation

import ImageOverlayScreen
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.ideasapp.firstgame.ui.theme.FirstGameTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstGameTheme {
                ImageOverlayScreen()
            }
        }
    }
}