package com.example.apps.navigation.drawer.compose.ui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Destinations(
    val route: String,
    val title: String,
    val icon: ImageVector
) {
    object HomeScreen: Destinations("home_screen","Home",Icons.Filled.Home)
    object ProfileScreen: Destinations("profile_screen","Profile",Icons.Filled.Person)
    object SettingScreen: Destinations("setting_screen","Settings", Icons.Filled.Settings)
}
