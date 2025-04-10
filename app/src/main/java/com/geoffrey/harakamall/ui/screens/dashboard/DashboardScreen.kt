package com.geoffrey.harakamall.ui.screens.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.geoffrey.harakamall.R
import com.geoffrey.harakamall.navigation.ROUT_ABOUT
import com.geoffrey.harakamall.navigation.ROUT_HOME
import com.geoffrey.harakamall.navigation.ROUT_ITEM
import com.geoffrey.harakamall.ui.theme.neworange
import com.geoffrey.harakamall.ui.theme.neworangeone

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardScreen(navController: NavController){
    Column (
        modifier = Modifier.fillMaxSize().background(neworange)
    ){

        //Start of Box
        Box (){

            //Card start
            Card (
                modifier = Modifier.fillMaxWidth().height(254.dp),
                shape = RoundedCornerShape(bottomStart = 60.dp, bottomEnd = 60.dp),
                colors = CardDefaults.cardColors(neworangeone)
            ){


                //TopAppBar
                TopAppBar(
                    title = { Text(text = "Dashboard Section") },
                    navigationIcon = {
                        IconButton(onClick = {}) {
                            Icon(imageVector = Icons.Default.Menu, contentDescription = "")
                        }
                    }
                )
                //End TopAppBar
                Column (
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Text(
                        text = "WELCOME TO HARAKAMALL",
                        fontSize = 28.sp,
                        modifier = Modifier.padding(top = 20.dp)
                    )
                }

            }
            //End of card

            Card (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(180.dp)
                    .align(alignment = Alignment.BottomCenter)
                    .padding(start = 20.dp, end = 20.dp)
                    .offset(y = 90.dp),
            ){
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
                        Text("HarakaMall", color = Color.White, fontSize = 22.sp, style = MaterialTheme.typography.titleMedium)
                        Text("Harakamall is your one-stop online shopping destination, offering a wide range of quality products at affordable prices. From fashion and electronics to home essentials, we make shopping easy, fast, and secure — all from the comfort of your home.", color = Color.White, style = MaterialTheme.typography.bodyMedium)
                    }
                }
            }

        }
        //End of Box

        Spacer(modifier = Modifier.height(100.dp))

        //Start of row
        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ){

            //Card one
            Card (
                modifier = Modifier
                    .width(150.dp)
                    .height(200.dp)
                    .clickable { navController.navigate(ROUT_HOME) },
                elevation = CardDefaults.cardElevation(10.dp)
            ){
                Column (
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ){
                    Image(
                        painter = painterResource(R.drawable.home1),
                        contentDescription = "home",
                        modifier = Modifier.size(100.dp)
                    )
                    Text(text = "Home", fontSize = 15.sp)
                }
            }
            //End of card one

            Spacer(modifier = Modifier.width(20.dp))

            //Card two
            Card (
                modifier = Modifier
                    .width(150.dp)
                    .height(200.dp)
                    .clickable { navController.navigate(ROUT_ABOUT) },
                elevation = CardDefaults.cardElevation(10.dp)
            ){
                Column (
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ){
                    Image(
                        painter = painterResource(R.drawable.abouticon),
                        contentDescription = "",
                        modifier = Modifier.size(100.dp)
                    )
                    Text(text = "About", fontSize = 15.sp)
                }
            }
            //End of card two


        }
        //End of row

        Spacer(modifier = Modifier.height(20.dp))

        //Start of row
        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ){

            //Card one
            Card (
                modifier = Modifier
                    .width(150.dp)
                    .height(200.dp)
                    .clickable { navController.navigate(ROUT_ITEM) },
                elevation = CardDefaults.cardElevation(10.dp)
            ){
                Column (
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ){
                    Image(
                        painter = painterResource(R.drawable.contacticon),
                        contentDescription = "",
                        modifier = Modifier.size(100.dp)
                    )
                    Text(text = "Contact Us", fontSize = 15.sp)
                }
            }
            //End of card one

            Spacer(modifier = Modifier.width(20.dp))

            //Card two
            Card (
                modifier = Modifier
                    .width(150.dp)
                    .height(200.dp)
                    .clickable { navController.navigate(ROUT_ITEM) },
                elevation = CardDefaults.cardElevation(10.dp)
            ){
                Column (
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ){
                    Image(
                        painter = painterResource(R.drawable.products),
                        contentDescription = "home",
                        modifier = Modifier.size(100.dp)
                    )
                    Text(text = "Products", fontSize = 15.sp)
                }
            }
            //End of card two


        }
        //End of row


    }
}

@Preview(showBackground = true)
@Composable
fun DashboardScreenPreview(){

    DashboardScreen(rememberNavController())

}