package com.example.androidsprintjc.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

private val DarkColorScheme = darkColorScheme(
    primary = Purple80,
    secondary = PurpleGrey80,
    tertiary = Pink80
)

private val LightColorScheme = lightColorScheme(
    primary = Purple40,
    secondary = PurpleGrey40,
    tertiary = Pink40
)

private val RecipesAppLightSchemeColor = lightColorScheme(
    primary = PrimaryColor,
    onPrimary = BackgroundColor,
    error = AccentColor,
    onError = TextPrimaryColor,
    tertiary = AccentBlue,
    onTertiary = TextPrimaryColor,
    background = BackgroundColor,
    onBackground = TextPrimaryColor,
    surface = SurfaceColor,
    onSurface = TextPrimaryColor,
    surfaceVariant = SurfaceColor,
    onSurfaceVariant = TextSecondaryColor,
)

private val RecipesAppDarkSchemeColor = darkColorScheme(
    primary = PrimaryColorDark,
    onPrimary = BackgroundColorDark,
    error = AccentColorDark,
    onError = TextPrimaryColorDark,
    tertiary = AccentBlueDark,
    onTertiary = TextPrimaryColorDark,
    background = BackgroundColorDark,
    onBackground = TextPrimaryColorDark,
    surface = SurfaceColorDark,
    onSurface = TextPrimaryColorDark,
    surfaceVariant = SurfaceVariantColorDark,
    onSurfaceVariant = TextSecondaryColorDark,
)

@Composable
fun AndroidSprintJCTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> RecipesAppDarkSchemeColor
        else -> RecipesAppLightSchemeColor
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = recipesAppTypography,
        content = content
    )
}