package com.digital.yazman.ah

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.digital.yazman.ah.ui.theme.DigitalYazmanTheme

class LocalDeals : ComponentActivity() {
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
                        text = "Local Deals",
                        color = Color(0xFF000000),
                        fontSize = 25.sp,
                        fontFamily = fontFamily,
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier.padding(top = 15.dp, start = 20.dp, bottom = 10.dp)
                    )


                    // card sample
                    Card(
                        elevation = 6.dp,
                        shape = RoundedCornerShape(15.dp),
                        backgroundColor = Color(0xFFFFFFFF),
                        modifier = Modifier.padding(start = 20.dp, top = 10.dp, end  = 20.dp, bottom = 10.dp)
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .fillMaxWidth()
                                .clickable {
                                    Toast
                                        .makeText(
                                            applicationContext, "Service Brand", Toast.LENGTH_SHORT
                                        )
                                        .show()
                                },
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.service_logo),
                                contentDescription = null,
                                modifier = Modifier
                                    .height(50.dp)
                                    .width(50.dp)
                                    .padding(start = 5.dp)
                            )
                            Column(modifier = Modifier
                                .fillMaxSize()
                                .padding(start = 10.dp)) {
                                Text(
                                    text = "Service",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    fontFamily = fontFamily,
                                    fontWeight = FontWeight.ExtraLight,
                                    modifier = Modifier.alpha(0.5f)
                                )
                                Text(
                                    text = "50% off on shoes",
                                    color = Color.Black,
                                    fontSize = 18.sp,
                                    fontFamily = fontFamily,
                                    fontWeight = FontWeight.Bold,
                                )
                                Text(
                                    text = "sale sale sale on this Friday 50% off on all sizes on all service shops. ",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    fontFamily = fontFamily,
                                    fontWeight = FontWeight.Light,
                                )
                                Row(modifier = Modifier
                                    .padding(top = 10.dp)
                                    .fillMaxWidth()) {
                                    Text(
                                        text = "Service Brand",
                                        color = Color.Black,
                                        fontSize = 15.sp,
                                        fontFamily = fontFamily,
                                        fontWeight = FontWeight.ExtraLight,
                                        modifier = Modifier
                                            .alpha(0.5f)
                                            .weight(1f)
                                    )
                                    Text(
                                        text = "01-06 / 01-07",
                                        color = Color.Black,
                                        fontSize = 15.sp,
                                        textAlign = TextAlign.End,
                                        fontFamily = fontFamily,
                                        fontWeight = FontWeight.ExtraLight,
                                        modifier = Modifier
                                            .alpha(0.5f)
                                            .weight(1f)
                                            .padding(end = 10.dp)
                                    )
                                }
                            }
                        }
                    }





                    // card sample
                    Card(
                        elevation = 6.dp,
                        shape = RoundedCornerShape(15.dp),
                        backgroundColor = Color(0xFFFFFFFF),
                        modifier = Modifier.padding(start = 20.dp, top = 10.dp, end  = 20.dp, bottom = 10.dp)
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .fillMaxWidth()
                                .clickable {
                                    Toast
                                        .makeText(
                                            applicationContext, "Source", Toast.LENGTH_SHORT
                                        )
                                        .show()
                                },
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.banks),
                                contentDescription = null,
                                modifier = Modifier
                                    .height(50.dp)
                                    .width(50.dp)
                                    .padding(start = 5.dp)
                            )
                            Column(modifier = Modifier
                                .fillMaxSize()
                                .padding(start = 10.dp)) {
                                Text(
                                    text = "Category",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    fontFamily = fontFamily,
                                    fontWeight = FontWeight.ExtraLight,
                                    modifier = Modifier.alpha(0.5f)
                                )
                                Text(
                                    text = "Title",
                                    color = Color.Black,
                                    fontSize = 18.sp,
                                    fontFamily = fontFamily,
                                    fontWeight = FontWeight.Bold,
                                )
                                Text(
                                    text = "Short Description",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    fontFamily = fontFamily,
                                    fontWeight = FontWeight.Light,
                                )
                                Row(modifier = Modifier
                                    .padding(top = 10.dp)
                                    .fillMaxWidth()) {
                                    Text(
                                        text = "Source",
                                        color = Color.Black,
                                        fontSize = 15.sp,
                                        fontFamily = fontFamily,
                                        fontWeight = FontWeight.ExtraLight,
                                        modifier = Modifier
                                            .alpha(0.5f)
                                            .weight(1f)
                                    )
                                    Text(
                                        text = "start/end date",
                                        color = Color.Black,
                                        fontSize = 15.sp,
                                        textAlign = TextAlign.End,
                                        fontFamily = fontFamily,
                                        fontWeight = FontWeight.ExtraLight,
                                        modifier = Modifier
                                            .alpha(0.5f)
                                            .weight(1f)
                                            .padding(end = 10.dp)
                                    )
                                }
                            }
                        }
                    }

                    // card sample
                    Card(
                        elevation = 6.dp,
                        shape = RoundedCornerShape(15.dp),
                        backgroundColor = Color(0xFFFFFFFF),
                        modifier = Modifier.padding(start = 20.dp, top = 10.dp, end  = 20.dp,bottom = 10.dp)
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .fillMaxWidth()
                                .clickable {
                                    Toast
                                        .makeText(
                                            applicationContext, "Source", Toast.LENGTH_SHORT
                                        )
                                        .show()
                                },
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.banks),
                                contentDescription = null,
                                modifier = Modifier
                                    .height(50.dp)
                                    .width(50.dp)
                                    .padding(start = 5.dp)
                            )
                            Column(modifier = Modifier
                                .fillMaxSize()
                                .padding(start = 10.dp)) {
                                Text(
                                    text = "Category",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    fontFamily = fontFamily,
                                    fontWeight = FontWeight.ExtraLight,
                                    modifier = Modifier.alpha(0.5f)
                                )
                                Text(
                                    text = "Title",
                                    color = Color.Black,
                                    fontSize = 18.sp,
                                    fontFamily = fontFamily,
                                    fontWeight = FontWeight.Bold,
                                )
                                Text(
                                    text = "Short Description",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    fontFamily = fontFamily,
                                    fontWeight = FontWeight.Light,
                                )
                                Row(modifier = Modifier
                                    .padding(top = 10.dp)
                                    .fillMaxWidth()) {
                                    Text(
                                        text = "Source",
                                        color = Color.Black,
                                        fontSize = 15.sp,
                                        fontFamily = fontFamily,
                                        fontWeight = FontWeight.ExtraLight,
                                        modifier = Modifier
                                            .alpha(0.5f)
                                            .weight(1f)
                                    )
                                    Text(
                                        text = "start/end date",
                                        color = Color.Black,
                                        fontSize = 15.sp,
                                        textAlign = TextAlign.End,
                                        fontFamily = fontFamily,
                                        fontWeight = FontWeight.ExtraLight,
                                        modifier = Modifier
                                            .alpha(0.5f)
                                            .weight(1f)
                                            .padding(end = 10.dp)
                                    )
                                }
                            }
                        }
                    }


                    // card sample
                    Card(
                        elevation = 6.dp,
                        shape = RoundedCornerShape(15.dp),
                        backgroundColor = Color(0xFFFFFFFF),
                        modifier = Modifier.padding(start = 20.dp, top = 10.dp, end  = 20.dp,bottom = 10.dp)
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .fillMaxWidth()
                                .clickable {
                                    Toast
                                        .makeText(
                                            applicationContext, "Source", Toast.LENGTH_SHORT
                                        )
                                        .show()
                                },
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.banks),
                                contentDescription = null,
                                modifier = Modifier
                                    .height(50.dp)
                                    .width(50.dp)
                                    .padding(start = 5.dp)
                            )
                            Column(modifier = Modifier
                                .fillMaxSize()
                                .padding(start = 10.dp)) {
                                Text(
                                    text = "Category",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    fontFamily = fontFamily,
                                    fontWeight = FontWeight.ExtraLight,
                                    modifier = Modifier.alpha(0.5f)
                                )
                                Text(
                                    text = "Title",
                                    color = Color.Black,
                                    fontSize = 18.sp,
                                    fontFamily = fontFamily,
                                    fontWeight = FontWeight.Bold,
                                )
                                Text(
                                    text = "Short Description",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    fontFamily = fontFamily,
                                    fontWeight = FontWeight.Light,
                                )
                                Row(modifier = Modifier
                                    .padding(top = 10.dp)
                                    .fillMaxWidth()) {
                                    Text(
                                        text = "Source",
                                        color = Color.Black,
                                        fontSize = 15.sp,
                                        fontFamily = fontFamily,
                                        fontWeight = FontWeight.ExtraLight,
                                        modifier = Modifier
                                            .alpha(0.5f)
                                            .weight(1f)
                                    )
                                    Text(
                                        text = "start/end date",
                                        color = Color.Black,
                                        fontSize = 15.sp,
                                        textAlign = TextAlign.End,
                                        fontFamily = fontFamily,
                                        fontWeight = FontWeight.ExtraLight,
                                        modifier = Modifier
                                            .alpha(0.5f)
                                            .weight(1f)
                                            .padding(end = 10.dp)
                                    )
                                }
                            }
                        }
                    }


                    // card sample
                    Card(
                        elevation = 6.dp,
                        shape = RoundedCornerShape(15.dp),
                        backgroundColor = Color(0xFFFFFFFF),
                        modifier = Modifier.padding(start = 20.dp, top = 10.dp, end  = 20.dp,bottom = 10.dp)
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .fillMaxWidth()
                                .clickable {
                                    Toast
                                        .makeText(
                                            applicationContext, "Source", Toast.LENGTH_SHORT
                                        )
                                        .show()
                                },
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.banks),
                                contentDescription = null,
                                modifier = Modifier
                                    .height(50.dp)
                                    .width(50.dp)
                                    .padding(start = 5.dp)
                            )
                            Column(modifier = Modifier
                                .fillMaxSize()
                                .padding(start = 10.dp)) {
                                Text(
                                    text = "Category",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    fontFamily = fontFamily,
                                    fontWeight = FontWeight.ExtraLight,
                                    modifier = Modifier.alpha(0.5f)
                                )
                                Text(
                                    text = "Title",
                                    color = Color.Black,
                                    fontSize = 18.sp,
                                    fontFamily = fontFamily,
                                    fontWeight = FontWeight.Bold,
                                )
                                Text(
                                    text = "Short Description",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    fontFamily = fontFamily,
                                    fontWeight = FontWeight.Light,
                                )
                                Row(modifier = Modifier
                                    .padding(top = 10.dp)
                                    .fillMaxWidth()) {
                                    Text(
                                        text = "Source",
                                        color = Color.Black,
                                        fontSize = 15.sp,
                                        fontFamily = fontFamily,
                                        fontWeight = FontWeight.ExtraLight,
                                        modifier = Modifier
                                            .alpha(0.5f)
                                            .weight(1f)
                                    )
                                    Text(
                                        text = "start/end date",
                                        color = Color.Black,
                                        fontSize = 15.sp,
                                        textAlign = TextAlign.End,
                                        fontFamily = fontFamily,
                                        fontWeight = FontWeight.ExtraLight,
                                        modifier = Modifier
                                            .alpha(0.5f)
                                            .weight(1f)
                                            .padding(end = 10.dp)
                                    )
                                }
                            }
                        }
                    }


                    // card sample
                    Card(
                        elevation = 6.dp,
                        shape = RoundedCornerShape(15.dp),
                        backgroundColor = Color(0xFFFFFFFF),
                        modifier = Modifier.padding(start = 20.dp, top = 10.dp, end  = 20.dp,bottom = 10.dp)
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .fillMaxWidth()
                                .clickable {
                                    Toast
                                        .makeText(
                                            applicationContext, "Source", Toast.LENGTH_SHORT
                                        )
                                        .show()
                                },
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.banks),
                                contentDescription = null,
                                modifier = Modifier
                                    .height(50.dp)
                                    .width(50.dp)
                                    .padding(start = 5.dp)
                            )
                            Column(modifier = Modifier
                                .fillMaxSize()
                                .padding(start = 10.dp)) {
                                Text(
                                    text = "Category",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    fontFamily = fontFamily,
                                    fontWeight = FontWeight.ExtraLight,
                                    modifier = Modifier.alpha(0.5f)
                                )
                                Text(
                                    text = "Title",
                                    color = Color.Black,
                                    fontSize = 18.sp,
                                    fontFamily = fontFamily,
                                    fontWeight = FontWeight.Bold,
                                )
                                Text(
                                    text = "Short Description",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    fontFamily = fontFamily,
                                    fontWeight = FontWeight.Light,
                                )
                                Row(modifier = Modifier
                                    .padding(top = 10.dp)
                                    .fillMaxWidth()) {
                                    Text(
                                        text = "Source",
                                        color = Color.Black,
                                        fontSize = 15.sp,
                                        fontFamily = fontFamily,
                                        fontWeight = FontWeight.ExtraLight,
                                        modifier = Modifier
                                            .alpha(0.5f)
                                            .weight(1f)
                                    )
                                    Text(
                                        text = "start/end date",
                                        color = Color.Black,
                                        fontSize = 15.sp,
                                        textAlign = TextAlign.End,
                                        fontFamily = fontFamily,
                                        fontWeight = FontWeight.ExtraLight,
                                        modifier = Modifier
                                            .alpha(0.5f)
                                            .weight(1f)
                                            .padding(end = 10.dp)
                                    )
                                }
                            }
                        }
                    }



                    // card sample
                    Card(
                        elevation = 6.dp,
                        shape = RoundedCornerShape(15.dp),
                        backgroundColor = Color(0xFFFFFFFF),
                        modifier = Modifier.padding(start = 20.dp, top = 10.dp, end  = 20.dp, bottom = 10.dp)
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .fillMaxWidth()
                                .clickable {
                                    Toast
                                        .makeText(
                                            applicationContext, "Service Brand", Toast.LENGTH_SHORT
                                        )
                                        .show()
                                },
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.service_logo),
                                contentDescription = null,
                                modifier = Modifier
                                    .height(50.dp)
                                    .width(50.dp)
                                    .padding(start = 5.dp)
                            )
                            Column(modifier = Modifier
                                .fillMaxSize()
                                .padding(start = 10.dp)) {
                                Text(
                                    text = "Service",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    fontFamily = fontFamily,
                                    fontWeight = FontWeight.ExtraLight,
                                    modifier = Modifier.alpha(0.5f)
                                )
                                Text(
                                    text = "50% off on shoes",
                                    color = Color.Black,
                                    fontSize = 18.sp,
                                    fontFamily = fontFamily,
                                    fontWeight = FontWeight.Bold,
                                )
                                Text(
                                    text = "sale sale sale on this Friday 50% off on all sizes on all service shops. ",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    fontFamily = fontFamily,
                                    fontWeight = FontWeight.Light,
                                )
                                Row(modifier = Modifier
                                    .padding(top = 10.dp)
                                    .fillMaxWidth()) {
                                    Text(
                                        text = "Service Brand",
                                        color = Color.Black,
                                        fontSize = 15.sp,
                                        fontFamily = fontFamily,
                                        fontWeight = FontWeight.ExtraLight,
                                        modifier = Modifier
                                            .alpha(0.5f)
                                            .weight(1f)
                                    )
                                    Text(
                                        text = "01-06 / 01-07",
                                        color = Color.Black,
                                        fontSize = 15.sp,
                                        textAlign = TextAlign.End,
                                        fontFamily = fontFamily,
                                        fontWeight = FontWeight.ExtraLight,
                                        modifier = Modifier
                                            .alpha(0.5f)
                                            .weight(1f)
                                            .padding(end = 10.dp)
                                    )
                                }
                            }
                        }
                    }





                    // card sample
                    Card(
                        elevation = 6.dp,
                        shape = RoundedCornerShape(15.dp),
                        backgroundColor = Color(0xFFFFFFFF),
                        modifier = Modifier.padding(start = 20.dp, top = 10.dp, end  = 20.dp, bottom = 10.dp)
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .fillMaxWidth()
                                .clickable {
                                    Toast
                                        .makeText(
                                            applicationContext, "Source", Toast.LENGTH_SHORT
                                        )
                                        .show()
                                },
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.banks),
                                contentDescription = null,
                                modifier = Modifier
                                    .height(50.dp)
                                    .width(50.dp)
                                    .padding(start = 5.dp)
                            )
                            Column(modifier = Modifier
                                .fillMaxSize()
                                .padding(start = 10.dp)) {
                                Text(
                                    text = "Category",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    fontFamily = fontFamily,
                                    fontWeight = FontWeight.ExtraLight,
                                    modifier = Modifier.alpha(0.5f)
                                )
                                Text(
                                    text = "Title",
                                    color = Color.Black,
                                    fontSize = 18.sp,
                                    fontFamily = fontFamily,
                                    fontWeight = FontWeight.Bold,
                                )
                                Text(
                                    text = "Short Description",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    fontFamily = fontFamily,
                                    fontWeight = FontWeight.Light,
                                )
                                Row(modifier = Modifier
                                    .padding(top = 10.dp)
                                    .fillMaxWidth()) {
                                    Text(
                                        text = "Source",
                                        color = Color.Black,
                                        fontSize = 15.sp,
                                        fontFamily = fontFamily,
                                        fontWeight = FontWeight.ExtraLight,
                                        modifier = Modifier
                                            .alpha(0.5f)
                                            .weight(1f)
                                    )
                                    Text(
                                        text = "start/end date",
                                        color = Color.Black,
                                        fontSize = 15.sp,
                                        textAlign = TextAlign.End,
                                        fontFamily = fontFamily,
                                        fontWeight = FontWeight.ExtraLight,
                                        modifier = Modifier
                                            .alpha(0.5f)
                                            .weight(1f)
                                            .padding(end = 10.dp)
                                    )
                                }
                            }
                        }
                    }

                    // card sample
                    Card(
                        elevation = 6.dp,
                        shape = RoundedCornerShape(15.dp),
                        backgroundColor = Color(0xFFFFFFFF),
                        modifier = Modifier.padding(start = 20.dp, top = 10.dp, end  = 20.dp,bottom = 10.dp)
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .fillMaxWidth()
                                .clickable {
                                    Toast
                                        .makeText(
                                            applicationContext, "Source", Toast.LENGTH_SHORT
                                        )
                                        .show()
                                },
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.banks),
                                contentDescription = null,
                                modifier = Modifier
                                    .height(50.dp)
                                    .width(50.dp)
                                    .padding(start = 5.dp)
                            )
                            Column(modifier = Modifier
                                .fillMaxSize()
                                .padding(start = 10.dp)) {
                                Text(
                                    text = "Category",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    fontFamily = fontFamily,
                                    fontWeight = FontWeight.ExtraLight,
                                    modifier = Modifier.alpha(0.5f)
                                )
                                Text(
                                    text = "Title",
                                    color = Color.Black,
                                    fontSize = 18.sp,
                                    fontFamily = fontFamily,
                                    fontWeight = FontWeight.Bold,
                                )
                                Text(
                                    text = "Short Description",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    fontFamily = fontFamily,
                                    fontWeight = FontWeight.Light,
                                )
                                Row(modifier = Modifier
                                    .padding(top = 10.dp)
                                    .fillMaxWidth()) {
                                    Text(
                                        text = "Source",
                                        color = Color.Black,
                                        fontSize = 15.sp,
                                        fontFamily = fontFamily,
                                        fontWeight = FontWeight.ExtraLight,
                                        modifier = Modifier
                                            .alpha(0.5f)
                                            .weight(1f)
                                    )
                                    Text(
                                        text = "start/end date",
                                        color = Color.Black,
                                        fontSize = 15.sp,
                                        textAlign = TextAlign.End,
                                        fontFamily = fontFamily,
                                        fontWeight = FontWeight.ExtraLight,
                                        modifier = Modifier
                                            .alpha(0.5f)
                                            .weight(1f)
                                            .padding(end = 10.dp)
                                    )
                                }
                            }
                        }
                    }


                    // card sample
                    Card(
                        elevation = 6.dp,
                        shape = RoundedCornerShape(15.dp),
                        backgroundColor = Color(0xFFFFFFFF),
                        modifier = Modifier.padding(start = 20.dp, top = 10.dp, end  = 20.dp,bottom = 10.dp)
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .fillMaxWidth()
                                .clickable {
                                    Toast
                                        .makeText(
                                            applicationContext, "Source", Toast.LENGTH_SHORT
                                        )
                                        .show()
                                },
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.banks),
                                contentDescription = null,
                                modifier = Modifier
                                    .height(50.dp)
                                    .width(50.dp)
                                    .padding(start = 5.dp)
                            )
                            Column(modifier = Modifier
                                .fillMaxSize()
                                .padding(start = 10.dp)) {
                                Text(
                                    text = "Category",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    fontFamily = fontFamily,
                                    fontWeight = FontWeight.ExtraLight,
                                    modifier = Modifier.alpha(0.5f)
                                )
                                Text(
                                    text = "Title",
                                    color = Color.Black,
                                    fontSize = 18.sp,
                                    fontFamily = fontFamily,
                                    fontWeight = FontWeight.Bold,
                                )
                                Text(
                                    text = "Short Description",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    fontFamily = fontFamily,
                                    fontWeight = FontWeight.Light,
                                )
                                Row(modifier = Modifier
                                    .padding(top = 10.dp)
                                    .fillMaxWidth()) {
                                    Text(
                                        text = "Source",
                                        color = Color.Black,
                                        fontSize = 15.sp,
                                        fontFamily = fontFamily,
                                        fontWeight = FontWeight.ExtraLight,
                                        modifier = Modifier
                                            .alpha(0.5f)
                                            .weight(1f)
                                    )
                                    Text(
                                        text = "start/end date",
                                        color = Color.Black,
                                        fontSize = 15.sp,
                                        textAlign = TextAlign.End,
                                        fontFamily = fontFamily,
                                        fontWeight = FontWeight.ExtraLight,
                                        modifier = Modifier
                                            .alpha(0.5f)
                                            .weight(1f)
                                            .padding(end = 10.dp)
                                    )
                                }
                            }
                        }
                    }


                    // card sample
                    Card(
                        elevation = 6.dp,
                        shape = RoundedCornerShape(15.dp),
                        backgroundColor = Color(0xFFFFFFFF),
                        modifier = Modifier.padding(start = 20.dp, top = 10.dp, end  = 20.dp,bottom = 10.dp)
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .fillMaxWidth()
                                .clickable {
                                    Toast
                                        .makeText(
                                            applicationContext, "Source", Toast.LENGTH_SHORT
                                        )
                                        .show()
                                },
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.banks),
                                contentDescription = null,
                                modifier = Modifier
                                    .height(50.dp)
                                    .width(50.dp)
                                    .padding(start = 5.dp)
                            )
                            Column(modifier = Modifier
                                .fillMaxSize()
                                .padding(start = 10.dp)) {
                                Text(
                                    text = "Category",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    fontFamily = fontFamily,
                                    fontWeight = FontWeight.ExtraLight,
                                    modifier = Modifier.alpha(0.5f)
                                )
                                Text(
                                    text = "Title",
                                    color = Color.Black,
                                    fontSize = 18.sp,
                                    fontFamily = fontFamily,
                                    fontWeight = FontWeight.Bold,
                                )
                                Text(
                                    text = "Short Description",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    fontFamily = fontFamily,
                                    fontWeight = FontWeight.Light,
                                )
                                Row(modifier = Modifier
                                    .padding(top = 10.dp)
                                    .fillMaxWidth()) {
                                    Text(
                                        text = "Source",
                                        color = Color.Black,
                                        fontSize = 15.sp,
                                        fontFamily = fontFamily,
                                        fontWeight = FontWeight.ExtraLight,
                                        modifier = Modifier
                                            .alpha(0.5f)
                                            .weight(1f)
                                    )
                                    Text(
                                        text = "start/end date",
                                        color = Color.Black,
                                        fontSize = 15.sp,
                                        textAlign = TextAlign.End,
                                        fontFamily = fontFamily,
                                        fontWeight = FontWeight.ExtraLight,
                                        modifier = Modifier
                                            .alpha(0.5f)
                                            .weight(1f)
                                            .padding(end = 10.dp)
                                    )
                                }
                            }
                        }
                    }


                    // card sample
                    Card(
                        elevation = 6.dp,
                        shape = RoundedCornerShape(15.dp),
                        backgroundColor = Color(0xFFFFFFFF),
                        modifier = Modifier.padding(start = 20.dp, top = 10.dp, end  = 20.dp,bottom = 10.dp)
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .fillMaxWidth()
                                .clickable {
                                    Toast
                                        .makeText(
                                            applicationContext, "Source", Toast.LENGTH_SHORT
                                        )
                                        .show()
                                },
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.banks),
                                contentDescription = null,
                                modifier = Modifier
                                    .height(50.dp)
                                    .width(50.dp)
                                    .padding(start = 5.dp)
                            )
                            Column(modifier = Modifier
                                .fillMaxSize()
                                .padding(start = 10.dp)) {
                                Text(
                                    text = "Category",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    fontFamily = fontFamily,
                                    fontWeight = FontWeight.ExtraLight,
                                    modifier = Modifier.alpha(0.5f)
                                )
                                Text(
                                    text = "Title",
                                    color = Color.Black,
                                    fontSize = 18.sp,
                                    fontFamily = fontFamily,
                                    fontWeight = FontWeight.Bold,
                                )
                                Text(
                                    text = "Short Description",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    fontFamily = fontFamily,
                                    fontWeight = FontWeight.Light,
                                )
                                Row(modifier = Modifier
                                    .padding(top = 10.dp)
                                    .fillMaxWidth()) {
                                    Text(
                                        text = "Source",
                                        color = Color.Black,
                                        fontSize = 15.sp,
                                        fontFamily = fontFamily,
                                        fontWeight = FontWeight.ExtraLight,
                                        modifier = Modifier
                                            .alpha(0.5f)
                                            .weight(1f)
                                    )
                                    Text(
                                        text = "start/end date",
                                        color = Color.Black,
                                        fontSize = 15.sp,
                                        textAlign = TextAlign.End,
                                        fontFamily = fontFamily,
                                        fontWeight = FontWeight.ExtraLight,
                                        modifier = Modifier
                                            .alpha(0.5f)
                                            .weight(1f)
                                            .padding(end = 10.dp)
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
