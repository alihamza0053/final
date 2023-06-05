package com.digital.yazman.ah

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.digital.yazman.ah.ui.theme.DigitalYazmanTheme

class Support : ComponentActivity() {
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
            val context = LocalContext.current
            DigitalYazmanTheme {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color(0xFFADD8E6))
                        .verticalScroll(rememberScrollState())


                ) {
                    //business start
                    Text(
                        text = "Support",
                        color = Color(0xFF000000),
                        fontSize = 25.sp,
                        fontFamily = fontFamily,
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier.padding(top = 15.dp, start = 20.dp)
                    )
                    Row(
                        modifier = Modifier
                            .background(Color.White),
                    ) {
                        Text(
                            text = "FAQ",
                        )

                        Text(text = "Contact")

                    }
                }
            }
        }
    }
}
