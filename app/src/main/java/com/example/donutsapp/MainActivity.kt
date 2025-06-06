package com.example.donutsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.donutsapp.ui.home_screen.HomeScreen
import com.example.donutsapp.ui.home_screen.components.BottomNavigationIcon
import com.example.donutsapp.ui.home_screen.components.BottomNavigationRow
import com.example.donutsapp.ui.payment_screen.PaymentScreen
import com.example.donutsapp.ui.theme.DonutsAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DonutsAppTheme {
//                Scaffold(
//                    modifier = Modifier
//                        .navigationBarsPadding()
//                        .fillMaxSize(),
//                    bottomBar = {
//                        BottomNavigationRow()
//                    }) { paddingValues ->
//
//                    HomeScreen(modifier = Modifier.padding(paddingValues))
//                }
                IntroScreen()
            }
        }
    }
}

