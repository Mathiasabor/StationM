package com.promotic.station.View.Formulaire.Component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonColors
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Tab
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.promotic.station.ViewModel.FormulaireViewModel

//@Preview(showBackground = true)
@Composable
fun OptionInput2(vm : FormulaireViewModel)
{

    val selectedTabIndex = remember { mutableStateOf(0) }
    Column( horizontalAlignment = Alignment.CenterHorizontally,
       // verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)

        ) {



        Box(modifier = Modifier.fillMaxWidth() ){
            IconButton(onClick = { /*TODO*/ }, modifier = Modifier.align(Alignment.TopStart) ) {


                Icon(imageVector =Icons.Filled.ArrowBack , contentDescription = "", tint = Color.Red)
            }

            Text(text = "EMISSION", fontSize = 20.sp, fontFamily = FontFamily.Serif,fontStyle = FontStyle.Italic,modifier = Modifier
                .padding(top = 15.dp)
                .align(Alignment.TopCenter))

        }

        Spacer(modifier = Modifier.padding(20.dp))

        TabRow(selectedTabIndex = selectedTabIndex.value){
            Tab(selected = selectedTabIndex.value == 0, onClick = { selectedTabIndex.value = 0 }) {

            }

            Tab(selected = selectedTabIndex.value == 1, onClick = { selectedTabIndex.value = 1 }) {

            }
            
        }

        when (selectedTabIndex.value) {

            0->{
                OptionInput ({selectedTabIndex.value = 1}, vm)
            }

            1->{
                Button(
                    shape = RoundedCornerShape(30.dp),

                    colors = ButtonDefaults.buttonColors(containerColor = Color.Red),
                    onClick = { selectedTabIndex.value = 0 }) {
                    Text(text = "Précédent", fontSize = 20.sp, color = Color.White)
                }
            }
        }



    }
}