package com.digital.yazman.ah

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.digital.yazman.ah.ui.theme.DigitalYazmanTheme

class Emergency : ComponentActivity() {
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
                        text = "Emergency",
                        color = Color(0xFF000000),
                        fontSize = 25.sp,
                        fontFamily = fontFamily,
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier.padding(top = 15.dp, start = 20.dp)
                    )
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(top = 40.dp),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.sos),
                            contentDescription = null,
                            modifier = Modifier
                                .width(200.dp)
                                .height(200.dp)
                                .padding(bottom = 20.dp),

                        )


                        //first row with 2 cards
                        Row(
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            //first row first card
                            Card(
                                elevation = 6.dp,
                                backgroundColor = Color(0xFFFFFFFF),
                                modifier = Modifier
                                    .padding(20.dp)
                                    .weight(1f)
                            ) {
                                Column(
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.Center,
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(100.dp)
                                        .weight(1f)
                                        .clickable {
                                            Toast
                                                .makeText(
                                                    applicationContext,
                                                    "Ambulance",
                                                    Toast.LENGTH_SHORT
                                                )
                                                .show()
                                        },

                                    ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.agriculture),
                                        contentDescription = null,
                                        modifier = Modifier
                                            .height(50.dp)
                                            .width(50.dp)
                                    )
                                    Text(
                                        text = "Ambulance",
                                        color = Color.Black,
                                        fontSize = 15.sp,
                                        fontFamily = fontFamily,
                                        fontWeight = FontWeight.Light,
                                        modifier = Modifier.padding(top = 10.dp)
                                    )
                                }
                            }

                            //first row second card
                            Card(
                                elevation = 6.dp,
                                backgroundColor = Color(0xFFFFFFFF),
                                modifier = Modifier
                                    .padding(20.dp)
                                    .weight(1f)
                            ) {
                                Column(
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.Center,
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(100.dp)
                                        .weight(1f)
                                        .clickable {
                                            Toast
                                                .makeText(
                                                    applicationContext,
                                                    "Child Protection",
                                                    Toast.LENGTH_SHORT
                                                )
                                                .show()
                                        },

                                    ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.aluminium),
                                        contentDescription = null,
                                        modifier = Modifier
                                            .height(50.dp)
                                            .width(50.dp)
                                    )
                                    Text(
                                        text = "Child Protection",
                                        color = Color.Black,
                                        fontSize = 15.sp,
                                        fontFamily = fontFamily,
                                        fontWeight = FontWeight.Light,
                                        modifier = Modifier.padding(top = 10.dp)
                                    )
                                }
                            }
                        }

                        //second row with 2 cards
                        Row(
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            //second row first card
                            Card(
                                elevation = 6.dp,
                                backgroundColor = Color(0xFFFFFFFF),
                                modifier = Modifier
                                    .padding(20.dp)
                                    .weight(1f)
                            ) {
                                Column(
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.Center,
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(100.dp)
                                        .weight(1f)
                                        .clickable {
                                            Toast
                                                .makeText(
                                                    applicationContext,
                                                    "Fire Brigade",
                                                    Toast.LENGTH_SHORT
                                                )
                                                .show()
                                        },

                                    ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.agriculture),
                                        contentDescription = null,
                                        modifier = Modifier
                                            .height(50.dp)
                                            .width(50.dp)
                                    )
                                    Text(
                                        text = "Fire Brigade",
                                        color = Color.Black,
                                        fontSize = 15.sp,
                                        fontFamily = fontFamily,
                                        fontWeight = FontWeight.Light,
                                        modifier = Modifier.padding(top = 10.dp)
                                    )
                                }
                            }

                            //second row second card
                            Card(
                                elevation = 6.dp,
                                backgroundColor = Color(0xFFFFFFFF),
                                modifier = Modifier
                                    .padding(20.dp)
                                    .weight(1f)
                            ) {
                                Column(
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.Center,
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(100.dp)
                                        .weight(1f)
                                        .clickable {
                                            Toast
                                                .makeText(
                                                    applicationContext,
                                                    "Gas leakage",
                                                    Toast.LENGTH_SHORT
                                                )
                                                .show()
                                        },

                                    ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.aluminium),
                                        contentDescription = null,
                                        modifier = Modifier
                                            .height(50.dp)
                                            .width(50.dp)
                                    )
                                    Text(
                                        text = "Gas leakage",
                                        color = Color.Black,
                                        fontSize = 15.sp,
                                        fontFamily = fontFamily,
                                        fontWeight = FontWeight.Light,
                                        modifier = Modifier.padding(top = 10.dp)
                                    )
                                }
                            }
                        }

                        //third row with 1 cards
                        Row(
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            //second row first card
                            Card(
                                elevation = 6.dp,
                                backgroundColor = Color(0xFFFFFFFF),
                                modifier = Modifier
                                    .padding(20.dp)
                            ) {
                                Column(
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.Center,
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .height(100.dp)
                                        .weight(1f)
                                        .clickable {
                                            Toast
                                                .makeText(
                                                    applicationContext, "Police", Toast.LENGTH_SHORT
                                                )
                                                .show()
                                        },

                                    ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.agriculture),
                                        contentDescription = null,
                                        modifier = Modifier
                                            .height(50.dp)
                                            .width(50.dp)
                                    )
                                    Text(
                                        text = "Police",
                                        color = Color.Black,
                                        fontSize = 15.sp,
                                        fontFamily = fontFamily,
                                        fontWeight = FontWeight.Light,
                                        modifier = Modifier.padding(top = 10.dp)
                                    )
                                }
                            }
                        }
                    }

                }
            }
        }
    }
}
