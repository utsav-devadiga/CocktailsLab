package com.applabs.cocktailslab

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.applabs.cocktailslab.ui.theme.CocktailsLabTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CocktailsLabTheme {
                // A surface container using the 'background' color from the theme
            }
        }
    }
}