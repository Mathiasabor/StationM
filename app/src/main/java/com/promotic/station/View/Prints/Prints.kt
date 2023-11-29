package com.promotic.station.View.Prints

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.expandIn
import androidx.compose.animation.shrinkOut
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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.promotic.station.Model.Facture
import com.promotic.station.R
import com.promotic.station.View.Bons.Bons

@Preview(showBackground = true)
@Composable
fun Prints()
{

    Box(modifier = Modifier.fillMaxSize())
    {
        Box(modifier = Modifier.fillMaxSize())
        {

            Surface (
                //  color =Color(150, 0, 24)  ,
                modifier = Modifier.fillMaxSize()){

                Image(painter = painterResource(id = R.drawable.i99),
                    contentDescription = "i99", contentScale = ContentScale.FillBounds)



            }

        }

        Box(modifier = Modifier.fillMaxSize() ){

            Surface ( shape = RoundedCornerShape(topStart = 50.dp, topEnd = 50.dp),
                modifier = Modifier
                    .padding(top = 100.dp)
                    .fillMaxSize()

            ){

                Image(painter = painterResource(id = R.drawable.splashrouge),
                    contentDescription ="splashrouge",
                    contentScale = ContentScale.FillBounds
                )

            }


        }


        Box(modifier = Modifier.fillMaxSize())
        {
            Column(horizontalAlignment = Alignment.CenterHorizontally,

                modifier = Modifier
                    .fillMaxSize()
                    .padding(30.dp)
                    .background(color = Color.Transparent)) {

                Row(horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxWidth()) {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(painter = painterResource(id = R.drawable.annuler), contentDescription = "menu", tint = Color.White, modifier = Modifier.size(50.dp))
                    }

                    Card (

                        border= BorderStroke(width = 3.dp, color = Color(255,128,0)),
                        shape = CircleShape, modifier = Modifier.size(50.dp) ){
                        Image(painter = painterResource(id = R.drawable.profil), contentDescription = "im", contentScale = ContentScale.FillBounds, modifier = Modifier.fillMaxSize())
                    }



                }

                Card (


                    shape = RoundedCornerShape(50.dp), modifier = Modifier.padding(start = 50.dp, end = 50.dp) ){
                    Text(text = "Mes Imprimés", fontSize = 20.sp, modifier = Modifier.padding(5.dp))
                }

                Spacer(modifier = Modifier.padding(10.dp))

                Bons()



            }


        }

    }
}

