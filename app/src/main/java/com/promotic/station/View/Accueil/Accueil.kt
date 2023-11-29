package com.promotic.station.View.Accueil


import android.annotation.SuppressLint
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.animateIntAsState
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.BorderStroke
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

import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button

import androidx.compose.material3.Card

import androidx.compose.material3.CardDefaults

import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.platform.LocalConfiguration

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.promotic.station.View.Accueil.Component.Menu
import com.promotic.station.R
import com.promotic.station.View.Formulaire.FormSty

@SuppressLint("CoroutineCreationDuringComposition")
@Preview(showBackground = true)
@Composable

fun Accueil()
{

    val rs = rememberCoroutineScope()
    var a = remember{ mutableStateOf(0)}
    //val configuration = LocalConfiguration.current
    //val screenWidth = configuration.screenWidthDp.dp
    //val screenHeight = configuration.screenHeightDp.dp
    Surface(
        color = Color.Transparent,

        modifier = Modifier.fillMaxSize())
    {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp)

                .verticalScroll(rememberScrollState())
        )
        {

            Card(
                colors = CardDefaults.cardColors(
                    containerColor = Color.DarkGray,
                    contentColor = Color.White
                ),
                modifier = Modifier
                    .fillMaxWidth()

                    .height(250.dp),
                shape = RoundedCornerShape(30.dp),

                elevation = CardDefaults.cardElevation(
                    defaultElevation = 6.dp
                ),


                ) {


                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(20.dp)
                )
                {
                    Text(
                        text = "Station Adidogomé",
                        fontSize = 20.sp,
                        modifier = Modifier.align(Alignment.TopStart),

                        )

                    Card(shape = CircleShape,

                        border = BorderStroke(width = 2.dp, color = Color.Red),
                        modifier = Modifier
                            .size(50.dp)
                            .align(Alignment.TopEnd)) {
                        Image(painter = painterResource(id = R.drawable.logo), contentDescription = "")
                    }

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .align(Alignment.Center)
                    ) {

                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,

                            modifier = Modifier.weight(0.3f)
                        ) {
                            Text(text = "émmis", fontSize = 15.sp)
                            

                               // AnimatedVisibility(visible = true, enter = slideInVertically(animationSpec = tween(durationMillis = 3000), initialOffsetY = {-it})) {

                           // }

                            Text(text = "${a.value}", modifier = Modifier.animateContentSize(animationSpec = tween(3000)))

                        }
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier.weight(0.3f)
                        ) {
                            Text(text = "validés", fontSize = 15.sp)


                        }
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier.weight(0.3f)
                        ) {
                            Text(text = "Non validés", fontSize = 15.sp)
                        }

                    }


                }


            }

            Spacer(modifier = Modifier.padding(20.dp))
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,

                modifier = Modifier.fillMaxWidth()
            )
            {


                Menu(titre = "Bons", desc = "Emettez votre bon de carburant ici", click = {})



                Menu(titre = "Mes Bons", desc = "Accédez à la liste de vos bons emmis", click = {})


            }

            Spacer(modifier = Modifier.padding(10.dp))

            Row(
                horizontalArrangement = Arrangement.SpaceBetween,

                modifier = Modifier.fillMaxWidth()
            )
            {


                Menu(titre = "Validation", desc = "Validez vos bons émis", click = {})


                Menu(titre = "Bons", desc = "Emettez votre bon de carburant ici", click = {})


            }


        }


    }


    repeat(times= 2){

        if(a.value <800){
            a.value ++
        }




    }


}
@Preview
@Composable
fun kout()
{
    Box(modifier = Modifier.fillMaxSize()) {
        FormSty()
        Accueil()
    }
}



