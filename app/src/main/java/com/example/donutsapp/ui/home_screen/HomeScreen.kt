package com.example.donutsapp.ui.home_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.donutsapp.R
import com.example.donutsapp.ui.home_screen.components.DonutCard
import com.example.donutsapp.ui.home_screen.components.HomeScreenHeader
import com.example.donutsapp.ui.home_screen.components.OfferCard
import com.example.donutsapp.ui.theme.Inter

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .background(Color(0xFFFCFCFC))
            .statusBarsPadding()
            .verticalScroll(rememberScrollState())
            .padding(top = 81.dp)
    ) {
        HomeScreenHeader()
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFF9F9F9))
        ) {
            Text(
                text = stringResource(R.string.today_offers),
                fontFamily = Inter,
                fontWeight = FontWeight.SemiBold,
                fontSize = 20.sp,
                color = Color.Black,
                modifier = Modifier.padding(top = 54.dp, bottom = 25.dp, start = 40.dp)
            )
            LazyRow(
                contentPadding = PaddingValues(horizontal = 40.dp),
                horizontalArrangement = Arrangement.spacedBy(20.dp)
            ) {
                items(donutOffers) { item ->
                    OfferCard(
                        boxColor = item.boxColor,
                        donutImage = item.donutImage,
                        donutName = item.donutName,
                        donutDescription = item.donutDescription,
                        donutOldPrice = item.donutOldPrice,
                        donutNewPrice = item.donutNewPrice
                    )
                }
            }

            Text(
                text = stringResource(R.string.donuts),
                fontFamily = Inter,
                fontWeight = FontWeight.SemiBold,
                fontSize = 20.sp,
                color = Color.Black,
                modifier = Modifier.padding(top = 46.dp, bottom = 52.dp, start = 40.dp)
            )

            LazyRow(
                contentPadding = PaddingValues(horizontal = 40.dp),
                horizontalArrangement = Arrangement.spacedBy(20.dp)
            ) {
                items(donuts) { item ->
                    DonutCard(
                        donutImage = item.donutImage,
                        donutName = item.donutName,
                        donutPrice = item.donutPrice
                    )
                }
            }

        }
    }

}

@Preview
@Composable
private fun HomeScreenPrev() {
    HomeScreen()
}