package com.example.donutsapp.ui.home_screen.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.donutsapp.R
import com.example.donutsapp.ui.theme.Inter
import com.example.donutsapp.ui.theme.OnSurfacePink

@Composable
fun DonutCard(
    donutImage: Int,
    donutName: String,
    donutPrice: String,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier,

        contentAlignment = Alignment.TopCenter

    ) {
        Column(
            modifier = Modifier
                .padding(vertical = 19.dp)
                .clip(
                    RoundedCornerShape(
                        topStart = 20.dp,
                        topEnd = 20.dp,
                        bottomStart = 16.dp,
                        bottomEnd = 16.dp

                    )
                )
                .background(Color.White)
                .padding(
                    top = 48.dp,
                    bottom = 8.dp,
                ),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = donutName,
                fontFamily = Inter,
                fontSize = 14.sp,
                fontWeight = FontWeight.Medium,
                color = Color.Black,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(horizontal = 20.dp),

                )
            Text(
                text = donutPrice,
                fontFamily = Inter,
                fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold,
                color = OnSurfacePink,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(top = 10.dp, bottom = 16.dp)
            )

        }

        Image(
            painter = painterResource(donutImage),
            contentDescription = null,
            contentScale = ContentScale.FillHeight,
            modifier = Modifier.height(100.dp).offset(y=-(30).dp)
        )
    }

}

@Preview
@Composable
private fun DonutCardPrev() {
    DonutCard(
        donutImage = R.drawable.donut1,
        donutName = "Chocolate Cherry",
        donutPrice = "$22"
    )
}