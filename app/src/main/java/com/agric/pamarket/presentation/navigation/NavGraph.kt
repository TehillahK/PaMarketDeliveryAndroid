package com.agric.pamarket.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.agric.pamarket.presentation.navigation.Screen

import com.agric.pamarket.presentation.screens.*



@Composable
fun SetupNavGraph(navHostController: NavHostController) {
    NavHost(navController = navHostController , startDestination = Screen.Splash.route ){
        composable(
            route = Screen.Splash.route,

        ){
            SplashScreen()
        }
        composable(
            route = Screen.Login.route,
        ){
            LoginScreen()
        }

    }

}