package com.cvillarreal.liftpro.navigation

sealed class BottomNavItem(var title: String, var icon: Int, var screen_route: String) {
    object Home : BottomNavItem("Home", android.R.drawable.ic_menu_home, "home")
    object Exercise : BottomNavItem("Exercise", android.R.drawable.ic_menu_search, "exercise")
    object Workout : BottomNavItem("Workout", android.R.drawable.ic_menu_search, "workout")
    object Stats : BottomNavItem("Stats", android.R.drawable.ic_menu_search, "stats")
    object Settings : BottomNavItem("Settings", android.R.drawable.ic_menu_search, "settings")
}