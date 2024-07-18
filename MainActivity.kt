package com.example.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Body(
                        modifier = Modifier
                            .padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Body(modifier: Modifier = Modifier) {
    Box(
        Modifier
            .background(Color(0xFFBAF5CA))
            .fillMaxWidth()
            .fillMaxHeight()) {
        Column(
            Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            titleTile()
        }
        Column(
            Modifier
                .fillMaxSize()
                .padding(80.dp),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            contactInfoTile()

        }
    }
}

@Composable
fun titleTile(modifier: Modifier = Modifier) {
    Column(
        Modifier.padding(bottom = 150.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.android_logo),
            contentDescription = "Android Logo",
            Modifier
                .height(220.dp)
                .width(250.dp)
        )
        Text(
            text = stringResource(R.string.name),
            Modifier.padding(bottom = 10.dp),
            color = Color(0xFF689473),
            fontSize = 30.sp,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = stringResource(R.string.title),
            Modifier.padding(start = 55.dp),
            textAlign = TextAlign.Center,
            color = Color(0xFF689473)
        )
    }
}

@Composable
fun contactInfoTile(modifier: Modifier = Modifier) {
    Column(
        Modifier.padding(bottom = 40.dp)
    ) {
        Row {
            Icon(
                Icons.Rounded.Call,
                contentDescription = "Phone Number",
                Modifier.padding(end = 10.dp),
                tint = Color(0xFF689473)
            )
            Text(
                text = stringResource(R.string.phone_number),
                Modifier.padding(bottom = 10.dp),
                color = Color(0xFF689473)
            )
        }
        Row {
            Icon(
                Icons.Rounded.AccountCircle,
                contentDescription = "LinkedIn",
                Modifier.padding(end = 10.dp),
                tint = Color(0xFF689473)
            )
            Text(
                text = stringResource(R.string.social_media_link),
                Modifier.padding(bottom = 10.dp),
                fontSize = 13.sp,
                color = Color(0xFF689473)
            )
        }
        Row {
            Icon(
                Icons.Rounded.Email,
                contentDescription = "Email Address",
                Modifier.padding(end = 10.dp),
                tint = Color(0xFF689473)
            )
            Text(
                text = stringResource(R.string.email),
                fontSize = 13.sp,
                color = Color(0xFF689473)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardAppTheme {
        Body()
    }
}