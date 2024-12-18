package dev.sandul.hackblackmastercompose.lesson_003

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ListExamples(innerPadding: PaddingValues) {
    Column(modifier = Modifier.padding(innerPadding)) {

//        LazyVerticalGrid(
//            columns = GridCells.Adaptive(minSize = 128.dp)
//        ) {
//            items(330) { photo ->
//                Text(text = "photo: $photo")
//            }
//        }
        LazyRow(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            item {
                TextItem()
            }
            items(30) { index ->
                TextItem(index)
            }
            item {
                TextItem()
            }
        }



        LazyColumn(
            modifier = Modifier
                .fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            item {
                TextItem()
            }
            items(30) { index ->
                TextItem(index)
            }
            item {
                TextItem()
            }
        }
    }

}

@Composable
fun TextItem(index: Int? = null) {
    if (index == null) {
        Column {
            Icon(imageVector = Icons.Default.CheckCircle, contentDescription = "")
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.LightGray),
                text = "hello Lazy Column",
            )
            Text(text = "dgdgdg")
            Text(text = "dgdgdg")
            HorizontalDivider(
                modifier = Modifier.fillMaxWidth(),
                thickness = 1.dp,
                color = Color.LightGray
            )
        }

    } else {
        Column {
            Icon(imageVector = Icons.Default.CheckCircle, contentDescription = "")
            Text(text = "item index: $index")
            Text(text = "dgdgdg")
            Text(text = "dgdgdg")
            HorizontalDivider(
                modifier = Modifier.fillMaxWidth(),
                thickness = 1.dp,
                color = Color.LightGray
            )
        }
    }
}