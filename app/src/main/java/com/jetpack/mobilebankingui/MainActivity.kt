package com.jetpack.mobilebankingui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.size
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Person
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.jetpack.mobilebankingui.navigation.Screen
import com.jetpack.mobilebankingui.ui.theme.BankColor
import com.jetpack.mobilebankingui.ui.theme.MobileBankingUITheme

@ExperimentalMaterialApi
@ExperimentalAnimationApi
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MobileBankingUITheme {
                Surface(color = MaterialTheme.colors.background) {
                    val navController = rememberNavController()
                    Scaffold(
                        bottomBar = {
                            BottomNavigation(
                                backgroundColor = Color.White,
                                elevation = 0.dp
                            ) {
                                BottomNavigationItem(
                                    selected = true,
                                    onClick = {
                                        navController.navigate(Screen.Home.route)
                                    },
                                    alwaysShowLabel = true,
                                    icon = {
                                        Icon(
                                            Icons.Outlined.Home,
                                            contentDescription = "Home",
                                            tint = BankColor
                                        )
                                    },
                                    label = {
                                        Text(
                                            text = "Home",
                                            fontSize = 10.sp,
                                            fontFamily = FontFamily(Font(R.font.poppins_medium)),
                                            color = BankColor
                                        )
                                    }
                                )
                                BottomNavigationItem(
                                    selected = false,
                                    onClick = { },
                                    alwaysShowLabel = true,
                                    icon = {
                                        Icon(
                                            painter = painterResource(id = R.drawable.ic_baseline_history_toggle_off_24),
                                            contentDescription = "History",
                                            tint = BankColor
                                        )
                                    },
                                    label = {
                                        Text(
                                            text = "History",
                                            fontSize = 10.sp,
                                            fontFamily = FontFamily(Font(R.font.poppins_medium)),
                                            color = BankColor
                                        )
                                    }
                                )
                                BottomNavigationItem(
                                    selected = false,
                                    onClick = { },
                                    alwaysShowLabel = true,
                                    icon = {
                                        Icon(
                                            painter = painterResource(id = R.drawable.addition),
                                            contentDescription = "Add",
                                            tint = BankColor,
                                            modifier = Modifier.size(40.dp)
                                        )
                                    }
                                )
                                BottomNavigationItem(
                                    selected = false,
                                    onClick = {
                                        navController.navigate(Screen.Cards.route)
                                    },
                                    alwaysShowLabel = true,
                                    icon = {
                                        Icon(
                                            painter = painterResource(id = R.drawable.cards),
                                            contentDescription = "Cards",
                                            tint = BankColor
                                        )
                                    },
                                    label = {
                                        Text(
                                            text = "Cards",
                                            fontSize = 10.sp,
                                            fontFamily = FontFamily(Font(R.font.poppins_medium)),
                                            color = BankColor
                                        )
                                    }
                                )
                                BottomNavigationItem(
                                    selected = false,
                                    onClick = { },
                                    alwaysShowLabel = true,
                                    icon = {
                                        Icon(
                                            Icons.Outlined.Person,
                                            contentDescription = "Profile",
                                            tint = BankColor
                                        )
                                    },
                                    label = {
                                        Text(
                                            text = "Profile",
                                            fontSize = 10.sp,
                                            fontFamily = FontFamily(Font(R.font.poppins_medium)),
                                            color = BankColor
                                        )
                                    }
                                )
                            }
                        }
                    ) {
                        NavHost(
                            navController = navController,
                            startDestination = Screen.Home.route
                        ) {
                            composable(Screen.Home.route) {
                                MobileBankingUI()
                            }
                            composable(Screen.Cards.route) {
                                PaymentCard()
                            }
                        }
                    }
                }
            }
        }
    }
}























