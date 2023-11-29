package com.promotic.station.ViewModel

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.lifecycle.ViewModel

class FormulaireViewModel : ViewModel() {

var Id = mutableStateOf(0)
    val _Id : State<Int> = Id

    var gazoil = mutableStateOf("")
    val _gazoil :State<String> = gazoil

    var supers = mutableStateOf("")
    val _supers: State<String> = supers


    var powerEco = mutableStateOf("")
    val _powerEco : State<String> = powerEco



}