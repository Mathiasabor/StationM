package com.promotic.station.View.Accueil.Component

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable

fun Menu( titre : String, desc : String, click :()->Unit)
{
    ElevatedButton(
        shape = RoundedCornerShape(30.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color(150, 0, 24)),

        onClick = { click() },
        modifier = Modifier
            .width(160.dp)

            .height(150.dp)

    ) {

        Box(modifier = Modifier
            .fillMaxSize()
            .padding(5.dp))
        {
            Text(text = titre,
                fontSize = 20.sp,
                modifier = Modifier.align(Alignment.TopStart)
            )

            Text(text = desc, modifier = Modifier.align(Alignment.CenterStart))

            Icon(imageVector = Icons.Default.KeyboardArrowRight, contentDescription ="", modifier = Modifier.align(
                Alignment.BottomEnd) )


        }


    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun testBadge()
{
    NavigationBar {
        NavigationBarItem(
            icon = {
                BadgedBox(
                    badge = {
                        Badge {
                            val badgeNumber = "8"
                            Text(
                                badgeNumber,
                               // modifier = Modifier.semantics {
                                  //  contentDescription = "$badgeNumber new notifications"
                               // }
                            )
                        }
                    }) {
                    Icon(
                        Icons.Filled.Star,
                        contentDescription = "Favorite"
                    )
                }
            },
            selected = false,
            onClick = {}
        )
    }
}