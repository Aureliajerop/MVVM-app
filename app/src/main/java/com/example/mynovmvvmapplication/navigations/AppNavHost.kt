package com.example.mynovmvvmapplication.navigations

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mvvmnavigation.ui.theme.screens.about.BmiScreen
import com.example.mvvmnavigation.ui.theme.screens.signup.CalculatorScreen

import com.example.mynovmvvmapplication.ui.theme.screens.home.HomeScreen
import com.example.mynovmvvmapplication.ui.theme.screens.intents.IntentsScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination:String= ROUTE_HOME

){
    NavHost(navController = navController, 
        startDestination = startDestination, 
        modifier = modifier){
        composable(ROUTE_HOME){
            HomeScreen(navController = navController)
        }
        composable(ROUTE_BMI){
            BmiScreen(navController = navController)
        }
        composable(ROUTE_CALCULATOR){
            CalculatorScreen(navController = navController)
        }
        composable(ROUTE_INTENTS){
            IntentsScreen(navController = navController)
        }
    }
    
}