package com.example.donutsapp.ui.payment_screen.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.donutsapp.R
import com.example.donutsapp.ui.theme.OnSurfacePink

@Composable
fun DonutImageCard(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxWidth()
    ) {
        Icon(
            painter = painterResource(R.drawable.arrow),
            contentDescription = null,
            tint = OnSurfacePink,
            modifier = Modifier
                .clickable { }
                .padding(start = 32.dp, top = 45.dp)
                .size(width = 12.dp, height = 24.dp)
        )

        Image(
            painter = painterResource(R.drawable.im_donut),
            contentScale = ContentScale.Crop,
            contentDescription = null,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .size(400.dp)
                .offset(y= -(48.dp))
        )
    }
}

@Preview
@Composable
private fun DonutImageCardPrev() {
    DonutImageCard()
}