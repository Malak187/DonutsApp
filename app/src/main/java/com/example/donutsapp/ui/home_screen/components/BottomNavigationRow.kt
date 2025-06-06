package com.example.donutsapp.ui.home_screen.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.donutsapp.R
import com.example.donutsapp.ui.theme.OnSurfacePink

@Composable
fun BottomNavigationRow(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .padding(top = 12.dp)
            .padding(bottom = 36.dp)
            .padding(horizontal = 40.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = androidx.compose.ui.Alignment.CenterVertically
    ) {
        BottomNavigationIcon(
            icon = R.drawable.ic_home,
            modifier = Modifier.size(30.dp).weight(1f)
        )
        BottomNavigationIcon(
            icon = R.drawable.ic_fav,
            modifier = Modifier.weight(1f)

        )
        BottomNavigationIcon(
            icon = R.drawable.ic_notification,
            modifier = Modifier.weight(1f)

        )
        BottomNavigationIcon(
            icon = R.drawable.buy,
            modifier = Modifier.size(40.dp).weight(1f)

        )
        BottomNavigationIcon(
            icon = R.drawable.ic_profile,
            modifier = Modifier.weight(1f)
        )

    }
}