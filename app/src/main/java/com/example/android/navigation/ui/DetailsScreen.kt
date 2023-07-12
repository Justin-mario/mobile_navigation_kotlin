package com.example.android.navigation.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun DetailsScreen(navController: NavController,name: String?) {
    Box(contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()) {
        Text(text = "Hello, $name")

        Button(onClick = {
            navController.navigate(Screen.MainScreen.route)
        },
            modifier = Modifier.align(Alignment.BottomCenter)) {
            Text(text = "To HomeScreen")
        }
    }

}