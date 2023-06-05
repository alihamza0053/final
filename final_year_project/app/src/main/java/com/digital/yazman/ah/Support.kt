package com.digital.yazman.ah

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
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
            var white_text by remember {
                mutableStateOf(Color(0xFFFFFFFF))
            }
            var white_bg by remember {
                mutableStateOf(Color(0xFFFFFFFF))
            }
            var purple_bg by remember {
                mutableStateOf(Color(0xFF800080))
            }

            var black_text by remember {
                mutableStateOf(Color(0xFF000000))
            }

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
                        color = Color(0xFFFFFFFF),
                        fontSize = 25.sp,
                        fontFamily = fontFamily,
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier.padding(top = 15.dp, start = 20.dp)
                    )
                    Row(
                        modifier = Modifier.padding(5.dp),
                    ) {
                        Spacer(modifier = Modifier.padding(10.dp))

                        Text(
                            text = "FAQ",
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center,
                            fontFamily = fontFamily,
                            color = white_text,
                            fontWeight = FontWeight.SemiBold,
                            modifier = Modifier
                                .background(purple_bg)
                                .padding(10.dp)
                                .weight(1f)
                                .clickable {
                                    black_text = Color(0xFF000000)
                                    white_text = Color(0xFFFFFFFF)
                                    purple_bg = Color(0xFF800080)
                                    white_bg = Color(0xFFFFFFFF)

                                }
                        )
                        Spacer(modifier = Modifier.padding(10.dp))

                        Text(
                            text = "Contact",
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center,
                            fontFamily = fontFamily,
                            color = black_text,
                            fontWeight = FontWeight.SemiBold,
                            modifier = Modifier
                                .background(white_bg)
                                .padding(10.dp)
                                .weight(1f)
                                .clickable {
                                    black_text = Color(0xFFFFFFFF)
                                    white_text = Color(0xFF000000)
                                    purple_bg = Color(0xFFFFFFFF)
                                    white_bg = Color(0xFF800080)

                                }
                        )
                        Spacer(modifier = Modifier.padding(10.dp))


                    }
                }
            }
        }
    }
}
