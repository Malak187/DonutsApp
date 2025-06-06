package com.example.donutsapp.ui.home_screen.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun BottomNavigationIcon(
    icon: Int,
    modifier: Modifier = Modifier
) {
    Image(
        painter = painterResource(
            icon
        ),
        contentDescription = null,
        modifier = modifier.size(35.dp)

    )
}