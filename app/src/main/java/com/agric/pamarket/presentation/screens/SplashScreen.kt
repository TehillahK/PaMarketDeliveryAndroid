package com.agric.pamarket.presentation.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun SplashScreen(){
    Box(
     modifier = Modifier.fillMaxSize(),
     contentAlignment = Alignment.Center
    ){
     Text(
         text = "Welcome",
         fontSize = MaterialTheme.typography.h3.fontSize,
         fontWeight = FontWeight.Bold

     )
 }

}

@Composable
@Preview(showBackground = true)
fun SplashScreenPreview(){
    SplashScreen()
}