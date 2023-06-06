package com.digital.yazman.ah

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.digital.yazman.ah.ui.theme.DigitalYazmanTheme

class Transport : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DigitalYazmanTheme {
                // A surface container using the 'background' color from the theme
                MainColumn()


            }
        }
    }
}

@Composable
fun MainColumn() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFADD8E6))
            .verticalScroll(rememberScrollState())

    ) {
        Text(
            text = "Yazman Mandi",
            color = Color(0xFF000000),
            fontSize = 25.sp,
            fontFamily = fontFamily,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier.padding(top = 15.dp, start = 20.dp)
        )
        Bus()
    }

}

@Composable
fun Bus() {
    Column(
        modifier = Modifier
            .padding(20.dp)
            .fillMaxWidth()
            .background(Color.White)
    ) {
        Row(
            modifier = Modifier
                .padding(start = 20.dp, top = 5.dp, end = 20.dp, bottom = 5.dp)
        ) {
            Text(
                text = "Faisal Movers",
                fontFamily = fontFamily,
                fontWeight = FontWeight.Normal,
                fontSize = 15.sp
            )
            Spacer(modifier = Modifier.weight(1f))
            Text(
                text = "03065600053",
                fontFamily = fontFamily,
                fontWeight = FontWeight.Normal,
                fontSize = 15.sp
            )
        }
        Spacer(
            modifier = Modifier
                .background(Color(0xFFADD8E6))
                .fillMaxWidth()
                .height(2.dp)
        )
        Row(
            modifier = Modifier
                .padding(start = 20.dp, top = 5.dp, end = 20.dp, bottom = 5.dp)
        ) {
            Column(
                modifier = Modifier
                    .padding(end = 20.dp)
            ) {
                Text(
                    text = "12:00pm",
                    fontFamily = fontFamily,
                    fontWeight = FontWeight.Medium,
                    fontSize = 18.sp,
                    modifier = Modifier
                        .padding(bottom = 15.dp)
                )
                Text(
                    text = "3:00pm",
                    fontFamily = fontFamily,
                    fontWeight = FontWeight.Medium,
                    fontSize = 18.sp
                )
            }
            Image(
                painter = painterResource(id = R.drawable.circles),
                contentDescription = null,
                modifier = Modifier
                    .width(55.dp)
                    .height(55.dp)
                    .padding(top = 4.dp)
            )
            Column {
                Text(
                    text = "Yazman",
                    fontFamily = fontFamily,
                    fontWeight = FontWeight.Medium,
                    fontSize = 18.sp,
                    modifier = Modifier
                        .padding(bottom = 15.dp)
                )
                Text(
                    text = "Multan",
                    fontFamily = fontFamily,
                    fontWeight = FontWeight.Medium,
                    fontSize = 18.sp
                )
            }
        }
        Spacer(
            modifier = Modifier
                .background(Color(0xFFADD8E6))
                .fillMaxWidth()
                .height(2.dp)
        )
        Row(
            modifier = Modifier
                .padding(start = 20.dp, top = 5.dp, end = 20.dp, bottom = 5.dp)
        ) {
            Text(
                text = "12km",
                fontFamily = fontFamily,
                fontWeight = FontWeight.Normal,
                fontSize = 15.sp
            )
            Spacer(modifier = Modifier.weight(1f))
            Text(
                text = "Time 3 hours",
                fontFamily = fontFamily,
                fontWeight = FontWeight.Normal,
                fontSize = 15.sp
            )
        }
    }
}
