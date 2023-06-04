package com.digital.yazman.ah

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.digital.yazman.ah.ui.theme.DigitalYazmanTheme

class History : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val fontFamily = FontFamily(
                Font(R.font.lexend_black, FontWeight.Bold),
                Font(R.font.lexend_bold, FontWeight.Bold),
                Font(R.font.lexend_extrabold, FontWeight.ExtraBold),
                Font(R.font.lexend_light, FontWeight.Light),
                Font(R.font.lexend_medium, FontWeight.Medium),
                Font(R.font.lexend_extralight, FontWeight.ExtraLight),
                Font(R.font.lexend_regular, FontWeight.Normal),
                Font(R.font.lexend_semibold, FontWeight.SemiBold),
                Font(R.font.lexend_thin, FontWeight.Thin),
            )
            DigitalYazmanTheme {
                // A surface container using the 'background' color from the theme
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
                    Text(text = stringResource(id = R.string.history_1),
                        fontSize = 16.sp,
                        fontFamily = fontFamily,
                        fontWeight = FontWeight.Light,
                        modifier = Modifier.padding(top = 10.dp, start = 20.dp, end = 15.dp),
                        textAlign = TextAlign.Justify
                    )
                    Image(painter = painterResource(id = R.drawable.yazman_img1), contentDescription =null,
                    modifier = Modifier
                        .padding(top = 5.dp, start = 20.dp, end = 15.dp))
                    Text(text = stringResource(id = R.string.history_2),
                        fontSize = 16.sp,
                        fontFamily = fontFamily,
                        fontWeight = FontWeight.Light,
                        modifier = Modifier.padding(top = 5.dp, start = 20.dp, end = 15.dp),
                        textAlign = TextAlign.Justify
                    )
                    Text(text = stringResource(id = R.string.history_3),
                        fontSize = 16.sp,
                        fontFamily = fontFamily,
                        fontWeight = FontWeight.Light,
                        modifier = Modifier.padding(top = 5.dp, start = 20.dp, end = 15.dp),
                        textAlign = TextAlign.Justify
                    )
                    Image(painter = painterResource(id = R.drawable.yazman_img2), contentDescription =null,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 5.dp, start = 20.dp, end = 15.dp))
                    Text(text = stringResource(id = R.string.history_4),
                        fontSize = 16.sp,
                        fontFamily = fontFamily,
                        fontWeight = FontWeight.Light,
                        modifier = Modifier.padding(top = 5.dp, start = 20.dp, end = 15.dp),
                        textAlign = TextAlign.Justify
                    )
                    Text(text = stringResource(id = R.string.history_5),
                        fontSize = 16.sp,
                        fontFamily = fontFamily,
                        fontWeight = FontWeight.Light,
                        modifier = Modifier.padding(top = 5.dp, start = 20.dp, end = 15.dp, bottom = 10.dp),
                        textAlign = TextAlign.Justify
                    )

                }
            }
        }
    }
}

