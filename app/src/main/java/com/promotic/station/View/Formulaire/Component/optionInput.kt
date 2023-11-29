package com.promotic.station.View.Formulaire.Component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.platform.LocalSoftwareKeyboardController
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.promotic.station.ViewModel.FormulaireViewModel

@OptIn(ExperimentalMaterial3Api::class, ExperimentalComposeUiApi::class)
//@Preview(showBackground = true)
@Composable

fun OptionInput(onclick:()->Unit, vm: FormulaireViewModel)
{val focusManager = LocalFocusManager.current
    val keyboardController = LocalSoftwareKeyboardController.current



    var values = remember{ mutableStateOf((""))}
    var values1 = remember{ mutableStateOf((""))}
    var values2 = remember{ mutableStateOf((""))}
    var values3 = remember{ mutableStateOf((""))}
    var enables = remember{ mutableStateOf((false))}
    Column (horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)){

        OutlinedTextField(
            value =  vm._gazoil.value,
            onValueChange = { newvalue -> vm.gazoil.value = newvalue
                enables.value = false

                            } ,
            label = { Text(text = " GAZOIL")},

            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number, imeAction = ImeAction.Next) ,

            keyboardActions = KeyboardActions(onNext = {

                focusManager.moveFocus(FocusDirection.Down)

            }),
            modifier = Modifier.fillMaxWidth()

        )


        Spacer(modifier = Modifier.padding(10.dp))

        OutlinedTextField(
            value =  values1.value,
            onValueChange = { newvalue -> values1.value = newvalue
                enables.value = false
                            },
            label = { Text(text = "SUPER")},

            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number, imeAction = ImeAction.Next) ,

            keyboardActions = KeyboardActions(onNext = {

                focusManager.moveFocus(FocusDirection.Down)

            }), modifier = Modifier.fillMaxWidth())

        Spacer(modifier = Modifier.padding(10.dp))

        OutlinedTextField(
            value =  values2.value,
            onValueChange = { newvalue -> values2.value = newvalue
                enables.value = false
                            },
            label = { Text(text = "HUILE")},

            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number, imeAction = ImeAction.Next) ,

            keyboardActions = KeyboardActions(onNext = {

                focusManager.moveFocus(FocusDirection.Down)

            }), modifier = Modifier.fillMaxWidth())

        Spacer(modifier = Modifier.padding(10.dp))

        OutlinedTextField(
            value =  values3.value,
            onValueChange = { newvalue -> values3.value = newvalue
                enables.value = false
                            },
            label = { Text(text = "POWER ECO")},

            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number, imeAction = ImeAction.Done) ,

            keyboardActions = KeyboardActions(onDone = {
                focusManager.clearFocus()
                keyboardController?.hide()

                enables.value = if(vm.gazoil.value =="" && values1.value == "" && values2.value == "" && values3.value == "" ) false else true

            }), modifier = Modifier.fillMaxWidth())



        Spacer(modifier = Modifier.padding(20.dp))

        Button(enabled = enables.value,
            shape = RoundedCornerShape(30.dp),

            colors = ButtonDefaults.buttonColors(containerColor = Color.Red),
            onClick = { onclick() }) {
            Text(text = "Suivant", fontSize = 20.sp, color = Color.White)
        }

    }
}