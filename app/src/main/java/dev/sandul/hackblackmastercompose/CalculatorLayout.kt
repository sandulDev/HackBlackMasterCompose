package dev.sandul.hackblackmastercompose

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun CalculatorLayout(innerPadding: PaddingValues) {
    var textRemember = remember { mutableStateOf("") }


    Column(modifier = Modifier.fillMaxSize().padding(innerPadding)) {
        Column(modifier = Modifier
            .fillMaxWidth()
            .weight(1f)
            .background(Color.Red)) {
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(Color.Yellow),
            verticalArrangement = Arrangement.SpaceAround
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .weight(1f),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically
            ) {

                Box(
                    modifier = Modifier
                        .background(MaterialTheme.colorScheme.primary)
                        .fillMaxHeight()
                        .weight(1f)
                        .padding(16.dp)
                        .clickable(enabled = true, onClick = {

                        })
                ) {
                    Text(modifier = Modifier.align(alignment = Alignment.Center), text = "1")
                }
                Box(
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxHeight()
                        .weight(1f)
                ) { Text(modifier = Modifier.align(alignment = Alignment.Center),text = "2") }
                Box(
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxHeight()
                        .weight(1f)
                ) { Text(modifier = Modifier.align(alignment = Alignment.Center),text = "3") }
                Box(
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxHeight()
                        .weight(1f)
                ) { Text(modifier = Modifier.align(alignment = Alignment.Center),text = "4") }
//                Button(onClick = {}) {
//                    Text(text = "1")
//                }
//                Button(onClick = {}) {
//                    Text(text = "2")
//                }
//                Button(onClick = {}) {Text(text = "3") }
//                Button(onClick = {}) { Text(text = "4")}
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Button(onClick = {}) { }
                Button(onClick = {}) { }
                Button(onClick = {}) { }
                Button(onClick = {}) { }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Button(onClick = {}) { }
                Button(onClick = {}) { }
                Button(onClick = {}) { }
                Button(onClick = {}) { }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                horizontalArrangement = Arrangement.SpaceAround,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Button(onClick = {}) { }
                Button(onClick = {}) { }
                Button(onClick = {}) { }
                Button(onClick = {}) { }
            }

        }
    }
}


//@Composable
//@Preview(showSystemUi = true)
//fun CalculatorLayoutPreview() {
//    CalculatorLayout()
//}