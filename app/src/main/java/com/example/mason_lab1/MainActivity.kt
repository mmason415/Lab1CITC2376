package com.example.mason_lab1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.ui.Alignment
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.mason_lab1.ui.theme.Mason_Lab1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Mason_Lab1Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    myProfile(
                        modifier = Modifier.padding(innerPadding)
                    )

                }
            }
        }
    }
}
@Composable
fun myProfile(modifier: Modifier = Modifier){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFFDAB6FC)) // Set a distinct background color
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.me), // Replace with your drawable resource
            contentDescription = "Profile Picture",
            modifier = Modifier
                .size(240.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(8.dp))
        // User's full name
        Text(
            text = "Makayla Mason",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(8.dp))
        // Short biography
        Text(
            text = "Hello! My name is Makayla. My favorite things in life are reading books and spending time " +
                    "with my cat stormy! I enjoy listening to music and pizza.",
            fontSize = 16.sp
        )



    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Mason_Lab1Theme {
        myProfile()
    }
}
