package com.promotic.station.View.Bons

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.promotic.station.Model.Facture
import com.promotic.station.View.Bons.Component.BonEmit


object BonsList{
    var lt = mutableListOf<Facture>(

        Facture(1,2500,3500,9000,8700),
        Facture(2,3500,4500,8000,8700),
        Facture(3,4500,5500,7000,8700),
        Facture(4,5500,6500,6000,8700),
        Facture(5,6500,7500,5000,8700)
    )


}
@Preview(showBackground = true)
@Composable
fun Bons()
{
    Column (modifier = Modifier.fillMaxWidth()){
        LazyColumn{
            items(BonsList.lt){item ->

                BonEmit(item)
            }
        }
    }

}