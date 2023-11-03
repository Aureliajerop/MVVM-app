package com.example.mvvmnavigation.ui.theme.screens.signup


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api

import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController



import com.example.mynovmvvmapplication.ui.theme.MyNovMVVMApplicationTheme


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CalculatorScreen(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Column (
            modifier = Modifier.padding(15.dp)
        ){
            Text(text = "Calculator")
            FontWeight.Bold
        }

        Column (
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            var firstNumber by remember {
                mutableStateOf("")
            }
            OutlinedTextField(value = firstNumber, onValueChange = {firstNumber = it},
                label = { Text(text = "Enetr first number")},
                modifier = Modifier
                    .fillMaxWidth(0.9f)
                    .padding(top = 30.dp),
                shape = RoundedCornerShape(20.dp)
            )
            Spacer(modifier = Modifier.height(20.dp))
            var secondNumber by remember {
                mutableStateOf("")
            }
            OutlinedTextField(value = secondNumber, onValueChange = {secondNumber = it},
                label = { Text(text = "Enetr first number")},
                modifier = Modifier.fillMaxWidth(0.9f),
                shape = RoundedCornerShape(20.dp)
            )

            var result by remember {
                mutableStateOf("0")
            }
            Button(onClick = {
                val num1 = firstNumber.toDoubleOrNull() ?: 0.0
                val num2 = secondNumber.toDoubleOrNull() ?: 0.0
                result = (num1 + num2).toString()
            },
                modifier = Modifier
                    .fillMaxWidth(0.9f)
                    .padding(top = 15.dp)
            ) {
                Text(text = "Addition")
            }

            Button(onClick = {
                val num1 = firstNumber.toDoubleOrNull() ?: 0.0
                val num2 = secondNumber.toDoubleOrNull() ?: 0.0
                result = (num1 * num2).toString()
            },
                modifier = Modifier
                    .fillMaxWidth(0.9f)
                    .padding(top = 15.dp)
            ) {
                Text(text = "multiply")
            }


            Button(onClick = {
                val num1 = firstNumber.toDoubleOrNull() ?: 0.0
                val num2 = secondNumber.toDoubleOrNull() ?: 0.0
                result = (num1 / num2).toString()
            },
                modifier = Modifier
                    .fillMaxWidth(0.9f)
                    .padding(top = 15.dp)
            ) {
                Text(text = "Divide")
            }
            Button(onClick = {
                val num1 = firstNumber.toDoubleOrNull() ?: 0.0
                val num2 = secondNumber.toDoubleOrNull() ?: 0.0
                result = (num1 - num2).toString()
            },
                modifier = Modifier
                    .fillMaxWidth(0.9f)
                    .padding(top = 15.dp)
            ) {
                Text(text = "Subtract")
            }


            Text(text = "result: $result")












        }
    }
}
@Preview(showBackground = true)
@Composable
fun CalculatorScreenPreview(){
    MyNovMVVMApplicationTheme {
        CalculatorScreen(rememberNavController())
    }

    }
