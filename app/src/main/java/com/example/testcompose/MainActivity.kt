package com.example.testcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewsStory()
        }
    }
}


@Composable
fun NewsStory() {
    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.header),
            contentDescription = stringResource(R.string.desc_image),
            modifier = Modifier.height(200.dp).fillMaxWidth(),
            contentScale = ContentScale.Crop
        )
        Spacer(Modifier.height(16.dp))

        Text("Un dia fenomenal")
        Text("Barcelona, Catalunya")
        Text("Junio 2021")
    }
}

@Preview
@Composable
fun DefaultPreview() {
    NewsStory()
}