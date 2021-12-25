package com.jetpack.mobilebankingui.navigation

sealed class Screen(val route: String, val title: String) {
    object Home: Screen("Home", "Home")
    object Cards: Screen("Cards", "Cards")
}
