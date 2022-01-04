package com.agric.pamarket.presentation.navigation

sealed class Screen(val route: String){
    object Splash : Screen(route = "splash_screen")
    object Login: Screen(route = "login_screen")
}
