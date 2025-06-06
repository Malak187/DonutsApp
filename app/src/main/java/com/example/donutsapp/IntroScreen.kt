package com.example.donutsapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absoluteOffset
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.donutsapp.ui.theme.Inter
import com.example.donutsapp.ui.theme.IntroScreenBgColor
import com.example.donutsapp.ui.theme.OnSurfacePink

@Composable
fun IntroScreen(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .statusBarsPadding()
            .verticalScroll(rememberScrollState())
            .background(IntroScreenBgColor)
    ) {
        Image(
            painter = painterResource(
                R.drawable.intro_bg
            ),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
        )
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Gonuts\nwith\nDonuts",
                fontFamily = Inter,
                fontWeight = FontWeight.Bold,
                lineHeight = 68.sp,
                fontSize = 54.sp,
                color = OnSurfacePink,
                modifier = Modifier.padding(top = 20.dp, start = 40.dp)
            )
            Image(
                painter = painterResource(
                    R.drawable.intro_donut
                ),
                modifier = Modifier
                    .size(width = 180.dp, height = 165.dp)
                    .absoluteOffset(x = 36.dp, y = -(20).dp),
                contentDescription = null,
            )
        }

            Spacer(modifier = Modifier.height(20.dp))
            Text(
                text = "Gonuts with Donuts is a Sri Lanka dedicated food outlets for specialize manufacturing of Donuts in Colombo, Sri Lanka.",
                fontFamily = Inter,
                fontWeight = FontWeight.Medium,
                fontSize = 18.sp,
                color = OnSurfacePink.copy(alpha = 0.7f),
                modifier = Modifier.padding(horizontal = 40.dp)

            )

            Spacer(modifier = Modifier.height(60.dp))


            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 40.dp)
                    .padding(bottom = 46.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(50.dp))
                        .background(Color.White)
                        .clickable { }
                        .padding(vertical = 22.dp),
                    contentAlignment = Alignment.Center,
                ) {
                    Text(
                        text = "Get Started",
                        fontFamily = Inter,
                        fontWeight = FontWeight.SemiBold,
                        fontSize = 20.sp,
                        color = Color.Black
                    )
                }
            }


    }

}

@Preview
@Composable
private fun IntroScreenPrev() {
    IntroScreen()
}