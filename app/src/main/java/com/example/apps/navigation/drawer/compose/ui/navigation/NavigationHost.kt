package com.example.apps.navigation.drawer.compose.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.apps.navigation.drawer.compose.ui.screens.HomeScreen
import com.example.apps.navigation.drawer.compose.ui.screens.ProfileScreen
import com.example.apps.navigation.drawer.compose.ui.screens.SettingScreen

@Composable
fun NavigationHost(
    navController: NavHostController
) {
    NavHost(navController = navController, startDestination = Destinations.HomeScreen.route) {
        composable(Destinations.HomeScreen.route) {
            HomeScreen()
        }
        composable(Destinations.ProfileScreen.route) {
            ProfileScreen()
        }
        composable(Destinations.SettingScreen.route) {
            SettingScreen()
        }
    }
}