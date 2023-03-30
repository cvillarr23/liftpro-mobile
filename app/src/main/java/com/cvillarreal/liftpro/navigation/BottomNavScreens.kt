package com.cvillarreal.liftpro.navigation

import androidx.compose.ui.graphics.painter.Painter

import androidx.compose.ui.res.painterResource
import com.cvillarreal.liftpro.R


sealed class BottomNavScreens(var title: String, var icon: Int, var screen_route: String) {
    object Home : BottomNavScreens("Home", R.drawable.home_fill0_wght400_grad0_opsz48, "home")
    object Exercise : BottomNavScreens("Exercise", R.drawable.account_circle_fill0_wght400_grad0_opsz48, "exercise")
    object Workout : BottomNavScreens("Workout", R.drawable.exercise_fill0_wght400_grad0_opsz48, "workout")
    object Plan : BottomNavScreens("Plan", R.drawable.monitoring_fill0_wght400_grad0_opsz48, "plan")
}