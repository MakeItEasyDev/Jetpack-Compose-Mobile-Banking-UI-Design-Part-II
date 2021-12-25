package com.jetpack.mobilebankingui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jetpack.mobilebankingui.ui.theme.*

@ExperimentalMaterialApi
@Composable
fun MobileBankingUI() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(BankColor)
    ) {
        Spacer(modifier = Modifier.height(25.dp))
        Column(
            modifier = Modifier
                .weight(0.28f)
                .fillMaxSize()
                .padding(start = 20.dp, end = 20.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(60.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "$4,258.50",
                    color = Color.White,
                    fontFamily = FontFamily(Font(R.font.poppins_bold)),
                    modifier = Modifier.weight(1f),
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold
                )
                Column(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxWidth()
                ) {
                    Row(
                        modifier = Modifier
                            .align(Alignment.End),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        BadgeBox(
                            backgroundColor = BadgeColor
                        ) {
                            Icon(
                                Icons.Filled.Notifications,
                                contentDescription = "Notification",
                                tint = NotifyColor,
                                modifier = Modifier
                                    .rotate(10f)
                                    .size(25.dp)
                            )
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Image(
                            painter = painterResource(id = R.drawable.makeiteasy),
                            contentDescription = "Profile Icon",
                            contentScale = ContentScale.Fit,
                            modifier = Modifier
                                .border(1.dp, Color.White, RoundedCornerShape(10.dp))
                                .size(40.dp)
                                .padding(3.dp)
                                .clip(RoundedCornerShape(7.dp))
                        )
                    }
                }
            }
            Text(
                text = "Available Balance",
                color = Color.White.copy(alpha = 0.5f),
                fontFamily = FontFamily(Font(R.font.poppins_light)),
                fontSize = 14.sp
            )
            Spacer(modifier = Modifier.height(15.dp))
            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(
                    modifier = Modifier.weight(1f),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Column(
                        modifier = Modifier
                            .clip(RoundedCornerShape(20.dp))
                            .background(Color.White)
                            .size(65.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.send),
                            contentDescription = "Send",
                            modifier = Modifier.size(35.dp),
                            colorFilter = ColorFilter.tint(BankColor)
                        )
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "Send",
                        color = Color.White.copy(alpha = 0.5f),
                        fontFamily = FontFamily(Font(R.font.poppins_light)),
                        fontSize = 14.sp
                    )
                }
                Column(
                    modifier = Modifier.weight(1f),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Column(
                        modifier = Modifier
                            .clip(RoundedCornerShape(20.dp))
                            .background(Color.White)
                            .size(65.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.request),
                            contentDescription = "Request",
                            modifier = Modifier.size(35.dp),
                            colorFilter = ColorFilter.tint(BankColor)
                        )
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "Request",
                        color = Color.White.copy(alpha = 0.5f),
                        fontFamily = FontFamily(Font(R.font.poppins_light)),
                        fontSize = 14.sp
                    )
                }
                Column(
                    modifier = Modifier.weight(1f),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Column(
                        modifier = Modifier
                            .clip(RoundedCornerShape(20.dp))
                            .background(Color.White)
                            .size(65.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.loan),
                            contentDescription = "Loan",
                            modifier = Modifier.size(35.dp),
                            colorFilter = ColorFilter.tint(BankColor)
                        )
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "Loan",
                        color = Color.White.copy(alpha = 0.5f),
                        fontFamily = FontFamily(Font(R.font.poppins_light)),
                        fontSize = 14.sp
                    )
                }
                Column(
                    modifier = Modifier.weight(1f),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Column(
                        modifier = Modifier
                            .clip(RoundedCornerShape(20.dp))
                            .background(Color.White)
                            .size(65.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.top_up),
                            contentDescription = "Topup",
                            modifier = Modifier.size(35.dp),
                            colorFilter = ColorFilter.tint(BankColor)
                        )
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(
                        text = "Topup",
                        color = Color.White.copy(alpha = 0.5f),
                        fontFamily = FontFamily(Font(R.font.poppins_light)),
                        fontSize = 14.sp
                    )
                }
            }
        }
        Column(
            modifier = Modifier
                .weight(0.72f)
                .fillMaxSize()
                .clip(RoundedCornerShape(topStart = 35.dp, topEnd = 35.dp))
                .background(BgColor)
                .padding(20.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(
                    modifier = Modifier.weight(0.7f)
                ) {
                    Text(
                        text = "Recent Transactions",
                        fontFamily = FontFamily(Font(R.font.poppins_bold)),
                        color = BankColor,
                        fontSize = 22.sp,
                        modifier = Modifier.fillMaxWidth()
                    )
                }
                Column(
                    modifier = Modifier
                        .weight(0.3f)
                        .fillMaxWidth()
                ) {
                    Column(
                        modifier = Modifier.align(Alignment.End)
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = "See all",
                                fontFamily = FontFamily(Font(R.font.poppins_bold)),
                                color = BankColor.copy(alpha = 0.7f),
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }
                }
            }
            Spacer(modifier = Modifier.height(5.dp))
            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                Card(
                    modifier = Modifier.padding(5.dp),
                    elevation = 0.dp,
                    backgroundColor = Color.White,
                    shape = RoundedCornerShape(15.dp)
                ) {
                    Text(
                        text = "All",
                        color = BankColor,
                        modifier = Modifier.padding(start = 15.dp, end = 15.dp, top = 5.dp, bottom = 5.dp),
                        fontFamily = FontFamily(Font(R.font.poppins_medium)),
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
                Card(
                    modifier = Modifier.padding(5.dp),
                    elevation = 0.dp,
                    backgroundColor = Color.White,
                    shape = RoundedCornerShape(15.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .padding(start = 15.dp, end = 15.dp, top = 5.dp, bottom = 5.dp)
                            .alpha(0.4f),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.arrow_down),
                            contentDescription = "Income",
                            colorFilter = ColorFilter.tint(GreenColor)
                        )
                        Spacer(modifier = Modifier.width(5.dp))
                        Text(
                            text = "Income",
                            color = BankColor,
                            fontFamily = FontFamily(Font(R.font.poppins_medium)),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
                Card(
                    modifier = Modifier.padding(5.dp),
                    elevation = 0.dp,
                    backgroundColor = Color.White,
                    shape = RoundedCornerShape(15.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .padding(start = 15.dp, end = 15.dp, top = 5.dp, bottom = 5.dp)
                            .alpha(0.4f),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.arrow_up),
                            contentDescription = "Expense",
                            colorFilter = ColorFilter.tint(BadgeColor)
                        )
                        Spacer(modifier = Modifier.width(5.dp))
                        Text(
                            text = "Expense",
                            color = BankColor,
                            fontFamily = FontFamily(Font(R.font.poppins_medium)),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(5.dp))
            Text(
                text = "TODAY",
                color = TextColor,
                fontFamily = FontFamily(Font(R.font.poppins_bold)),
                fontSize = 18.sp
            )
            Spacer(modifier = Modifier.height(5.dp))
            Card(
                modifier = Modifier,
                elevation = 0.dp,
                backgroundColor = Color.White,
                shape = RoundedCornerShape(15.dp)
            ) {
                LazyColumn {
                    items(2) { index ->
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(15.dp)
                        ) {
                            Column(
                                modifier = Modifier.weight(0.2f),
                                verticalArrangement = Arrangement.Center
                            ) {
                                Column(
                                    modifier = Modifier
                                        .clip(RoundedCornerShape(20.dp))
                                        .background(ItemBgColor)
                                        .size(65.dp),
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    verticalArrangement = Arrangement.Center
                                ) {
                                    Image(
                                        painter = painterResource(
                                            id = if (index % 2 == 0) {
                                                R.drawable.groceries
                                            } else {
                                                R.drawable.car
                                            }
                                        ),
                                        contentDescription = "Item Image",
                                        modifier = Modifier.size(40.dp),
                                        colorFilter = ColorFilter.tint(BankColor)
                                    )
                                }
                            }
                            Spacer(modifier = Modifier.width(10.dp))
                            Column(
                                modifier = Modifier.weight(0.55f),
                                verticalArrangement = Arrangement.Center
                            ) {
                                Text(
                                    text = if (index % 2 == 0) {
                                        "Grocery"
                                    } else {
                                        "Transport"
                                    },
                                    color = BankColor,
                                    fontFamily = FontFamily(Font(R.font.poppins_bold)),
                                    fontSize = 17.sp
                                )
                                Text(
                                    text = if (index % 2 == 0) {
                                        "Eataly Downtown"
                                    } else {
                                        "UBER Pool"
                                    },
                                    color = TextColor,
                                    fontFamily = FontFamily(Font(R.font.poppins_medium)),
                                    fontSize = 15.sp
                                )
                            }
                            Column(
                                modifier = Modifier
                                    .weight(0.25f)
                                    .fillMaxWidth()
                            ) {
                                Text(
                                    text = if (index % 2 == 0) {
                                        "-$50.68"
                                    } else {
                                        "-$16.02"
                                    },
                                    color = BankColor,
                                    fontFamily = FontFamily(Font(R.font.poppins_bold)),
                                    fontSize = 17.sp,
                                    modifier = Modifier.fillMaxWidth(),
                                    textAlign = TextAlign.End
                                )
                                Text(
                                    text = if (index % 2 == 0) {
                                        "Oct 14"
                                    } else {
                                        "Oct 14"
                                    },
                                    color = TextColor,
                                    fontFamily = FontFamily(Font(R.font.poppins_medium)),
                                    fontSize = 15.sp,
                                    modifier = Modifier.fillMaxWidth(),
                                    textAlign = TextAlign.End
                                )
                            }
                        }
                        Divider(modifier = Modifier.height(1.5.dp), color = BgColor)
                    }
                }
            }
            Spacer(modifier = Modifier.height(5.dp))
            Text(
                text = "YESTERDAY",
                color = TextColor,
                fontFamily = FontFamily(Font(R.font.poppins_bold)),
                fontSize = 18.sp
            )
            Spacer(modifier = Modifier.height(5.dp))
            Card(
                modifier = Modifier,
                elevation = 0.dp,
                backgroundColor = Color.White,
                shape = RoundedCornerShape(15.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(15.dp)
                ) {
                    Column(
                        modifier = Modifier.weight(0.2f),
                        verticalArrangement = Arrangement.Center
                    ) {
                        Column(
                            modifier = Modifier
                                .clip(RoundedCornerShape(20.dp))
                                .background(ItemBgColor)
                                .size(65.dp),
                            horizontalAlignment = Alignment.CenterHorizontally,
                            verticalArrangement = Arrangement.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.payment),
                                contentDescription = "Item Image",
                                modifier = Modifier.size(40.dp),
                                colorFilter = ColorFilter.tint(BankColor)
                            )
                        }
                    }
                    Spacer(modifier = Modifier.width(10.dp))
                    Column(
                        modifier = Modifier.weight(0.55f),
                        verticalArrangement = Arrangement.Center
                    ) {
                        Text(
                            text = "Payment",
                            color = BankColor,
                            fontFamily = FontFamily(Font(R.font.poppins_bold)),
                            fontSize = 17.sp
                        )
                        Text(
                            text = "Payment from Andre",
                            color = TextColor,
                            fontFamily = FontFamily(Font(R.font.poppins_medium)),
                            fontSize = 15.sp
                        )
                    }
                    Column(
                        modifier = Modifier
                            .weight(0.25f)
                            .fillMaxWidth()
                    ) {
                        Text(
                            text = "+$650.00",
                            color = GreenColor,
                            fontFamily = FontFamily(Font(R.font.poppins_bold)),
                            fontSize = 17.sp,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.End
                        )
                        Text(
                            text = "Sep 3",
                            color = TextColor,
                            fontFamily = FontFamily(Font(R.font.poppins_medium)),
                            fontSize = 15.sp,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.End
                        )
                    }
                }
            }
        }
    }
}




















