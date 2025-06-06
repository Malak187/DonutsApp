package com.example.donutsapp.ui.payment_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.donutsapp.R
import com.example.donutsapp.ui.payment_screen.components.DonutImageCard
import com.example.donutsapp.ui.payment_screen.components.PaymentCardContent
import com.example.donutsapp.ui.theme.IntroScreenBgColor
import com.example.donutsapp.ui.theme.OnSurfacePink

@Composable
fun PaymentScreen(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .background(IntroScreenBgColor)
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        DonutImageCard()


        Box(
            modifier = Modifier
                .background(Color(0xFFF9F9F9))
                .offset(y = -(72).dp)
                .fillMaxSize()
        ) {
            Column(
                modifier = Modifier
                    .clip(RoundedCornerShape(topStart = 40.dp, topEnd = 40.dp))
                    .background(Color(0xFFF9F9F9))
                    .padding(top = 35.dp)
                    .padding(horizontal = 40.dp)
                    .fillMaxSize()
            ) {
                PaymentCardContent()

            }


            Box(
                modifier = Modifier.padding(16.dp)
                    .align(Alignment.TopEnd)
                    .offset(y=-(32).dp,x=(-12).dp)
            ) {
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(15.dp))
                        .size(45.dp)
                        .clickable {  }

                        .background(Color.White)
                        .align(Alignment.TopEnd)
                        .padding(8.dp),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        painter = painterResource(R.drawable.ic_heart),
                        contentDescription = null,
                        tint = OnSurfacePink,
                        modifier = Modifier.size(24.dp)
                    )
                }
            }
        }
    }
}

@Preview
@Composable
private fun PaymentScreenPrev() {
    PaymentScreen()
}