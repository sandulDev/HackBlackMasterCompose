package dev.sandul.hackblackmastercompose.lesson_002

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.CheckCircle
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SegmentedButton
import androidx.compose.material3.SegmentedButtonDefaults
import androidx.compose.material3.SingleChoiceSegmentedButtonRow
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import dev.sandul.hackblackmastercompose.composables.BasicTextView

@Composable
fun ButtonExamplesScreen(innerPaddingValues: PaddingValues) {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        floatingActionButton = {
            FloatingActionButton(onClick = {}) {
                Icon(Icons.Outlined.CheckCircle, contentDescription = "info")
            }
        })
    { innerPadding ->

        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
        ) {
            Button(
                modifier = Modifier
                    .padding(16.dp),
                onClick = {},
                enabled = true,
                shape = RoundedCornerShape(
                    bottomEnd = 50.dp,
                    topStart = 50.dp,
                    bottomStart = 16.dp,
                    topEnd = 16.dp
                ),
                border = BorderStroke(width = 5.dp, color = Color.Yellow),
                elevation = ButtonDefaults.buttonElevation(defaultElevation = 50.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Red,
                    contentColor = Color.Blue
                ),
                contentPadding = PaddingValues(vertical = 30.dp)
            ) {
                BasicTextView("Button Name")
            }

            OutlinedButton(onClick = {}) {
                BasicTextView("Outlined Button")
            }
            TextButton(onClick = {}) {
                BasicTextView("Text Button")
            }
            ElevatedButton(onClick = {}) {
                BasicTextView("Elevated Button")
            }

            FilledTonalButton(onClick = {}) {
                BasicTextView("FilledTonal Button")
            }

            IconButton(onClick = {}) {
                Icon(Icons.Outlined.CheckCircle, contentDescription = "info")
            }

            SingleChoiceSegmentedButtonRow {
                SegmentedButton(
                    selected = true,
                    onClick = {},
                    shape = SegmentedButtonDefaults.baseShape
                ) { }
                SegmentedButton(
                    selected = false,
                    onClick = {},
                    shape = SegmentedButtonDefaults.baseShape
                ) { }
                SegmentedButton(
                    selected = false,
                    onClick = {},
                    shape = SegmentedButtonDefaults.baseShape
                ) { }
            }
        }
    }
}