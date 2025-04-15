package com.geoffrey.harakamall.ui.screens.splash

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.geoffrey.harakamall.R
import com.geoffrey.harakamall.navigation.ROUT_LOGIN
import com.geoffrey.harakamall.navigation.ROUT_START
import com.geoffrey.harakamall.ui.theme.neworange
import com.geoffrey.harakamall.ui.theme.newwhite
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun SplashScreen(navController: NavController){

    //Navigation Delay

    val coroutine = rememberCoroutineScope()
    val launch = coroutine.launch {
        delay(2000)
        navController.navigate(ROUT_LOGIN)
    }

    //End of Navigation Delay

    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(neworange),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){




        Image(
            painter = painterResource(R.drawable.startup),
            contentDescription = "home",
            modifier = Modifier.size(180.dp)
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "HarakaMall",
            fontSize = 30.sp,
            color = newwhite,
            fontWeight = FontWeight.ExtraBold
        )

    }

}

@Preview(showBackground = true)
@Composable
fun SplashScreenPreview(){

    SplashScreen(rememberNavController())

}