package com.example.fauth.navigation

sealed class NavRoutes(val routes:String){
    object LOGIN:NavRoutes("login")
    object SIGNUP:NavRoutes("signup")
    object WELCOME:NavRoutes("welcome")
}
