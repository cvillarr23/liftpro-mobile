package com.cvillarreal.liftpro.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.cvillarreal.liftpro.screens.ExerciseScreen
import com.cvillarreal.liftpro.screens.HomeScreen
import com.cvillarreal.liftpro.screens.PlanScreen
import com.cvillarreal.liftpro.screens.WorkoutScreen

@Composable
fun MainScreenNavigationConfigurations(
    navController: NavHostController
) {
    NavHost(navController, startDestination = BottomNavScreens.Home.screen_route) {
        composable(BottomNavScreens.Home.screen_route) {
            HomeScreen()
        }
        composable(BottomNavScreens.Exercise.screen_route) {
            ExerciseScreen()
        }
        composable(BottomNavScreens.Workout.screen_route) {
            WorkoutScreen()
        }
        composable(BottomNavScreens.Plan.screen_route) {
            PlanScreen()
        }
    }
}