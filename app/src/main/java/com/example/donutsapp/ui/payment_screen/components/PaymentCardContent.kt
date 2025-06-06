package com.example.donutsapp.ui.payment_screen.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.donutsapp.R
import com.example.donutsapp.ui.theme.Inter
import com.example.donutsapp.ui.theme.OnSurfacePink

@Composable
fun PaymentCardContent(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
    ) {
        Text(
            text = "Strawberry Wheel",
            fontFamily = Inter,
            color = OnSurfacePink,
            fontSize = 30.sp,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier.padding(bottom = 33.dp)
        )
        Text(
            text = "About Gonut",
            fontFamily = Inter,
            color = Color.Black.copy(alpha = 0.8f),
            fontSize = 18.sp,
            fontWeight = FontWeight.Medium,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        Text(
            text = "These soft, cake-like Strawberry Frosted Donuts feature fresh strawberries and a delicious fresh strawberry glaze frosting. Pretty enough for company and the perfect treat to satisfy your sweet tooth.",
            fontFamily = Inter,
            color = Color.Black.copy(alpha = 0.6f),
            fontSize = 14.sp,
            lineHeight = 18.sp,
            fontWeight = FontWeight.Normal,
            modifier = Modifier.padding(bottom = 26.dp)
        )
        Text(
            text = "Quantity",
            fontFamily = Inter,
            color = Color.Black.copy(alpha = 0.8f),
            fontSize = 18.sp,
            fontWeight = FontWeight.Medium,
            modifier = Modifier.padding(bottom = 19.dp)
        )
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 45.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(20.dp)
        ){
            PaymentBox()
            PaymentBox(isIcon = false)

            PaymentBox(icon = R.drawable.plus, isBlack = true)

        }

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(26.dp)
        ){
            Text(
                text = "£16",
                fontFamily = Inter,
                fontWeight = FontWeight.SemiBold,
                color = Color.Black,
                fontSize = 30.sp,
            )
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(66.dp)
                    .clip(RoundedCornerShape(50.dp))
                    .clickable {  }
                    .background(OnSurfacePink)
                    .padding(vertical = 22.dp),
                contentAlignment = Alignment.Center
            ){
                Text(
                    text = "Add to Cart",
                    fontFamily = Inter,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.White,
                )

            }
        }

    }

}

@Composable
fun PaymentBox(
    isBlack: Boolean = false,
    isIcon: Boolean = true,
    icon: Int = R.drawable.minus,
    modifier: Modifier = Modifier
) {

    Box(
        modifier = modifier
            .clip(RoundedCornerShape(15.dp))
            .size(45.dp)
            .background(if (isBlack) Color.Black else Color.White)
            .padding(10.dp),
        contentAlignment = Alignment.Center
    ) {
        if (isIcon) {
            Icon(
                painter = painterResource(icon),
                contentDescription = null,
                tint = if (isBlack) Color.White else Color.Black,
            )
        } else {
            Text(
                text = "1",
                fontFamily = Inter,
                fontSize = 22.sp,
                fontWeight = FontWeight.Medium,
                color = Color.Black,
                modifier = Modifier.padding(bottom = 2.dp)
            )
        }

    }
}

@Preview
@Composable
private fun PaymentCardContentPrev() {
    PaymentCardContent(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xfff3f3f3))
    )
}