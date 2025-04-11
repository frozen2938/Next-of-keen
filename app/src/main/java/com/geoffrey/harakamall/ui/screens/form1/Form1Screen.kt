package com.geoffrey.harakamall.ui.screens.form1

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.geoffrey.harakamall.R
import com.geoffrey.harakamall.navigation.ROUT_ABOUT
import com.geoffrey.harakamall.ui.theme.newblueee
import com.geoffrey.harakamall.ui.theme.neworange
import com.geoffrey.harakamall.ui.theme.neworangeone
import com.geoffrey.harakamall.ui.theme.newwhitw1

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Form1Screen(navController: NavController){

    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column (
        modifier = Modifier.fillMaxSize().background(neworange)
    ) {

        //Start of Box
        Box() {

            //Card start
            Card(
                modifier = Modifier.fillMaxWidth().height(470.dp),
                colors = CardDefaults.cardColors(newblueee),
                shape = RoundedCornerShape(topStart = 0.dp, topEnd = 0.dp),
                ) {



                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    Spacer(modifier = Modifier.height(20.dp))

                    Row (
                        modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically
                    ){

                        Image(
                            painter = painterResource(R.drawable.iconic),
                            contentDescription = "icon",
                        )

                        Spacer(modifier = Modifier.width(10.dp))

                        Text(
                            text = "Logo App",
                            fontSize = 28.sp,
                            modifier = Modifier.padding(top = 20.dp),
                            color = newwhitw1
                        )


                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    Column (
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){

                        Image(
                            painter = painterResource(R.drawable.grocery),
                            contentDescription = "icon",
                            modifier = Modifier.size(260.dp)
                        )

                    }
                }

            }
            //End of card

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(450.dp)
                    .align(alignment = Alignment.BottomCenter)
                    .offset(y = 400.dp),
                shape = RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp),
            ) {

                Column (
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ){

                    Spacer(modifier = Modifier.height(20.dp))

                    Text(
                        text = "The Most Worth",
                        fontSize = 35.sp,
                        fontWeight = FontWeight.ExtraBold,
                        color = neworange
                    )
                    Text(
                        text = "Grocery App",
                        fontSize = 35.sp,
                        fontWeight = FontWeight.ExtraBold,
                        color = neworange
                    )

                    Spacer(modifier = Modifier.height(20.dp))

                    //username
                    TextField(
                        value = username,
                        onValueChange = { username = it },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 20.dp, end = 20.dp)
                            .background(Color.LightGray, shape = RoundedCornerShape(30.dp))
                            .clip(RoundedCornerShape(30.dp)),
                        placeholder = {
                            Box(Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                                Text(text = "Username", textAlign = TextAlign.Center)
                            }
                        },
                        colors = TextFieldDefaults.run {
                            colors(
                                                focusedIndicatorColor = Color.Transparent,
                                                unfocusedIndicatorColor = Color.Transparent,
                                                disabledIndicatorColor = Color.Transparent,
                                                focusedTextColor = Color.Black,
                                                unfocusedTextColor = Color.Black,
                                                cursorColor = neworange,
                                                focusedContainerColor = Color.LightGray,
                                                unfocusedContainerColor = Color.LightGray,
                                            )
                        },
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
                    )
                    //End of username

                    Spacer(modifier = Modifier.height(20.dp))

                    //password
                    TextField(
                        value = password,
                        onValueChange = { password = it },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 20.dp, end = 20.dp)
                            .background(Color.LightGray, shape = RoundedCornerShape(30.dp))
                            .clip(RoundedCornerShape(30.dp)),
                        placeholder = {
                            Box(Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
                                Text(text = "Password", textAlign = TextAlign.Center)
                            }
                        },
                        colors = TextFieldDefaults.run {
                            colors(
                                focusedIndicatorColor = Color.Transparent,
                                unfocusedIndicatorColor = Color.Transparent,
                                disabledIndicatorColor = Color.Transparent,
                                focusedTextColor = Color.Black,
                                unfocusedTextColor = Color.Black,
                                cursorColor = neworange,
                                focusedContainerColor = Color.LightGray,
                                unfocusedContainerColor = Color.LightGray,
                            )
                        },
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                        visualTransformation = PasswordVisualTransformation()
                    )
                    //End of username

                    Spacer(modifier = Modifier.height(20.dp))

                    Button(
                        onClick = {
                            navController.navigate(ROUT_ABOUT)
                        },
                        colors = ButtonDefaults.buttonColors(neworange),
                        shape = RoundedCornerShape(30.dp),
                        modifier = Modifier.fillMaxWidth()
                            .padding(start = 20.dp, end = 20.dp)
                            .height(50.dp)

                    ) {
                        Text(
                            text = " Sign Up ",
                            fontSize = 18.sp
                        )
                    }

                    Spacer(modifier = Modifier.height(30.dp))

                    Row (){
                        Text(
                            text = "Already a member?",
                            fontSize = 18.sp
                        )
                        Text(
                            text = "Log in",
                            fontSize = 18.sp,
                            color = neworange
                        )
                    }


                }

            }

        }
        //End of Box
    }

}

@Preview(showBackground = true)
@Composable
fun FormScreenPreview(){

    Form1Screen(rememberNavController())

}