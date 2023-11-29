package com.promotic.station

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.promotic.station.View.Accueil.Accueil
import com.promotic.station.View.Formulaire.Component.OptionInput2
import com.promotic.station.ViewModel.FormulaireViewModel
import com.promotic.station.ui.theme.StationMTheme

class MainActivity : ComponentActivity() {
    val vm = FormulaireViewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StationMTheme {
                // A surface container using the 'background' color from the theme
               // Surface(
                  //  modifier = Modifier.fillMaxSize(),
                 //   color = MaterialTheme.colorScheme.background
              //  ) {
               //     Greeting("Android")
              //  }

                //OptionInput2(vm)
                Accueil()
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    StationMTheme {
        Greeting("Android")
    }
}