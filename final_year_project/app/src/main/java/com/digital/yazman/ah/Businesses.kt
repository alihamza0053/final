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

class Businesses : ComponentActivity() {
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
                        text = "Businesses",
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
                                                "Agriculture",
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
                                    text = "Agriculture",
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
                                                applicationContext, "Aluminium", Toast.LENGTH_SHORT
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
                                    text = "Aluminium",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    fontFamily = fontFamily,
                                    fontWeight = FontWeight.Light,
                                    modifier = Modifier.padding(top = 10.dp)
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
                                                applicationContext, "Automobile", Toast.LENGTH_SHORT
                                            )
                                            .show()
                                    },

                                ) {
                                Image(
                                    painter = painterResource(id = R.drawable.automobile),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .height(50.dp)
                                        .width(50.dp)
                                )
                                Text(
                                    text = "Automobile",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    fontFamily = fontFamily,
                                    fontWeight = FontWeight.Light,
                                    modifier = Modifier.padding(top = 10.dp)
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
                                                "Banks",
                                                Toast.LENGTH_SHORT
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
                                )
                                Text(
                                    text = "Banks",
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
                                                applicationContext, "Books", Toast.LENGTH_SHORT
                                            )
                                            .show()
                                    },

                                ) {
                                Image(
                                    painter = painterResource(id = R.drawable.books),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .height(50.dp)
                                        .width(50.dp)
                                )
                                Text(
                                    text = "Books",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    fontFamily = fontFamily,
                                    fontWeight = FontWeight.Light,
                                    modifier = Modifier.padding(top = 10.dp)
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
                                                "Clothing",
                                                Toast.LENGTH_SHORT
                                            )
                                            .show()
                                    },

                                ) {
                                Image(
                                    painter = painterResource(id = R.drawable.clothing),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .height(50.dp)
                                        .width(50.dp)
                                )
                                Text(
                                    text = "Clothing",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    fontFamily = fontFamily,
                                    fontWeight = FontWeight.Light,
                                    modifier = Modifier.padding(top = 10.dp)
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
                                                applicationContext, "Computers", Toast.LENGTH_SHORT
                                            )
                                            .show()
                                    },

                                ) {
                                Image(
                                    painter = painterResource(id = R.drawable.computeraccessories),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .height(50.dp)
                                        .width(50.dp)
                                )
                                Text(
                                    text = "Computers",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    fontFamily = fontFamily,
                                    fontWeight = FontWeight.Light,
                                    modifier = Modifier.padding(top = 10.dp)
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
                                                applicationContext, "Education", Toast.LENGTH_SHORT
                                            )
                                            .show()
                                    },

                                ) {
                                Image(
                                    painter = painterResource(id = R.drawable.education),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .height(50.dp)
                                        .width(50.dp)
                                )
                                Text(
                                    text = "Education",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    fontFamily = fontFamily,
                                    fontWeight = FontWeight.Light,
                                    modifier = Modifier.padding(top = 10.dp)
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
                                                applicationContext, "Electric", Toast.LENGTH_SHORT
                                            )
                                            .show()
                                    },

                                ) {
                                Image(
                                    painter = painterResource(id = R.drawable.electrics),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .height(50.dp)
                                        .width(50.dp)
                                )
                                Text(
                                    text = "Electric",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    fontFamily = fontFamily,
                                    fontWeight = FontWeight.Light,
                                    modifier = Modifier.padding(top = 10.dp)
                                )
                            }
                        }
                    }

                    // forth row with 3 cards
                    Row(
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        //forth row first card
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
                                                applicationContext, "Footwear", Toast.LENGTH_SHORT
                                            )
                                            .show()
                                    },

                                ) {
                                Image(
                                    painter = painterResource(id = R.drawable.footwear),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .height(50.dp)
                                        .width(50.dp)
                                )
                                Text(
                                    text = "Footwear",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    fontFamily = fontFamily,
                                    fontWeight = FontWeight.Light,
                                    modifier = Modifier.padding(top = 10.dp)
                                )
                            }
                        }

                        //forth row second card
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
                                                applicationContext, "Fresh Meat", Toast.LENGTH_SHORT
                                            )
                                            .show()
                                    },

                                ) {
                                Image(
                                    painter = painterResource(id = R.drawable.freshmeat),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .height(50.dp)
                                        .width(50.dp)
                                )
                                Text(
                                    text = "Fresh Meat",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    fontFamily = fontFamily,
                                    fontWeight = FontWeight.Light,
                                    modifier = Modifier.padding(top = 10.dp)
                                )
                            }
                        }

                        //forth row third card
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
                                                "Grain Market",
                                                Toast.LENGTH_SHORT
                                            )
                                            .show()
                                    },

                                ) {
                                Image(
                                    painter = painterResource(id = R.drawable.grainmarket),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .height(50.dp)
                                        .width(50.dp)
                                )
                                Text(
                                    text = "Grain Market",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    fontFamily = fontFamily,
                                    fontWeight = FontWeight.Light,
                                    modifier = Modifier.padding(top = 10.dp)
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
                                                "Grocery",
                                                Toast.LENGTH_SHORT
                                            )
                                            .show()
                                    },

                                ) {
                                Image(
                                    painter = painterResource(id = R.drawable.grocery),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .height(50.dp)
                                        .width(50.dp)
                                )
                                Text(
                                    text = "Grocery",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    fontFamily = fontFamily,
                                    fontWeight = FontWeight.Light,
                                    modifier = Modifier.padding(top = 10.dp)
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
                                                applicationContext, "Jewelry", Toast.LENGTH_SHORT
                                            )
                                            .show()
                                    },

                                ) {
                                Image(
                                    painter = painterResource(id = R.drawable.jewelry),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .height(50.dp)
                                        .width(50.dp)
                                )
                                Text(
                                    text = "Jewelry",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    fontFamily = fontFamily,
                                    fontWeight = FontWeight.Light,
                                    modifier = Modifier.padding(top = 10.dp)
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
                                                "Machine Work",
                                                Toast.LENGTH_SHORT
                                            )
                                            .show()
                                    },

                                ) {
                                Image(
                                    painter = painterResource(id = R.drawable.machinework),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .height(50.dp)
                                        .width(50.dp)
                                )
                                Text(
                                    text = "Machine Work",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    fontFamily = fontFamily,
                                    fontWeight = FontWeight.Light,
                                    modifier = Modifier.padding(top = 10.dp)
                                )
                            }
                        }
                    }

                    // sixth row with 3 cards
                    Row(
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        //sixth row first card
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
                                                applicationContext, "Marble", Toast.LENGTH_SHORT
                                            )
                                            .show()
                                    },

                                ) {
                                Image(
                                    painter = painterResource(id = R.drawable.marble),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .height(50.dp)
                                        .width(50.dp)
                                )
                                Text(
                                    text = "Marble",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    fontFamily = fontFamily,
                                    fontWeight = FontWeight.Light,
                                    modifier = Modifier.padding(top = 10.dp)
                                )
                            }
                        }

                        //sixth row second card
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
                                                "Marriage Hall",
                                                Toast.LENGTH_SHORT
                                            )
                                            .show()
                                    },

                                ) {
                                Image(
                                    painter = painterResource(id = R.drawable.marriagehall),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .height(50.dp)
                                        .width(50.dp)
                                )
                                Text(
                                    text = "Marriage Hall",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    fontFamily = fontFamily,
                                    fontWeight = FontWeight.Light,
                                    modifier = Modifier.padding(top = 10.dp)
                                )
                            }
                        }

                        //sixth row third card
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
                                                "Mobile Accessories",
                                                Toast.LENGTH_SHORT
                                            )
                                            .show()
                                    },

                                ) {
                                Image(
                                    painter = painterResource(id = R.drawable.mobileaccessories),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .height(50.dp)
                                        .width(50.dp)
                                )
                                Text(
                                    text = "Mobile Accessories",
                                    textAlign = TextAlign.Center,
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    fontFamily = fontFamily,
                                    fontWeight = FontWeight.Light,
                                    modifier = Modifier
                                        .padding(top = 5.dp)
                                )
                            }
                        }
                    }

                    // seventh row with 3 cards
                    Row(
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        //seventh row first card
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
                                                applicationContext, "Petroleum", Toast.LENGTH_SHORT
                                            )
                                            .show()
                                    },

                                ) {
                                Image(
                                    painter = painterResource(id = R.drawable.petroleum),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .height(50.dp)
                                        .width(50.dp)
                                )
                                Text(
                                    text = "Petroleum",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    fontFamily = fontFamily,
                                    fontWeight = FontWeight.Light,
                                    modifier = Modifier.padding(top = 10.dp)
                                )
                            }
                        }

                        //seventh row second card
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
                                                "Photo & Copy Shop",
                                                Toast.LENGTH_SHORT
                                            )
                                            .show()
                                    },

                                ) {
                                Image(
                                    painter = painterResource(id = R.drawable.photoshop),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .height(50.dp)
                                        .width(50.dp)
                                )
                                Text(
                                    text = "Photo & Copy Shop",
                                    textAlign = TextAlign.Center,
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    fontFamily = fontFamily,
                                    fontWeight = FontWeight.Light,
                                    modifier = Modifier.padding(top = 5.dp)
                                )
                            }
                        }

                        //seventh row third card
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
                                                "Property Dealer",
                                                Toast.LENGTH_SHORT
                                            )
                                            .show()
                                    },

                                ) {
                                Image(
                                    painter = painterResource(id = R.drawable.propertydealer),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .height(50.dp)
                                        .width(50.dp)
                                )
                                Text(
                                    text = "Property Dealer",
                                    textAlign = TextAlign.Center,
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    fontFamily = fontFamily,
                                    fontWeight = FontWeight.Light,
                                    modifier = Modifier.padding(top = 5.dp)
                                )
                            }
                        }
                    }


                    // eighth row with 3 cards
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
                                                "Restaurants",
                                                Toast.LENGTH_SHORT
                                            )
                                            .show()
                                    },

                                ) {
                                Image(
                                    painter = painterResource(id = R.drawable.restaurant),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .height(50.dp)
                                        .width(50.dp)
                                )
                                Text(
                                    text = "Restaurants",
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
                                                "Steel $ Iron",
                                                Toast.LENGTH_SHORT
                                            )
                                            .show()
                                    },

                                ) {
                                Image(
                                    painter = painterResource(id = R.drawable.steeliron),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .height(50.dp)
                                        .width(50.dp)
                                )
                                Text(
                                    text = "Steel $ Iron",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    fontFamily = fontFamily,
                                    fontWeight = FontWeight.Light,
                                    modifier = Modifier.padding(top = 10.dp)
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
                                                "Sweets",
                                                Toast.LENGTH_SHORT
                                            )
                                            .show()
                                    },

                                ) {
                                Image(
                                    painter = painterResource(id = R.drawable.sweets),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .height(50.dp)
                                        .width(50.dp)
                                )
                                Text(
                                    text = "Sweets",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    fontFamily = fontFamily,
                                    fontWeight = FontWeight.Light,
                                    modifier = Modifier.padding(top = 10.dp)
                                )
                            }
                        }
                    }

                    // nine row with 3 cards
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
                                                "Tehsil Office",
                                                Toast.LENGTH_SHORT
                                            )
                                            .show()
                                    },

                                ) {
                                Image(
                                    painter = painterResource(id = R.drawable.tehsiloffice),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .height(50.dp)
                                        .width(50.dp)
                                )
                                Text(
                                    text = "Tehsil Office",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    fontFamily = fontFamily,
                                    fontWeight = FontWeight.Light,
                                    modifier = Modifier.padding(top = 10.dp)
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
                                                applicationContext, "Wood Work", Toast.LENGTH_SHORT
                                            )
                                            .show()
                                    },

                                ) {
                                Image(
                                    painter = painterResource(id = R.drawable.woodworking),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .height(50.dp)
                                        .width(50.dp)
                                )
                                Text(
                                    text = "Wood Work",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    fontFamily = fontFamily,
                                    fontWeight = FontWeight.Light,
                                    modifier = Modifier.padding(top = 10.dp)
                                )
                            }
                        }

                        //third row third card
                        /*                        Card(
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
                                                                        applicationContext, "Unknown", Toast.LENGTH_SHORT
                                                                    )
                                                                    .show()
                                                            },

                                                        ) {
                                                        Image(
                                                            painter = painterResource(id = R.drawable.transport),
                                                            contentDescription = null,
                                                            modifier = Modifier
                                                                .height(50.dp)
                                                                .width(50.dp)
                                                        )
                                                        Text(
                                                            text = "Unknown",
                                                            color = Color.Black,
                                                            fontSize = 15.sp,
                                                            fontFamily = fontFamily,
                                                            fontWeight = FontWeight.Light,
                                                            modifier = Modifier.padding(top = 10.dp)
                                                        )
                                                    }
                                                }*/
                    }
                    //categories end
                }
            }
        }
    }
}
