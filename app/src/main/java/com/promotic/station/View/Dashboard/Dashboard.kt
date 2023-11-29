package com.promotic.station.View.Dashboard

import android.graphics.drawable.AnimatedImageDrawable
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.promotic.station.R

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun Dashboard()
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
                    .padding(top = 200.dp)
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
            Column(modifier = Modifier
                .fillMaxSize()
                .padding(30.dp)
                .background(color = Color.Transparent)) {

                Row(horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxWidth()) {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(painter = painterResource(id = R.drawable.categorie), contentDescription = "menu", tint = Color.White, modifier = Modifier.size(50.dp))
                    }

                    Card (

                        border= BorderStroke(width = 3.dp, color = Color(255,128,0)),
                        shape = CircleShape, modifier = Modifier.size(50.dp) ){
                        Image(painter = painterResource(id = R.drawable.profil), contentDescription = "im", contentScale = ContentScale.FillBounds, modifier = Modifier.fillMaxSize().clickable {  })
                    }



                }
                
                Spacer(modifier = Modifier.padding(10.dp))
                
                Column (modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 12.dp)){
                    Text(text = "Tableau de Bord", fontSize = 25.sp, color= Color.White)
                    Text(text = "Accéder à l'ensemble de vos rubriques", color = Color.White)
                }
                Spacer(modifier = Modifier.padding(40.dp))
                Column(Modifier.fillMaxWidth()) {


                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,

                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(0.3f)
                    ){


                        ElevatedButton(

                            elevation = ButtonDefaults.buttonElevation(defaultElevation = 6.dp) ,
                            shape = RoundedCornerShape(30.dp),
                            //colors = ButtonDefaults.buttonColors(containerColor = Color(150, 0, 24)),

                            onClick = { },
                            modifier = Modifier
                                .weight(0.5f)


                        ) {



                            Column (
                                horizontalAlignment = Alignment.CenterHorizontally,
                                modifier = Modifier
                                .fillMaxSize()){
                                Image(painter = painterResource(id = R.drawable.bouton_ajouter),
                                    contentDescription ="ajouter", alignment = Alignment.TopCenter,
                                    // contentScale = ContentScale.FillWidth,

                                    modifier = Modifier.size(80.dp)
                                )

                                Text(text = "Créer un Bon",)
                            }


                        }
                        Spacer(modifier = Modifier.padding(20.dp))
                        ElevatedButton(

                            elevation = ButtonDefaults.buttonElevation(defaultElevation = 6.dp) ,
                            shape = RoundedCornerShape(30.dp),
                           // colors = ButtonDefaults.buttonColors(containerColor = Color(150, 0, 24)),

                            onClick = { },
                            modifier = Modifier
                                //.width(160.dp)
                                .weight(0.5f)
                                //.height(150.dp)

                        ) {

                            Column (
                                horizontalAlignment = Alignment.CenterHorizontally,
                                modifier = Modifier
                                    .fillMaxSize()){
                                Image(painter = painterResource(id = R.drawable.lister),
                                    contentDescription ="lister", alignment = Alignment.TopCenter,
                                    // contentScale = ContentScale.FillWidth,

                                    modifier = Modifier.size(80.dp)
                                )

                                Text(text = "Mes Bons",)
                            }


                        }



                    }

                    Spacer(modifier = Modifier.padding(20.dp))

                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,

                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(0.3f)
                    ){


                        ElevatedButton(

                            elevation = ButtonDefaults.buttonElevation(defaultElevation = 6.dp) ,
                            shape = RoundedCornerShape(30.dp),
                            //colors = ButtonDefaults.buttonColors(containerColor = Color(150, 0, 24)),

                            onClick = { },
                            modifier = Modifier
                                //.width(160.dp)
                                .weight(0.5f)
                            //.height(150.dp)

                        ) {

                            Column (
                                horizontalAlignment = Alignment.CenterHorizontally,
                                modifier = Modifier
                                    .fillMaxSize()){



                                BadgedBox(badge ={
                                    Badge{

                                        Text(text = "3")
                                    }

                                }, modifier = Modifier.padding(top = 10.dp)

                                ) {
                                    Image(painter = painterResource(id = R.drawable.verifier),
                                        contentDescription ="verifier", alignment = Alignment.TopCenter,
                                        // contentScale = ContentScale.FillWidth,

                                        modifier = Modifier.size(80.dp)
                                    )
                                }



                                Text(text = "Valider un Bon",)
                            }


                        }
                        Spacer(modifier = Modifier.padding(20.dp))
                        ElevatedButton(

                            elevation = ButtonDefaults.buttonElevation(defaultElevation = 6.dp) ,
                            shape = RoundedCornerShape(30.dp),
                           // colors = ButtonDefaults.buttonColors(containerColor = Color(150, 0, 24)),

                            onClick = { },
                            modifier = Modifier
                                //.width(160.dp)
                                .weight(0.5f)
                            //.height(150.dp)

                        ) {

                            Column (
                                horizontalAlignment = Alignment.CenterHorizontally,
                                modifier = Modifier
                                    .fillMaxSize()){
                                Image(painter = painterResource(id = R.drawable.bouton_ajouter),
                                    contentDescription ="ajouter", alignment = Alignment.TopCenter,
                                    // contentScale = ContentScale.FillWidth,

                                    modifier = Modifier.size(80.dp)
                                )

                                Text(text = "Emmettre un bon",)
                            }


                        }



                    }

                        Spacer(modifier = Modifier.padding(20.dp))
                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,

                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(0.3f)
                    ){


                        ElevatedButton(
                            shape = RoundedCornerShape(30.dp),

                            elevation = ButtonDefaults.buttonElevation(defaultElevation = 6.dp) ,
                            //colors = ButtonDefaults.buttonColors(containerColor = Color(150, 0, 24)),

                            onClick = { },
                            modifier = Modifier
                                //.width(160.dp)
                                .weight(0.5f)
                            //.height(150.dp)

                        ) {

                            Column (
                                horizontalAlignment = Alignment.CenterHorizontally,
                                modifier = Modifier
                                    .fillMaxSize().padding(top = 10.dp)){
                                Image(painter = painterResource(id = R.drawable.bibliotheque),
                                    contentDescription ="archives", alignment = Alignment.TopCenter,
                                    // contentScale = ContentScale.FillWidth,

                                    modifier = Modifier.size(80.dp)
                                )

                                Text(text = "Archives",)
                            }


                        }
                        Spacer(modifier = Modifier.padding(20.dp))
                        ElevatedButton(

                            elevation = ButtonDefaults.buttonElevation(defaultElevation = 6.dp) ,
                            shape = RoundedCornerShape(30.dp),
                           // colors = ButtonDefaults.buttonColors(containerColor = Color(150, 0, 24)),

                            onClick = { },
                            modifier = Modifier
                                //.width(160.dp)
                                .weight(0.5f)
                            //.height(150.dp)

                        ) {

                            Column (
                                horizontalAlignment = Alignment.CenterHorizontally,
                                modifier = Modifier
                                    .fillMaxSize()){

                                BadgedBox(badge ={
                                    Badge{

                                        Text(text = "5")
                                    }

                                }, modifier = Modifier.padding( top =10.dp)

                                ) {
                                    Image(painter = painterResource(id = R.drawable.imprimante),
                                        contentDescription ="imprimante", alignment = Alignment.TopCenter,
                                        // contentScale = ContentScale.FillWidth,

                                        modifier = Modifier.size(80.dp)
                                    )


                                }

                                Text(text = "Mes Imprimés",)
                            }

                        }



                    }
                }
            }
        }

    }



}