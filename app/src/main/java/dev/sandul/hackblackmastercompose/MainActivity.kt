package dev.sandul.hackblackmastercompose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Create
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import dev.sandul.hackblackmastercompose.lesson_003.ListExamples
import dev.sandul.hackblackmastercompose.ui.theme.HackBlackMasterComposeTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val context = LocalContext.current
            HackBlackMasterComposeTheme {
                Scaffold(
                    floatingActionButton = {
                        FloatingActionButton(onClick = {}) {
                            Icon(Icons.Default.Add, contentDescription = "add")
                        }
                    },
                    topBar = {
                        TopAppBar(
                            title = { Text(text = "TopAppBar") },
                            navigationIcon = {
                                IconButton(onClick = {
                                    finish()
                                }) {
                                    Icon(Icons.Default.Close, contentDescription = "")
                                }
                            },
                            actions = {
                                IconButton(onClick = {
                                    Toast.makeText(context, "click", Toast.LENGTH_SHORT).show()
                                }) {
                                    Icon(Icons.Default.Create, contentDescription = "")
                                }
                            }
                        )
                    },
                    bottomBar = {
                        BottomAppBar(
                            actions = {
                                IconButton(onClick = {
                                    Toast.makeText(context, "click", Toast.LENGTH_SHORT).show()
                                }) {
                                    Icon(Icons.Default.Create, contentDescription = "")
                                }
                                IconButton(onClick = {
                                    Toast.makeText(context, "click", Toast.LENGTH_SHORT).show()
                                }) {
                                    Icon(Icons.Default.Create, contentDescription = "")
                                }
                                IconButton(onClick = {
                                    Toast.makeText(context, "click", Toast.LENGTH_SHORT).show()
                                }) {
                                    Icon(Icons.Default.Create, contentDescription = "")
                                }
                            },
                            containerColor = Color.Yellow,
                            floatingActionButton = {
                                FloatingActionButton(onClick = {}) {
                                    Icon(Icons.Default.Add, contentDescription = "add")
                                }
                            }
                        )
                    },
                    content = { innerPadding ->
//                        ListExamples(innerPadding)
//                        CalculatorLayout(innerPadding = innerPadding)
                        TextFieldExampleLayout(innerPaddingValues = innerPadding)
//                        ButtonExamplesScreen(innerPaddingValues = innerPadding)
                    }
                )
            }
        }
    }
}




