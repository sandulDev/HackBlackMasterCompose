package dev.sandul.hackblackmastercompose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.ArrowBack
import androidx.compose.material.icons.automirrored.rounded.ArrowForward
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Create
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp

@Composable
fun TextFieldExampleLayout(innerPaddingValues: PaddingValues) {

    var textFieldRemember by remember { mutableStateOf("") }
    var outlinedTextFieldRemember by remember { mutableStateOf("") }
    var isError by remember { mutableStateOf(false) }
    var textFieldPasswordRemember by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .padding(innerPaddingValues)
            .fillMaxSize()

            .background(Color.LightGray),
        verticalArrangement = Arrangement.Center
    ) {
        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            value = outlinedTextFieldRemember,
            onValueChange = {
                if (it.length <= 10) {
                    outlinedTextFieldRemember = it
                }
            },
            label = { Text(text = "label") },
            placeholder = { Text(text = "Place holder") },
            enabled = true,
            isError = true,
            supportingText = { Text(text = "supportingText") },
            leadingIcon = { Icon(Icons.AutoMirrored.Rounded.ArrowBack, contentDescription = "")},
            trailingIcon = { Icon(Icons.AutoMirrored.Rounded.ArrowForward, contentDescription = "")}

        )
        TextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            value = textFieldRemember,
            onValueChange = { textFieldRemember = it },
            label = { Text(text = "label") },
            visualTransformation = if(textFieldPasswordRemember) VisualTransformation.None else PasswordVisualTransformation(),
            trailingIcon = {
                val icon = if(textFieldPasswordRemember)
                    Icons.Default.CheckCircle
                else
                    Icons.Default.Create

                IconButton(onClick = {
                    textFieldPasswordRemember = !textFieldPasswordRemember
                }) {
                    Icon(icon, contentDescription = "")
                }
            }
        )

    }
}


//@Preview(showSystemUi = true)
//@Composable
//fun TextFieldExampleLayoutPreview() {
//    TextFieldExampleLayout()
//}