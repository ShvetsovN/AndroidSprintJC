package com.example.androidsprintjc

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.androidsprintjc.ui.navigation.BottomNavItem
import com.example.androidsprintjc.ui.navigation.RecipesBottomNavigation
import com.example.androidsprintjc.ui.theme.AndroidSprintJCTheme

@Composable
@Preview(showSystemUi = true)
fun RecipeApp() {
    val currentNavItem = remember { mutableStateOf(BottomNavItem.CATEGORIES) }
    AndroidSprintJCTheme {
        Scaffold(
            modifier = Modifier.fillMaxSize(),
            containerColor = MaterialTheme.colorScheme.background,
            bottomBar = {
                RecipesBottomNavigation(
                    currentNavItem = currentNavItem.value,
                    onNavItemClick = {
                        currentNavItem.value = it
                    })
            }
        ) { innerPadding ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                when (currentNavItem.value) {
                    BottomNavItem.CATEGORIES -> {
                        TestScreen(title = BottomNavItem.CATEGORIES.title, color = Color.Red)
                    }

                    BottomNavItem.RECIPES -> {
                        TestScreen(title = BottomNavItem.RECIPES.title, color = Color.Green)
                    }

                    BottomNavItem.FAVORITES -> {
                        TestScreen(title = BottomNavItem.FAVORITES.title, color = Color.Blue)
                    }
                }
            }
        }
    }
}

@Composable
fun TestScreen(
    title: String,
    color: Color
) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = title,
            fontSize = 24.sp,
            color = color
        )
    }
}
