package com.digital.yazman.ah

import android.content.Intent
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
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.digital.yazman.ah.ui.theme.DigitalYazmanTheme

class Services : ComponentActivity() {
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
                        text = "Services",
                        color = Color(0xFF000000),
                        fontSize = 25.sp,
                        fontFamily = fontFamily,
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier.padding(top = 15.dp, start = 20.dp)
                    )

                    // first row with 3 cards
                    Row(
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        //first row first card
                        Card(
                            elevation = 6.dp,
                            shape = RoundedCornerShape(15.dp),
                            backgroundColor = Color(0xFFFFFFFF),
                            modifier = Modifier.padding(20.dp)
                        ) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center,
                                modifier = Modifier
                                    .height(90.dp)
                                    .width(90.dp)
                                    .clickable {
                                        Toast
                                            .makeText(
                                                applicationContext,
                                                "TV Cable",
                                                Toast.LENGTH_SHORT
                                            )
                                            .show()
                                    },

                                ) {
                                Image(
                                    painter = painterResource(id = R.drawable.cable_tv),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .height(50.dp)
                                        .width(50.dp)
                                )
                                Text(
                                    text = "TV Cable",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    fontFamily = fontFamily,
                                    fontWeight = FontWeight.Light,
                                    modifier = Modifier.padding(top = 5.dp)
                                )
                            }
                        }

                        //first row second card
                        Card(
                            elevation = 6.dp,
                            shape = RoundedCornerShape(15.dp),
                            backgroundColor = Color(0xFFFFFFFF),
                            modifier = Modifier.padding(20.dp)
                        ) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center,
                                modifier = Modifier
                                    .height(90.dp)
                                    .width(90.dp)
                                    .clickable {
                                        Toast
                                            .makeText(
                                                applicationContext, "Car Mechanics", Toast.LENGTH_SHORT
                                            )
                                            .show()
                                    },

                                ) {
                                Image(
                                    painter = painterResource(id = R.drawable.car_mechanic),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .height(50.dp)
                                        .width(50.dp)
                                )
                                Text(
                                    text = "Car Mechanics",
                                    color = Color.Black,
                                    textAlign = TextAlign.Center,
                                    fontSize = 15.sp,
                                    fontFamily = fontFamily,
                                    fontWeight = FontWeight.Light,
                                    modifier = Modifier.padding(top = 5.dp)
                                )
                            }
                        }

                        //first row third card
                        Card(
                            elevation = 6.dp,
                            shape = RoundedCornerShape(15.dp),
                            backgroundColor = Color(0xFFFFFFFF),
                            modifier = Modifier.padding(20.dp)
                        ) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center,
                                modifier = Modifier
                                    .height(90.dp)
                                    .width(90.dp)
                                    .clickable {
                                        Toast
                                            .makeText(
                                                applicationContext, "Catering", Toast.LENGTH_SHORT
                                            )
                                            .show()
                                    },

                                ) {
                                Image(
                                    painter = painterResource(id = R.drawable.catering),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .height(50.dp)
                                        .width(50.dp)
                                )
                                Text(
                                    text = "Catering",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    fontFamily = fontFamily,
                                    fontWeight = FontWeight.Light,
                                    modifier = Modifier.padding(top = 5.dp)
                                )
                            }
                        }
                    }


                    // second row with 3 cards
                    Row(
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        //second row first card
                        Card(
                            elevation = 6.dp,
                            shape = RoundedCornerShape(15.dp),
                            backgroundColor = Color(0xFFFFFFFF),
                            modifier = Modifier.padding(20.dp)
                        ) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center,
                                modifier = Modifier
                                    .height(90.dp)
                                    .width(90.dp)
                                    .clickable {
                                        Toast
                                            .makeText(
                                                applicationContext,
                                                "Computer Repair",
                                                Toast.LENGTH_SHORT
                                            )
                                            .show()
                                    },

                                ) {
                                Image(
                                    painter = painterResource(id = R.drawable.computer_repair),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .height(50.dp)
                                        .width(50.dp)
                                )
                                Text(
                                    text = "Computer Repair",
                                    color = Color.Black,
                                    textAlign = TextAlign.Center,
                                    fontSize = 15.sp,
                                    fontFamily = fontFamily,
                                    fontWeight = FontWeight.Light,
                                    modifier = Modifier.padding(top = 5.dp)
                                )
                            }
                        }

                        //second row second card
                        Card(
                            elevation = 6.dp,
                            shape = RoundedCornerShape(15.dp),
                            backgroundColor = Color(0xFFFFFFFF),
                            modifier = Modifier.padding(20.dp)
                        ) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center,
                                modifier = Modifier
                                    .height(90.dp)
                                    .width(90.dp)
                                    .clickable {
                                        Toast
                                            .makeText(
                                                applicationContext, "Electricians", Toast.LENGTH_SHORT
                                            )
                                            .show()
                                    },

                                ) {
                                Image(
                                    painter = painterResource(id = R.drawable.electricians),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .height(50.dp)
                                        .width(50.dp)
                                )
                                Text(
                                    text = "Electricians",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    fontFamily = fontFamily,
                                    fontWeight = FontWeight.Light,
                                    modifier = Modifier.padding(top = 5.dp)
                                )
                            }
                        }

                        //second row third card
                        Card(
                            elevation = 6.dp,
                            shape = RoundedCornerShape(15.dp),
                            backgroundColor = Color(0xFFFFFFFF),
                            modifier = Modifier.padding(20.dp)
                        ) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center,
                                modifier = Modifier
                                    .height(90.dp)
                                    .width(90.dp)
                                    .clickable {
                                        Toast
                                            .makeText(
                                                applicationContext,
                                                "Handyman",
                                                Toast.LENGTH_SHORT
                                            )
                                            .show()
                                    },

                                ) {
                                Image(
                                    painter = painterResource(id = R.drawable.handyman),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .height(50.dp)
                                        .width(50.dp)
                                )
                                Text(
                                    text = "Handyman",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    fontFamily = fontFamily,
                                    fontWeight = FontWeight.Light,
                                    modifier = Modifier.padding(top = 5.dp)
                                )
                            }
                        }
                    }



                    // third row with 3 cards
                    Row(
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        //third row first card
                        Card(
                            elevation = 6.dp,
                            shape = RoundedCornerShape(15.dp),
                            backgroundColor = Color(0xFFFFFFFF),
                            modifier = Modifier.padding(20.dp)
                        ) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center,
                                modifier = Modifier
                                    .height(90.dp)
                                    .width(90.dp)
                                    .clickable {
                                        Toast
                                            .makeText(
                                                applicationContext,
                                                "Home Cleaners",
                                                Toast.LENGTH_SHORT
                                            )
                                            .show()
                                    },

                                ) {
                                Image(
                                    painter = painterResource(id = R.drawable.home_cleaners),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .height(50.dp)
                                        .width(50.dp)
                                )
                                Text(
                                    text = "Home Cleaners",
                                    color = Color.Black,
                                    textAlign = TextAlign.Center,
                                    fontSize = 15.sp,
                                    fontFamily = fontFamily,
                                    fontWeight = FontWeight.Light,
                                    modifier = Modifier.padding(top = 5.dp)
                                )
                            }
                        }

                        //third row second card
                        Card(
                            elevation = 6.dp,
                            shape = RoundedCornerShape(15.dp),
                            backgroundColor = Color(0xFFFFFFFF),
                            modifier = Modifier.padding(20.dp)
                        ) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center,
                                modifier = Modifier
                                    .height(90.dp)
                                    .width(90.dp)
                                    .clickable {
                                        Toast
                                            .makeText(
                                                applicationContext, "Home Security", Toast.LENGTH_SHORT
                                            )
                                            .show()
                                    },

                                ) {
                                Image(
                                    painter = painterResource(id = R.drawable.home_security),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .height(50.dp)
                                        .width(50.dp)
                                )
                                Text(
                                    text = "Home Security",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    fontFamily = fontFamily,
                                    fontWeight = FontWeight.Light,
                                    modifier = Modifier.padding(top = 5.dp)
                                )
                            }
                        }

                        //third row third card
                        Card(
                            elevation = 6.dp,
                            shape = RoundedCornerShape(15.dp),
                            backgroundColor = Color(0xFFFFFFFF),
                            modifier = Modifier.padding(20.dp)
                        ) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center,
                                modifier = Modifier
                                    .height(90.dp)
                                    .width(90.dp)
                                    .clickable {
                                        Toast
                                            .makeText(
                                                applicationContext,
                                                "HVACR",
                                                Toast.LENGTH_SHORT
                                            )
                                            .show()
                                    },

                                ) {
                                Image(
                                    painter = painterResource(id = R.drawable.hvacr),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .height(50.dp)
                                        .width(50.dp)
                                )
                                Text(
                                    text = "HVACR",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    fontFamily = fontFamily,
                                    fontWeight = FontWeight.Light,
                                    modifier = Modifier.padding(top = 5.dp)
                                )
                            }
                        }
                    }



                    // fourth row with 3 cards
                    Row(
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        //fourth row first card
                        Card(
                            elevation = 6.dp,
                            shape = RoundedCornerShape(15.dp),
                            backgroundColor = Color(0xFFFFFFFF),
                            modifier = Modifier.padding(20.dp)
                        ) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center,
                                modifier = Modifier
                                    .height(90.dp)
                                    .width(90.dp)
                                    .clickable {
                                        Toast
                                            .makeText(
                                                applicationContext,
                                                "Internet",
                                                Toast.LENGTH_SHORT
                                            )
                                            .show()
                                    },

                                ) {
                                Image(
                                    painter = painterResource(id = R.drawable.internet_service),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .height(50.dp)
                                        .width(50.dp)
                                )
                                Text(
                                    text = "Internet",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    fontFamily = fontFamily,
                                    fontWeight = FontWeight.Light,
                                    modifier = Modifier.padding(top = 5.dp)
                                )
                            }
                        }

                        //fourth row second card
                        Card(
                            elevation = 6.dp,
                            shape = RoundedCornerShape(15.dp),
                            backgroundColor = Color(0xFFFFFFFF),
                            modifier = Modifier.padding(20.dp)
                        ) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center,
                                modifier = Modifier
                                    .height(90.dp)
                                    .width(90.dp)
                                    .clickable {
                                        Toast
                                            .makeText(
                                                applicationContext, "Movers", Toast.LENGTH_SHORT
                                            )
                                            .show()
                                    },

                                ) {
                                Image(
                                    painter = painterResource(id = R.drawable.movers),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .height(50.dp)
                                        .width(50.dp)
                                )
                                Text(
                                    text = "Movers",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    fontFamily = fontFamily,
                                    fontWeight = FontWeight.Light,
                                    modifier = Modifier.padding(top = 5.dp)
                                )
                            }
                        }

                        //fourth row third card
                        Card(
                            elevation = 6.dp,
                            shape = RoundedCornerShape(15.dp),
                            backgroundColor = Color(0xFFFFFFFF),
                            modifier = Modifier.padding(20.dp)
                        ) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center,
                                modifier = Modifier
                                    .height(90.dp)
                                    .width(90.dp)
                                    .clickable {
                                        Toast
                                            .makeText(
                                                applicationContext,
                                                "Painters",
                                                Toast.LENGTH_SHORT
                                            )
                                            .show()
                                    },

                                ) {
                                Image(
                                    painter = painterResource(id = R.drawable.painter),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .height(50.dp)
                                        .width(50.dp)
                                )
                                Text(
                                    text = "Painters",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    fontFamily = fontFamily,
                                    fontWeight = FontWeight.Light,
                                    modifier = Modifier.padding(top = 5.dp)
                                )
                            }
                        }
                    }



                    // fifth row with 3 cards
                    Row(
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        //fifth row first card
                        Card(
                            elevation = 6.dp,
                            shape = RoundedCornerShape(15.dp),
                            backgroundColor = Color(0xFFFFFFFF),
                            modifier = Modifier.padding(20.dp)
                        ) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center,
                                modifier = Modifier
                                    .height(90.dp)
                                    .width(90.dp)
                                    .clickable {
                                        Toast
                                            .makeText(
                                                applicationContext,
                                                "Pet Service",
                                                Toast.LENGTH_SHORT
                                            )
                                            .show()
                                    },

                                ) {
                                Image(
                                    painter = painterResource(id = R.drawable.pet_service),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .height(50.dp)
                                        .width(50.dp)
                                )
                                Text(
                                    text = "Pet Service",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    fontFamily = fontFamily,
                                    fontWeight = FontWeight.Light,
                                    modifier = Modifier.padding(top = 5.dp)
                                )
                            }
                        }

                        //fifth row second card
                        Card(
                            elevation = 6.dp,
                            shape = RoundedCornerShape(15.dp),
                            backgroundColor = Color(0xFFFFFFFF),
                            modifier = Modifier.padding(20.dp)
                        ) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center,
                                modifier = Modifier
                                    .height(90.dp)
                                    .width(90.dp)
                                    .clickable {
                                        Toast
                                            .makeText(
                                                applicationContext, "Photography", Toast.LENGTH_SHORT
                                            )
                                            .show()
                                    },

                                ) {
                                Image(
                                    painter = painterResource(id = R.drawable.photography),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .height(50.dp)
                                        .width(50.dp)
                                )
                                Text(
                                    text = "Photography",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    fontFamily = fontFamily,
                                    fontWeight = FontWeight.Light,
                                    modifier = Modifier.padding(top = 5.dp)
                                )
                            }
                        }

                        //fifth row third card
                        Card(
                            elevation = 6.dp,
                            shape = RoundedCornerShape(15.dp),
                            backgroundColor = Color(0xFFFFFFFF),
                            modifier = Modifier.padding(20.dp)
                        ) {
                            Column(
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center,
                                modifier = Modifier
                                    .height(90.dp)
                                    .width(90.dp)
                                    .clickable {
                                        Toast
                                            .makeText(
                                                applicationContext,
                                                "Plumbers",
                                                Toast.LENGTH_SHORT
                                            )
                                            .show()
                                    },

                                ) {
                                Image(
                                    painter = painterResource(id = R.drawable.plumbers),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .height(50.dp)
                                        .width(50.dp)
                                )
                                Text(
                                    text = "Plumbers",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    fontFamily = fontFamily,
                                    fontWeight = FontWeight.Light,
                                    modifier = Modifier.padding(top = 5.dp)
                                )
                            }
                        }
                    }

                }
            }
        }
    }
}
