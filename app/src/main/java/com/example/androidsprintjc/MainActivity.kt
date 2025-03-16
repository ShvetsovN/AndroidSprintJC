package com.example.androidsprintjc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import com.example.androidsprintjc.ui.theme.AndroidSprintJCTheme
import com.example.androidsprintjc.ui.theme.recipesAppTypography

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidSprintJCTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding)
                    ) {
                        Text(
                            text = "БУРГЕР С ГРИБАМИ 1 (titleLarge)",
                            style = recipesAppTypography.titleLarge
                        )
                        Text(
                            text = "ИНГРЕДИЕНТЫ 2 (titleMedium)",
                            style = recipesAppTypography.titleMedium
                        )
                        Text(
                            text = "Порции 3 (titleSmall)",
                            style = recipesAppTypography.titleSmall
                        )
                        Text(
                            text = "Вы еще не добавили ни... 1 (bodyLarge)",
                            style = recipesAppTypography.bodyLarge
                        )
                        Text(
                            text = "В то время как котлеты..., 2 (bodyMedium)",
                            style = recipesAppTypography.bodyMedium
                        )
                        Text(
                            text = "КАТЕГОРИИ 1 (labelLarge)",
                            style = recipesAppTypography.labelLarge
                        )
                    }
                }
            }
        }
    }
}