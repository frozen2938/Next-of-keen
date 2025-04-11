package com.geoffrey.harakamall.ui.screens.assignment

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.geoffrey.harakamall.R
import com.geoffrey.harakamall.navigation.ROUT_HOME
import com.geoffrey.harakamall.navigation.ROUT_ITEM
import com.geoffrey.harakamall.ui.theme.newblue
import com.geoffrey.harakamall.ui.theme.newgreen
import com.geoffrey.harakamall.ui.theme.neworange
import com.geoffrey.harakamall.ui.theme.neworangeone
import com.geoffrey.harakamall.ui.theme.newred
import com.geoffrey.harakamall.ui.theme.newwhite
import com.geoffrey.harakamall.ui.theme.newwhitw1

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AssignmentScreen(navController: NavController){

    //Scaffold

    var selectedIndex by remember { mutableStateOf(0) }
    val fabShape = CircleShape

    Scaffold(

        //FloatingActionButton
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /* Add action */ },
                containerColor = newred,
                shape = fabShape,
                modifier = Modifier.offset(y = 50.dp)
            ) {
                Icon(Icons.Default.Add, contentDescription = "FAB")
            }
        },
        floatingActionButtonPosition = FabPosition.Center,

        //BottomBar
        bottomBar = {
            BottomAppBar(
                containerColor = newwhite,
                tonalElevation = 8.dp
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        modifier = Modifier.padding(start = 16.dp)
                    ) {
                        IconButton(onClick = { /* Home */ }) {
                            Icon(Icons.Default.Home, contentDescription = "Home")
                        }
                        IconButton(onClick = { /* Search */ }) {
                            Icon(Icons.Default.List, contentDescription = "Search")
                        }
                    }

                    Spacer(modifier = Modifier.width(56.dp)) // Space for FAB

                    Row(
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        modifier = Modifier.padding(end = 16.dp)
                    ) {
                        IconButton(onClick = { /* Favorites */ }) {
                            Icon(Icons.Default.Favorite, contentDescription = "Favorites")
                        }
                        IconButton(onClick = { /* Profile */ }) {
                            Icon(Icons.Default.Person, contentDescription = "Profile")
                        }
                    }
                }
            }
        },




        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .padding(paddingValues)
                    .fillMaxSize()
            ) {


                //Main Contents of the page
                Spacer(modifier = Modifier.height(50.dp))

                Text(
                    text = "Hi Samantha",
                    fontWeight = FontWeight.Bold,
                    fontSize = 35.sp,
                    modifier = Modifier.padding(start = 20.dp)
                )
                Text(
                    text = "Here are your projects",
                    modifier = Modifier.padding(start = 20.dp)
                )

                Spacer(modifier = Modifier.height(50.dp))

                //row
                Row (
                    modifier = Modifier
                        .fillMaxWidth()
                        .horizontalScroll(rememberScrollState())
                ){
                    //Card one
                    Card (
                        modifier = Modifier
                            .width(170.dp)
                            .height(250.dp)
                            .clickable { navController.navigate(ROUT_ITEM) }
                            .padding(start = 20.dp),
                        elevation = CardDefaults.cardElevation(10.dp)
                    ){
                        Column (
                            modifier = Modifier.fillMaxSize().background(newblue),
                            verticalArrangement = Arrangement.Center
                        ){
                            Image(
                                painter = painterResource(R.drawable.net),
                                contentDescription = "Custom Vector",
                                colorFilter = ColorFilter.tint(newwhitw1),
                                modifier = Modifier
                                    .size(100.dp)
                                    .padding(start = 10.dp)
                            )
                            Text(
                                text = "Cryptocurrency",
                                fontSize = 18.sp,
                                modifier = Modifier.padding(start = 10.dp),
                                color = newwhitw1
                            )

                            Spacer(modifier = Modifier.height(8.dp))

                            Text(
                                text = "Landing Page",
                                fontSize = 15.sp,
                                modifier = Modifier.padding(start = 10.dp),
                                color = newwhitw1
                            )

                            Spacer(modifier = Modifier.height(20.dp))

                            Text(
                                text = "12 Tasks",
                                modifier = Modifier.padding(start = 10.dp),
                                color = newwhitw1
                            )
                        }
                    }
                    //End of card one

                    //Card two
                    Card (
                        modifier = Modifier
                            .width(170.dp)
                            .height(250.dp)
                            .clickable { navController.navigate(ROUT_ITEM) }
                            .padding(start = 20.dp),
                        elevation = CardDefaults.cardElevation(10.dp)
                    ){
                        Column (
                            modifier = Modifier.fillMaxSize().background(neworangeone),
                            verticalArrangement = Arrangement.Center
                        ){
                            Image(
                                painter = painterResource(R.drawable.cycle),
                                contentDescription = "Custom Vector",
                                modifier = Modifier
                                    .size(100.dp)
                                    .padding(start = 10.dp)
                            )
                            Text(
                                text = "Statistics",
                                fontSize = 18.sp,
                                modifier = Modifier.padding(start = 10.dp),
                                color = newwhitw1
                            )

                            Spacer(modifier = Modifier.height(8.dp))

                            Text(
                                text = "Dashboard",
                                fontSize = 15.sp,
                                modifier = Modifier.padding(start = 10.dp),
                                color = newwhitw1
                            )

                            Spacer(modifier = Modifier.height(20.dp))

                            Text(
                                text = "32 Tasks",
                                modifier = Modifier.padding(start = 10.dp),
                                color = newwhitw1
                            )
                        }
                    }
                    //End of card two

                    //Card three
                    Card (
                        modifier = Modifier
                            .width(170.dp)
                            .height(250.dp)
                            .clickable { navController.navigate(ROUT_ITEM) }
                            .padding(start = 20.dp),
                        elevation = CardDefaults.cardElevation(10.dp)
                    ){
                        Column (
                            modifier = Modifier.fillMaxSize().background(newgreen),
                            verticalArrangement = Arrangement.Center
                        ){
                            Image(
                                painter = painterResource(R.drawable.net),
                                contentDescription = "Custom Vector",
                                colorFilter = ColorFilter.tint(newwhitw1),
                                modifier = Modifier
                                    .size(100.dp)
                                    .padding(start = 10.dp)
                            )
                            Text(
                                text = "Cryptocurrency",
                                fontSize = 18.sp,
                                modifier = Modifier.padding(start = 10.dp),
                                color = newwhitw1
                            )

                            Spacer(modifier = Modifier.height(8.dp))

                            Text(
                                text = "Landing Page",
                                fontSize = 15.sp,
                                modifier = Modifier.padding(start = 10.dp),
                                color = newwhitw1
                            )

                            Spacer(modifier = Modifier.height(20.dp))

                            Text(
                                text = "24 Tasks",
                                modifier = Modifier.padding(start = 10.dp),
                                color = newwhitw1
                            )
                        }
                    }
                    //End of card three
                }
                //end of row

                Spacer(modifier = Modifier.height(50.dp))

                Column (
                    modifier = Modifier.fillMaxSize().background(newwhitw1),

                    ){

                    Spacer(modifier = Modifier.height(20.dp))

                    Text(
                        text = "Personal Tasks",
                        fontSize = 18.sp,
                        modifier = Modifier.padding(start = 20.dp),
                        fontWeight = FontWeight.Bold
                    )

                    Spacer(modifier = Modifier.height(20.dp))

                    //Card four
                    Card (
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(100.dp)
                            .clickable { navController.navigate(ROUT_ITEM) }
                            .padding(start = 20.dp, end = 20.dp),
                        elevation = CardDefaults.cardElevation(10.dp)
                    ){

                        Row (

                        ){

                            Image(
                                modifier = Modifier
                                    .width(50.dp)
                                    .padding(top = 30.dp, start = 10.dp),
                                painter = painterResource(R.drawable.videoplayer),
                                contentDescription = "home"
                            )

                            Spacer(modifier = Modifier.width(20.dp))

                            Column (
                                modifier = Modifier.fillMaxSize(),
                                verticalArrangement = Arrangement.Center
                            ){
                                Text(
                                    text = "NDA Review for website Project",
                                    fontSize = 18.sp
                                )

                                Spacer(modifier = Modifier.height(5.dp))

                                Text(
                                    text = "Today . 10pm",
                                    fontSize = 12.sp
                                )
                            }

                        }

                    }
                    //End of card four

                    Spacer(modifier = Modifier.height(20.dp))

                    //Card five
                    Card (
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(100.dp)
                            .clickable { navController.navigate(ROUT_ITEM) }
                            .padding(start = 20.dp, end = 20.dp),
                        elevation = CardDefaults.cardElevation(10.dp)
                    ){

                        Row (

                        ){

                            Image(
                                modifier = Modifier
                                    .width(50.dp)
                                    .padding(top = 30.dp, start = 10.dp),
                                painter = painterResource(R.drawable.emailmarketing),
                                contentDescription = "home"
                            )

                            Spacer(modifier = Modifier.width(20.dp))

                            Column (
                                modifier = Modifier.fillMaxSize(),
                                verticalArrangement = Arrangement.Center
                            ){
                                Text(
                                    text = "Email Reply for Green Project",
                                    fontSize = 18.sp
                                )

                                Spacer(modifier = Modifier.height(5.dp))

                                Text(
                                    text = "Today . 10pm",
                                    fontSize = 12.sp
                                )
                            }

                        }

                    }
                    //End of card five


                }












            }
        }
    )

    //End of scaffold

}

@Preview(showBackground = true)
@Composable
fun AssignmentScreenPreview(){

    AssignmentScreen(rememberNavController())

}