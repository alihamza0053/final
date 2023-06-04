package com.digital.yazman.ah

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsDraggedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.digital.yazman.ah.ui.theme.DigitalYazmanTheme
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.PagerState
import kotlinx.coroutines.delay
import kotlin.time.Duration.Companion.seconds

class menuActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DigitalYazmanTheme {

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
                val images = listOf(
                    "https://gamingrust.me/wp-content/uploads/2023/04/Black-Urban-City-T-Shirts-1-1.png",
                    "https://gamingrust.me/wp-content/uploads/2023/04/Annotation-2023-04-30-005644.jpg",
                    "https://gamingrust.me/wp-content/uploads/2023/04/Black-Simple-Monoline-Letter-DY-Logo.png",
                    "https://gamingrust.me/wp-content/uploads/2023/04/creative-coming-soon-teaser-background-free-vector.webp",

                    )
                var exit = 0
                val context = LocalContext.current

                // topbar start
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color(0xFFADD8E6))


                ) {
                    Row(
                        modifier = Modifier
                            .background(Color(0xFF800080))
                            .fillMaxWidth()
                            .padding(10.dp), verticalAlignment = Alignment.CenterVertically

                    ) {
                        Image(painter = painterResource(id = R.drawable.back_white),
                            contentDescription = null,
                            modifier = Modifier
                                .width(25.dp)
                                .height(25.dp)
                                .clickable {
                                    if (exit == 0) {
                                        exit++
                                        Toast
                                            .makeText(
                                                applicationContext,
                                                "press again to exit",
                                                Toast.LENGTH_SHORT
                                            )
                                            .show()
                                    } else if (exit > 0) {
                                        finish()
                                    }
                                })
                        Spacer(
                            modifier = Modifier.weight(1f)
                        )
                        Text(
                            text = "Ali Hamza",
                            fontSize = 20.sp,
                            fontFamily = fontFamily,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFFFFFFFF),
                        )
                        Image(
                            painter = painterResource(id = R.drawable.admin_king),
                            contentDescription = null,
                            modifier = Modifier
                                .width(15.dp)
                                .height(15.dp)
                        )
                        Spacer(
                            modifier = Modifier.weight(1f)
                        )
                        Text(text = "Login",
                            fontSize = 15.sp,
                            fontFamily = fontFamily,
                            fontWeight = FontWeight.Bold,
                            color = Color(0xFFFFFFFF),
                            modifier = Modifier.clickable {
                                    context.startActivity(
                                        Intent(
                                            context, Login::class.java
                                        )
                                    )
                                })
                    }

                    // topbar end

                    // slides images start
                    Column(modifier = Modifier.weight(1f)) {
                        Text(
                            text = "Announcements",
                            color = Color(0xFF000000),
                            fontSize = 25.sp,
                            fontFamily = fontFamily,
                            fontWeight = FontWeight.SemiBold,
                            modifier = Modifier.padding(start = 20.dp, top = 10.dp)
                        )

                        @OptIn(ExperimentalPagerApi::class) (Card(
                            modifier = Modifier.padding(16.dp),
                            shape = RoundedCornerShape(16.dp),
                        ) {
                            AutoSlidingCarousel(itemsCount = images.size, itemContent = { index ->
                                AsyncImage(
                                    model = ImageRequest.Builder(LocalContext.current)
                                        .data(images[index]).build(),
                                    contentDescription = null,
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier.height(200.dp)
                                )
                            })
                        })
                        // slides images end


                        //categories start
                        Text(
                            text = "Categories",
                            color = Color(0xFF000000),
                            fontSize = 25.sp,
                            fontFamily = fontFamily,
                            fontWeight = FontWeight.SemiBold,
                            modifier = Modifier.padding(start = 20.dp, top = 1.dp)
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
                                backgroundColor = Color(0xFFf2f2f2),
                                modifier = Modifier.padding(20.dp)
                            ) {
                                Column(
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.Center,
                                    modifier = Modifier
                                        .height(90.dp)
                                        .width(90.dp)
                                        .clickable {
                                            context.startActivity(
                                                Intent(
                                                    context, Businesses::class.java
                                                )
                                            )
                                        },

                                    ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.businesses),
                                        contentDescription = null,
                                        modifier = Modifier
                                            .height(50.dp)
                                            .width(50.dp)
                                    )
                                    Text(
                                        text = "Businesses",
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
                                            context.startActivity(
                                                Intent(
                                                    context, Emergency::class.java
                                                )
                                            )
                                        },

                                    ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.emergency),
                                        contentDescription = null,
                                        modifier = Modifier
                                            .height(50.dp)
                                            .width(50.dp)
                                    )
                                    Text(
                                        text = "Emergency",
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
                                            context.startActivity(
                                                Intent(
                                                    context, History::class.java
                                                )
                                            )
                                        },

                                    ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.history),
                                        contentDescription = null,
                                        modifier = Modifier
                                            .height(50.dp)
                                            .width(50.dp)
                                    )
                                    Text(
                                        text = "History",
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
                                            context.startActivity(
                                                Intent(
                                                    context, LocalDeals::class.java
                                                )
                                            )
                                        },

                                    ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.local_deal),
                                        contentDescription = null,
                                        modifier = Modifier
                                            .height(50.dp)
                                            .width(50.dp)
                                    )
                                    Text(
                                        text = "Local Deals",
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
                                            context.startActivity(
                                                Intent(
                                                    context, LocalNews::class.java
                                                )
                                            )
                                        },

                                    ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.local_news),
                                        contentDescription = null,
                                        modifier = Modifier
                                            .height(50.dp)
                                            .width(50.dp)
                                    )
                                    Text(
                                        text = "Local News",
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
                                            context.startActivity(
                                                Intent(
                                                    context, Opportunities::class.java

                                                )
                                            )
                                        },

                                    ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.opportunities),
                                        contentDescription = null,
                                        modifier = Modifier
                                            .height(50.dp)
                                            .width(50.dp)
                                    )
                                    Text(
                                        text = "Opportunities",
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
                                            context.startActivity(
                                                Intent(
                                                    context, Services::class.java
                                                )
                                            )
                                        },

                                    ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.services),
                                        contentDescription = null,
                                        modifier = Modifier
                                            .height(50.dp)
                                            .width(50.dp)
                                    )
                                    Text(
                                        text = "Services",
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
                                            context.startActivity(
                                                Intent(
                                                    context, Support::class.java
                                                )
                                            )
                                        },

                                    ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.supprot),
                                        contentDescription = null,
                                        modifier = Modifier
                                            .height(50.dp)
                                            .width(50.dp)
                                    )
                                    Text(
                                        text = "Support",
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
                                            context.startActivity(
                                                Intent(
                                                    context, Transport::class.java
                                                )
                                            )
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
                                        text = "Transport",
                                        color = Color.Black,
                                        fontSize = 15.sp,
                                        fontFamily = fontFamily,
                                        fontWeight = FontWeight.Light,
                                        modifier = Modifier.padding(top = 10.dp)
                                    )
                                }
                            }
                        }
                        //categories end
                    }
                }
            }

        }
    }
}


// image slider start
@Composable
fun IndicatorDot(
    modifier: Modifier = Modifier, size: Dp, color: Color
) {
    Box(
        modifier = modifier
            .size(size)
            .clip(CircleShape)
            .background(color)
    )
}


@Composable
fun DotsIndicator(
    modifier: Modifier = Modifier,
    totalDots: Int,
    selectedIndex: Int,
    selectedColor: Color = Color(0xFFADD8E6),
    unSelectedColor: Color = Color.Gray,
    dotSize: Dp
) {
    LazyRow(
        modifier = modifier
            .wrapContentWidth()
            .wrapContentHeight()
    ) {
        items(totalDots) { index ->
            IndicatorDot(
                color = if (index == selectedIndex) selectedColor else unSelectedColor,
                size = dotSize
            )

            if (index != totalDots - 1) {
                Spacer(modifier = Modifier.padding(horizontal = 2.dp))
            }
        }
    }
}


@OptIn(ExperimentalPagerApi::class)
@Composable
fun AutoSlidingCarousel(
    modifier: Modifier = Modifier,
    //   autoSlideDuration: Long = AUTO_SLIDE_DURATION,
    pagerState: PagerState = remember { PagerState() },
    itemsCount: Int,
    itemContent: @Composable (index: Int) -> Unit,
) {
    val isDragged by pagerState.interactionSource.collectIsDraggedAsState()

    LaunchedEffect(pagerState.currentPage) {
        delay(5.seconds)
        pagerState.animateScrollToPage((pagerState.currentPage + 1) % itemsCount)
    }

    Box(
        modifier = modifier.fillMaxWidth(),
    ) {
        HorizontalPager(count = itemsCount, state = pagerState) { page ->
            itemContent(page)
        }

        // you can remove the surface in case you don't want
        // the transparant bacground
        Surface(
            modifier = Modifier
                .padding(bottom = 8.dp)
                .align(Alignment.BottomCenter),
            shape = CircleShape,
            color = Color.Black.copy(alpha = 0.5f)
        ) {
            DotsIndicator(
                modifier = Modifier.padding(horizontal = 8.dp, vertical = 6.dp),
                totalDots = itemsCount,
                selectedIndex = if (isDragged) pagerState.currentPage else pagerState.targetPage,
                dotSize = 8.dp
            )
        }
    }
}
// image slider start