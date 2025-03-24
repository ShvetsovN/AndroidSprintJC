package com.example.androidsprintjc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androidsprintjc.ui.theme.AndroidSprintJCTheme
import com.example.androidsprintjc.ui.theme.recipesAppTypography

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidSprintJCTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    containerColor = MaterialTheme.colorScheme.background
                ) { innerPadding ->
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = "onBackground Text",
                            color = MaterialTheme.colorScheme.onBackground
                        )
                        Rainbow()
                    }

                }
            }
        }
    }
}

@Composable
@Preview
fun Rainbow() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CustomButton(
            buttonColors = ButtonDefaults.buttonColors(MaterialTheme.colorScheme.primary),
            "Primary Text",
            MaterialTheme.colorScheme.onPrimary
        )
        CustomButton(
            buttonColors = ButtonDefaults.buttonColors(MaterialTheme.colorScheme.error),
            "Error Text",
            MaterialTheme.colorScheme.onError
        )
        CustomButton(
            buttonColors = ButtonDefaults.buttonColors(MaterialTheme.colorScheme.tertiary),
            "Tertiary Text",
            MaterialTheme.colorScheme.onTertiary
        )
        CustomButton(
            buttonColors = ButtonDefaults.buttonColors(MaterialTheme.colorScheme.surface),
            "Surface Text",
            MaterialTheme.colorScheme.onSurface
        )
        CustomButton(
            buttonColors = ButtonDefaults.buttonColors(MaterialTheme.colorScheme.surfaceContainer),
            "SurfaceVariable Text",
            MaterialTheme.colorScheme.onSurface
        )
    }
}

@Composable
fun CustomButton(
    buttonColors: ButtonColors,
    title: String,
    textColor: Color
){
    Button(
        onClick = {},
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        colors = buttonColors
    ) {
        Text(
            text = title,
            color = textColor
        )
    }
    Spacer(modifier = Modifier.height(8.dp))
}