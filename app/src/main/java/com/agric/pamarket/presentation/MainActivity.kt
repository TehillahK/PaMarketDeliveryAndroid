package com.agric.pamarket.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.agric.pamarket.presentation.navigation.SetupNavGraph


class MainActivity : ComponentActivity() {
    lateinit var navController: NavHostController;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            navController = rememberNavController()
            SetupNavGraph(navHostController = navController)
        }
    }
}

