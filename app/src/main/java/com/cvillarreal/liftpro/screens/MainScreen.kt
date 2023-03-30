package com.cvillarreal.liftpro.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.cvillarreal.liftpro.navigation.BottomNavScreens
import com.cvillarreal.liftpro.navigation.BottomNav
import com.cvillarreal.liftpro.navigation.MainScreenNavigationConfigurations

@Composable
fun MainScreen() {
    val navController = rememberNavController()

    val navItems = listOf(
        BottomNavScreens.Home,
        BottomNavScreens.Exercise,
        BottomNavScreens.Workout,
        BottomNavScreens.Plan
    )

    Scaffold(
        bottomBar = {
            BottomNav(navController = navController, navItems = navItems)
        }
    ) { contentPadding ->
        Box(modifier = Modifier.padding(contentPadding)) {
            MainScreenNavigationConfigurations(navController = navController)
        }
    }
}