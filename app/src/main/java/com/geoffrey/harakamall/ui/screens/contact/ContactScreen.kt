package com.geoffrey.harakamall.ui.screens.contact

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.BottomCenter
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.geoffrey.harakamall.R


    @Composable
    fun ContactScreen(navController: NavController) {
        Column (
            modifier = Modifier.fillMaxSize()
        ){
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .padding(16.dp),
                shape = RoundedCornerShape(16.dp),
                elevation = CardDefaults.cardElevation(8.dp)
            ) {
                Box {
                    Image(
                        painter = painterResource(id = R.drawable.card2), // Replace with your image resource
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.fillMaxSize()
                    )
                    // Add a semi-transparent overlay if needed
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(Color.Black.copy(alpha = 0.4f))
                    )

                    // Card content on top of the background
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp),
                        verticalArrangement = Arrangement.Bottom
                    ) {
                        Text("Card Title", color = Color.White, style = MaterialTheme.typography.titleMedium)
                        Text("Some description here.", color = Color.White, style = MaterialTheme.typography.bodyMedium)
                    }
                }
            }


            Card (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(180.dp)
                    .padding(start = 20.dp, end = 20.dp)
                    .offset(y = 90.dp),
            ){


                Column (
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ){
                    Text(
                        text = "Welcome to Harakamall",
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Text(
                        text = "Harakamall is your one-stop online shopping destination, offering a wide range of quality products at affordable prices. From fashion and electronics to home essentials, we make shopping easy, fast, and secure — all from the comfort of your home.",
                        fontSize = 15.sp,
                        modifier = Modifier.padding(start = 20.dp, end = 20.dp),
                        textAlign = TextAlign.Center
                    )

                }


            }

        }
    }





@Preview(showBackground = true)
@Composable
fun ContactScreenPreview(){

    ContactScreen(rememberNavController())

}