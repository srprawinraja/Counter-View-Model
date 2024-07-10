package com.example.counterviewmodel

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.activity.viewModels
import com.example.counterviewmodel.ui.theme.CounterViewModelTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val viewModel: CounterViewModel by viewModels<CounterViewModel>()
            CounterViewModelTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) { CounterApp(viewModel)
                }
            }
        }
    }
}

@Composable
fun CounterApp(viewModel: CounterViewModel) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterVertically),
                horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "count is ${viewModel.count.value}")
        Row (
            horizontalArrangement = Arrangement.spacedBy(16.dp)

        ){
            Button(onClick = {viewModel.increment()}) {
                Text(text = "Increment")
            }
            Button(onClick = {viewModel.decrement()}) {
                Text(text = "Decrement")
            }
        }
    }
}
/*
@Preview(showBackground = true)
@Composable
fun counterAppPreview() {
    CounterViewModelTheme {
        counterApp()
    }
}*/