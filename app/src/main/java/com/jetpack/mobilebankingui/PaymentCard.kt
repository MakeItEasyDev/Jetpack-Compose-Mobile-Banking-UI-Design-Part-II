package com.jetpack.mobilebankingui

import androidx.annotation.DrawableRes
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.TweenSpec
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.jetpack.mobilebankingui.ui.theme.BankColor
import com.jetpack.mobilebankingui.ui.theme.BgColor
import com.jetpack.mobilebankingui.ui.theme.GreenColor

enum class CardType(
    val title: String,
    @DrawableRes val image: Int
) {
    Visa("visa", R.drawable.ic_visa_logo)
}
@Composable
fun PaymentCard() {
    val visaType by remember { mutableStateOf(CardType.Visa) }
    val contactless = remember { mutableStateOf(false) }
    val payment = remember { mutableStateOf(false) }
    val atm = remember { mutableStateOf(false) }
    val animatedColor = animateColorAsState(targetValue = Color(0xFF1C478B))

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(BankColor)
    ) {
        Spacer(modifier = Modifier.height(10.dp))
        Column(
            modifier = Modifier
                .fillMaxSize()
                .clip(RoundedCornerShape(topStart = 35.dp, topEnd = 35.dp))
                .background(BgColor)
                .padding(20.dp)
        ) {
            Spacer(modifier = Modifier.height(10.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(
                    modifier = Modifier.weight(1f)
                ) {
                    Text(
                        text = "Your Cards",
                        color = BankColor,
                        fontFamily = FontFamily(Font(R.font.poppins_bold)),
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "1 Physical Card",
                        color = BankColor.copy(alpha = 0.5f),
                        fontFamily = FontFamily(Font(R.font.poppins_medium)),
                        fontSize = 14.sp
                    )
                }
                Column(
                    modifier = Modifier.weight(1f)
                ) {
                    Icon(
                        imageVector = Icons.Default.MoreVert,
                        contentDescription = "Menu",
                        modifier = Modifier
                            .rotate(90f)
                            .size(35.dp)
                            .align(Alignment.End),
                        tint = BankColor.copy(alpha = 0.6f)
                    )
                }
            }
            Spacer(modifier = Modifier.height(20.dp))

            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                Card(
                    modifier = Modifier
                        .padding(5.dp),
                    elevation = 0.dp,
                    backgroundColor = Color.White,
                    shape = RoundedCornerShape(15.dp)
                ) {
                    Text(
                        text = "Physical Card",
                        color = BankColor,
                        modifier = Modifier.padding(start = 15.dp, end = 15.dp, top = 5.dp, bottom = 5.dp),
                        fontFamily = FontFamily(Font(R.font.poppins_medium)),
                        fontSize = 14.sp
                    )
                }

                Card(
                    modifier = Modifier
                        .padding(5.dp),
                    elevation = 0.dp,
                    backgroundColor = Color.White,
                    shape = RoundedCornerShape(15.dp)
                ) {
                    Text(
                        text = "Virtual Card",
                        color = BankColor.copy(alpha = 0.4f),
                        modifier = Modifier.padding(start = 15.dp, end = 15.dp, top = 5.dp, bottom = 5.dp),
                        fontFamily = FontFamily(Font(R.font.poppins_medium)),
                        fontSize = 14.sp
                    )
                }
            }

            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                Card(
                    modifier = Modifier
                        .padding(top = 16.dp)
                        .fillMaxWidth()
                        .height(220.dp),
                    shape = RoundedCornerShape(25.dp),
                    backgroundColor = animatedColor.value,
                    elevation = 18.dp
                ) {
                    ConstraintLayout(
                        modifier = Modifier.fillMaxSize()
                    ) {
                        val (symbol, logo, cardName, cardNameLabel, number, expiryLabel) = createRefs()

                        Image(
                            painter = painterResource(id = R.drawable.card_symbol),
                            contentDescription = "Symbol",
                            modifier = Modifier
                                .padding(20.dp)
                                .constrainAs(symbol) {
                                    start.linkTo(parent.start)
                                    top.linkTo(parent.top)
                                }
                        )

                        Image(
                            painter = painterResource(id = visaType.image),
                            contentDescription = "Card Type",
                            modifier = Modifier
                                .padding(20.dp)
                                .constrainAs(logo) {
                                    end.linkTo(parent.end)
                                    top.linkTo(parent.top)
                                }
                        )

                        Text(
                            text = "************1234".chunked(4).joinToString("  "),
                            style = MaterialTheme.typography.h5,
                            maxLines = 1,
                            fontFamily = FontFamily(Font(R.font.poppins_bold)),
                            color = Color.White,
                            modifier = Modifier
                                .animateContentSize(spring())
                                .padding(vertical = 16.dp, horizontal = 16.dp)
                                .constrainAs(number) {
                                    linkTo(
                                        start = parent.start,
                                        end = parent.end
                                    )
                                    linkTo(
                                        top = parent.top,
                                        bottom = parent.bottom
                                    )
                                }
                        )

                        Text(
                            text = "CARD HOLDER",
                            style = MaterialTheme.typography.caption,
                            color = Color.White.copy(alpha = 0.5f),
                            fontFamily = FontFamily(Font(R.font.poppins_medium)),
                            modifier = Modifier
                                .padding(horizontal = 16.dp)
                                .constrainAs(cardNameLabel) {
                                    start.linkTo(parent.start)
                                    bottom.linkTo(cardName.top)
                                }
                        )
                        Text(
                            text = "Make it Easy",
                            style = MaterialTheme.typography.body1,
                            color = Color.White,
                            fontFamily = FontFamily(Font(R.font.poppins_bold)),
                            modifier = Modifier
                                .animateContentSize(TweenSpec(300))
                                .padding(start = 16.dp, bottom = 16.dp)
                                .constrainAs(cardName) {
                                    start.linkTo(parent.start)
                                    bottom.linkTo(parent.bottom)
                                }
                        )
                        Row(
                            modifier = Modifier
                                .wrapContentWidth()
                                .constrainAs(expiryLabel) {
                                    end.linkTo(parent.end)
                                    bottom.linkTo(parent.bottom)
                                }
                        ) {
                            Column(
                                modifier = Modifier.padding(bottom = 16.dp)
                            ) {
                                Text(
                                    text = "EXPIRES",
                                    style = MaterialTheme.typography.caption,
                                    color = Color.White.copy(alpha = 0.5f),
                                    fontFamily = FontFamily(Font(R.font.poppins_medium)),
                                    modifier = Modifier.padding(horizontal = 16.dp)
                                )
                                Text(
                                    text = "03 / 14",
                                    style = MaterialTheme.typography.body1,
                                    color = Color.White,
                                    fontFamily = FontFamily(Font(R.font.poppins_bold)),
                                    modifier = Modifier.padding(horizontal = 16.dp)
                                )
                            }
                            Column(
                                modifier = Modifier.padding(bottom = 16.dp)
                            ) {
                                Text(
                                    text = "CVV",
                                    style = MaterialTheme.typography.caption,
                                    color = Color.White.copy(alpha = 0.5f),
                                    fontFamily = FontFamily(Font(R.font.poppins_medium)),
                                    modifier = Modifier.padding(horizontal = 16.dp),
                                    textAlign = TextAlign.End
                                )
                                Text(
                                    text = "314",
                                    style = MaterialTheme.typography.body1,
                                    color = Color.White,
                                    fontFamily = FontFamily(Font(R.font.poppins_bold)),
                                    modifier = Modifier.padding(horizontal = 16.dp),
                                    textAlign = TextAlign.End
                                )
                            }
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.height(25.dp))

            Text(
                text = "Card Settings",
                color = BankColor,
                fontFamily = FontFamily(Font(R.font.poppins_bold)),
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(10.dp))

            Card(
                modifier = Modifier.padding(5.dp),
                elevation = 0.dp,
                backgroundColor = Color.White,
                shape = RoundedCornerShape(15.dp)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 10.dp, vertical = 15.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(
                        modifier = Modifier.weight(0.1f),
                        horizontalAlignment = Alignment.End
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_outline_wifi_tethering_24),
                            contentDescription = "Contactless",
                            tint = BankColor
                        )
                    }
                    Text(
                        text = "Contactless Payment",
                        color = BankColor,
                        modifier = Modifier
                            .weight(0.7f)
                            .padding(start = 15.dp),
                        fontFamily = FontFamily(Font(R.font.poppins_medium)),
                        fontSize = 16.sp
                    )
                    Switch(
                        checked = contactless.value,
                        onCheckedChange = { contactless.value = it },
                        colors = SwitchDefaults.colors(GreenColor),
                        modifier = Modifier.weight(0.2f)
                    )
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            Card(
                modifier = Modifier.padding(5.dp),
                elevation = 0.dp,
                backgroundColor = Color.White,
                shape = RoundedCornerShape(15.dp)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 10.dp, vertical = 15.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(
                        modifier = Modifier.weight(0.1f),
                        horizontalAlignment = Alignment.End
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_outline_payments_24),
                            contentDescription = "Payment",
                            tint = BankColor
                        )
                    }
                    Text(
                        text = "Online Payment",
                        color = BankColor,
                        modifier = Modifier
                            .weight(0.7f)
                            .padding(start = 15.dp),
                        fontFamily = FontFamily(Font(R.font.poppins_medium)),
                        fontSize = 16.sp
                    )
                    Switch(
                        checked = payment.value,
                        onCheckedChange = { payment.value = it },
                        colors = SwitchDefaults.colors(GreenColor),
                        modifier = Modifier.weight(0.2f)
                    )
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            Card(
                modifier = Modifier.padding(5.dp),
                elevation = 0.dp,
                backgroundColor = Color.White,
                shape = RoundedCornerShape(15.dp)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 10.dp, vertical = 15.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(
                        modifier = Modifier.weight(0.1f),
                        horizontalAlignment = Alignment.End
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_baseline_local_atm_24),
                            contentDescription = "ATM",
                            tint = BankColor
                        )
                    }
                    Text(
                        text = "ATM Withdraws",
                        color = BankColor,
                        modifier = Modifier
                            .weight(0.7f)
                            .padding(start = 15.dp),
                        fontFamily = FontFamily(Font(R.font.poppins_medium)),
                        fontSize = 16.sp
                    )
                    Switch(
                        checked = atm.value,
                        onCheckedChange = { atm.value = it },
                        colors = SwitchDefaults.colors(GreenColor),
                        modifier = Modifier.weight(0.2f)
                    )
                }
            }
        }
    }
}




















