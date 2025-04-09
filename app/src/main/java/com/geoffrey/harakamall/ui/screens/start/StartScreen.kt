package com.geoffrey.harakamall.ui.screens.start

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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
import com.geoffrey.harakamall.navigation.ROUT_DASHBOARD
import com.geoffrey.harakamall.ui.theme.neworange

@Composable
fun StartScreen(navController: NavController){
Column (
    modifier = Modifier.fillMaxSize(),
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Center
    ){
   Text(
       text = "HarakaMall",
       fontSize = 20.sp
   )

   Spacer(modifier = Modifier.height(20.dp))

    //Circular image
    Image(
        painter = painterResource(R.drawable.two),
        contentDescription = "home",
        modifier = Modifier.size(300.dp).clip(shape = CircleShape),
        contentScale = ContentScale.Crop
    )
    //End
    Spacer(modifier = Modifier.height(20.dp))

    Text(
        text = "Find Your Order!",
        fontSize = 30.sp,
        fontWeight = FontWeight.ExtraBold,
        color = neworange
    )

    Spacer(modifier = Modifier.height(20.dp))

    Text(
        text = "28 Mar 2024 · Wix.com offers a platform to create, manage and grow your online store with no coding skills. Choose from over 900 templates, sell on multiple channels, and use built-in tools for marketing, payments, shipping and more",
        textAlign = TextAlign.Center,
        fontSize = 18.sp,
    )

    Spacer(modifier = Modifier.height(20.dp))

    Button(
        onClick = {
            navController.navigate(ROUT_DASHBOARD)
        },
        colors = ButtonDefaults.buttonColors(neworange),
        shape = RoundedCornerShape(10.dp),
        modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp)

    ) {
        Text(
            text = "Get Started",
        )
    }
}

}
//Preview function
@Preview(showBackground = true)
@Composable
fun StartScreenPreview(){

    StartScreen(rememberNavController())
}