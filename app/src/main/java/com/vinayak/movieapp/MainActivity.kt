package com.vinayak.movieapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.vinayak.movieapp.navagation.MovieNavigation
import com.vinayak.movieapp.ui.theme.MovieAppTheme

@ExperimentalAnimationApi
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp {
                MovieNavigation()
            }
        }
    }
}
@Composable
fun MyApp(content: @Composable () -> Unit) {
    MovieAppTheme {
        content()
         

    }

}

@ExperimentalAnimationApi
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
   MyApp {
      MovieNavigation()
   }
}