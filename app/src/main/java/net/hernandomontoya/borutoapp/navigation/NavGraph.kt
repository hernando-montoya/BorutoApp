package net.hernandomontoya.borutoapp.navigation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import coil.annotation.ExperimentalCoilApi
import com.google.accompanist.pager.ExperimentalPagerApi
import net.hernandomontoya.borutoapp.presentaiton.screens.details.DetailsScreen
import net.hernandomontoya.borutoapp.presentaiton.screens.home.HomeScreen
import net.hernandomontoya.borutoapp.presentaiton.screens.search.SearchScreen
import net.hernandomontoya.borutoapp.presentaiton.screens.splash.SplashScreen
import net.hernandomontoya.borutoapp.presentaiton.screens.welcome.WelcomeScreen
import net.hernandomontoya.borutoapp.util.Constants.DETAILS_ARGUMENTS_KEY

@ExperimentalMaterialApi
@ExperimentalCoilApi
@ExperimentalAnimationApi
@ExperimentalPagerApi
@Composable
fun SetupNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.Splash.route
    ) {
        composable(route = Screen.Splash.route) {
            SplashScreen(navController = navController)
        }
        composable(route = Screen.Welcome.route) {
            WelcomeScreen(navController = navController)
        }
        composable(route = Screen.Home.route) {
            HomeScreen(navController = navController)
        }
        composable(
            route = Screen.Details.route,
            arguments = listOf(navArgument(DETAILS_ARGUMENTS_KEY) {
                type = NavType.IntType
            })
        ) {
            DetailsScreen(navController = navController)
        }
        composable(route = Screen.Search.route) {
            SearchScreen(navController)
        }
    }
}