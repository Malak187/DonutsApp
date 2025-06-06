package com.example.donutsapp.ui.home_screen.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.donutsapp.R
import com.example.donutsapp.ui.theme.Inter
import com.example.donutsapp.ui.theme.OnSurfacePink

@Composable
fun OfferCard(
    boxColor: Color,
    donutImage: Int,
    donutName: String,
    donutDescription: String,
    donutOldPrice: String,
    donutNewPrice: String,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .width(190.dp)
            .height(316.dp)
            .background(Color.Transparent)
    ) {
        Box(
            modifier = modifier
                .matchParentSize()
                .clip(RoundedCornerShape(20.dp))
                .background(boxColor)
        ) {
            Column(
                modifier = Modifier
                    .padding(15.dp)
            ) {

                Spacer(modifier = Modifier.height(160.dp))
                Text(
                    text = donutName,
                    color = Color.Black,
                    fontFamily = Inter,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier.padding(top = 10.dp)
                )

                Text(
                    text = donutDescription,
                    color = Color.Black.copy(alpha = 0.6f),
                    fontFamily = Inter,
                    fontSize = 12.sp,
                    lineHeight = 16.sp,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier.padding(top = 9.dp)
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.End,
                    verticalAlignment = Alignment.Bottom,
                ) {
                    Text(
                        text = donutOldPrice,
                        color = Color.Black.copy(alpha = 0.6f),
                        fontFamily = Inter,
                        fontSize = 14.sp,
                        fontWeight = FontWeight.SemiBold,
                        textDecoration = TextDecoration.LineThrough,
                        modifier = Modifier.padding(bottom = 2.dp, end = 5.dp)
                    )
                    Text(
                        text = donutNewPrice,
                        color = Color.Black,
                        fontFamily = Inter,
                        fontSize = 22.sp,
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier.padding(top = 9.dp)
                    )
                }

            }
        }
        Box(
            modifier = Modifier
                .padding(15.dp)

        ) {
            Box(
                modifier = Modifier
                    .clip(CircleShape)
                    .background(Color.White)
                    .padding(8.dp),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    painter = painterResource(R.drawable.ic_heart),
                    contentDescription = null,
                    tint = OnSurfacePink
                )
            }
        }
        Image(
            painter = painterResource(donutImage),
            contentDescription = null,
            modifier = Modifier
                .size(138.dp)
                .align(Alignment.TopEnd)
                .offset(y = 38.dp, x = 38.dp)
        )
    }
    Spacer(modifier = Modifier.width(20.dp))
}

@Preview
@Composable
private fun OfferCardPrev() {
    OfferCard(
        boxColor = Color(0xFFD7E4F6),
        donutImage = R.drawable.donut_offer1,
        donutName = "Strawberry Wheel",
        donutDescription = "These Baked Strawberry Donuts are filled with fresh strawberries...",
        donutOldPrice = "$20",
        donutNewPrice = "$16",

    )
}