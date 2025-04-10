package com.example.androidsprintjc.ui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.vector.ImageVector

enum class BottomNavItem(title: String, icon: ImageVector) {
    CATEGORIES(title = "Категории", icon = Icons.Filled.Menu),
    RECIPES(title = "Рецепты", icon = Icons.Filled.Search),
    FAVORITES(title = "Избранное", icon = Icons.Filled.Favorite),
}