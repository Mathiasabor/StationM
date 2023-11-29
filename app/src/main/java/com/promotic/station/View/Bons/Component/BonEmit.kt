package com.promotic.station.View.Bons.Component

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.expandIn
import androidx.compose.animation.shrinkOut
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.promotic.station.Model.Facture


@Composable
fun BonEmit(Fact : Facture)
{
    val colort = mutableListOf<Color>(Color(255,128,0), Color.Red)
    val expanded = remember{ mutableStateOf(false)}
    
    Column (modifier = Modifier.fillMaxWidth()){

        Button (

            colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),

            shape = RoundedCornerShape(20.dp),

            onClick = {
            if (expanded.value) expanded.value = false else expanded.value = true
        },

            modifier = Modifier
                .fillMaxWidth()
                .background(
                    Brush.horizontalGradient(colort),

                    shape = RoundedCornerShape(20.dp),

                    )


            )
        {




            Column (modifier = Modifier.fillMaxWidth()){

                Row ( horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 10.dp, top = 20.dp, bottom = 20.dp)){
                    Text(text = "FACTURE N°${Fact.Id}", fontSize = 30.sp, fontFamily = FontFamily.Serif)


                    Icon(imageVector = if(expanded.value) Icons.Filled.KeyboardArrowUp else Icons.Filled.KeyboardArrowDown, contentDescription ="", modifier = Modifier.size(40.dp) )

                }



                AnimatedVisibility(expanded.value,

                    enter = expandIn(expandFrom = Alignment.TopStart),
                    exit = shrinkOut(shrinkTowards = Alignment.BottomEnd)

                ) {

                    Row {
                        Column (modifier = Modifier.weight(0.5f)){
                            Text(text = "GAZOIL : ${Fact.Gazoil}")
                            Spacer(modifier = Modifier.padding(20.dp))
                            Text(text = "SUPER : ${Fact.Super}")
                            Spacer(modifier = Modifier.padding(20.dp))
                            Text(text = "HUILE : ${Fact.Huile}")
                            Spacer(modifier = Modifier.padding(20.dp))
                            Text(text = "POWER ECO : ${Fact.Power_eco}")
                            Spacer(modifier = Modifier.padding(20.dp))
                        }
                        Column (modifier = Modifier.weight(0.5f)){

                        }
                    }

                }







            }

        }

        Spacer(modifier = Modifier.padding(10.dp))
    }






}