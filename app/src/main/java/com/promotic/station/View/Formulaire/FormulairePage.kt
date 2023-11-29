package com.promotic.station.View.Formulaire

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.promotic.station.R
import com.promotic.station.View.Formulaire.Component.OptionInput
import com.promotic.station.ViewModel.FormulaireViewModel

@Preview(showBackground = true)
@Composable

fun testformulaire()
{
    var vm = FormulaireViewModel()
    FormulairePage(vm = vm)
}



@Composable

fun FormulairePage( vm : FormulaireViewModel){

    Column (modifier = Modifier.fillMaxSize()){

        Column ( horizontalAlignment = Alignment.CenterHorizontally,modifier = Modifier.fillMaxWidth()){
            Text(text =" BON CARBURANT ET LUBRIFIANT ", fontSize = 25.sp)

            Spacer(modifier = Modifier.padding(6.dp))

            Text(text = "N° : ${vm._Id.value}")

        }

        Spacer(modifier = Modifier.padding(12.dp))

        //OptionInput({})




    }
}
@Preview
@Composable

fun FormSty()
{
    Box(modifier = Modifier.fillMaxSize() ){

       Box(modifier = Modifier.fillMaxSize()){
           Surface(
               shape = RoundedCornerShape(0.dp,0.dp,0.dp,100.dp),
               color = Color.Red,

               modifier = Modifier
                   .width(100.dp)
                   .height(100.dp)

                   .align(Alignment.TopEnd)

           ) {

           }




           Surface(
               shape = RoundedCornerShape(0.dp,100.dp,0.dp,0.dp),
               color = Color.Black,
               modifier = Modifier
                   .width(100.dp)
                   .height(100.dp)

                   .align(Alignment.BottomStart)

           ) {

           }


               Box(modifier = Modifier
                   .fillMaxSize(),

                   contentAlignment = Alignment.Center

                    ){
                   Image(
                       painter = painterResource(id = R.drawable.logo),
                       contentDescription ="logo",
                       modifier = Modifier.size(150.dp),

                       )
               }



       }

        //Box(modifier = Modifier.fillMaxSize()){

          //  Text(text = "extension api express js", color = Color.White)
       // }







    }

}

