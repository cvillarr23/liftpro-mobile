package com.cvillarreal.liftpro.navigation

import android.graphics.drawable.Icon
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem

import androidx.compose.material.Text
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController

@Composable
fun BottomNav(navController: NavHostController, navItems: List<BottomNavScreens>) {
    // TODO: Switch to Material3 NavigationBar
    BottomNavigation(
        backgroundColor = MaterialTheme.colorScheme.primaryContainer
    ) {
        val currentRoute = navController.currentBackStackEntry?.destination?.route
        navItems.forEach {
            BottomNavigationItem(
                icon = { painterResource(id = it.icon) },
                label = { Text(it.title) },
                selected = currentRoute == it.screen_route,
                onClick = {
                    if (currentRoute != it.screen_route) {
                        navController.navigate(it.screen_route)
                    }
                },
            )
        }
        val backgroundColor = MaterialTheme.colorScheme.primaryContainer
    }

}