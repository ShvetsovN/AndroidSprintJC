package com.example.androidsprintjc.ui.navigation

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun RecipesBottomNavigation(
    currentNavItem: BottomNavItem,
    onNavItemClick: (BottomNavItem) -> Unit
) {
    val items = BottomNavItem.entries.toList()
    NavigationBar {
        items.forEach { item ->
            NavigationBarItem(
                icon = {
                    Icon(imageVector = item.icon, contentDescription = item.title)
                },
                selected = currentNavItem == item,
                onClick = { onNavItemClick(item) },
                label = { Text(text = item.name) },
            )
        }
    }
}

