package com.geoffrey.harakamall.ui.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.geoffrey.harakamall.R
import com.geoffrey.harakamall.navigation.ROUT_ABOUT
import com.geoffrey.harakamall.navigation.ROUT_ITEM
import com.geoffrey.harakamall.ui.theme.neworange

@Composable
fun HomeScreen(navController: NavController){

    Column (
        modifier = Modifier.fillMaxSize()
    ){

        Text(
            text = "HarakaMall",
            fontSize = 30.sp,
            color = neworange,
            fontWeight = FontWeight.ExtraBold
        )

        Image(
            painter = painterResource(R.drawable.home),
            contentDescription = "home"
        )

        Spacer(modifier = Modifier.width(20.dp))

        Text(
            text = "Welcome to my App",
            fontSize = 15.sp,
            fontStyle = FontStyle.Italic

        )

        Spacer(modifier = Modifier.width(20.dp))

        Row {
            Column (
                modifier = Modifier.width(200.dp).padding(start = 10.dp)
            ){
                Text(
                    text = "An eCommerce website is a platform where you can buy or sell physical or digital products online. If you're looking to create one, consider using popular website builders like Shopify, which is highly rated for its sales features and business management tools."
                )
            }

            Spacer(modifier = Modifier.width(20.dp))

            Column (
                modifier = Modifier.width(200.dp).padding(end = 10.dp)
            ){
                Text(
                    text = "Other notable platforms include Wix and Squarespace, which offer various functionalities to help you build an attractive online store. For inspiration, you can explore well-designed eCommerce websites like Zulu and Longines."
                )
            }
        }

        Spacer(modifier = Modifier.width(25.dp))

        Text(
            modifier = Modifier.padding(start = 10.dp, end = 10.dp, top = 10.dp),
            text =
                    "An eCommerce website is a platform where you can buy or sell physical or digital products online. If you're looking to create one, consider using popular website builders like Shopify, which is highly rated for its sales features and business management tools. Other notable platforms include Wix and Squarespace, which offer various functionalities to help you build an attractive online store. For inspiration, you can explore well-designed eCommerce websites like Zulu and Longines.",
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold
        )
        Button(
            onClick = {
                navController.navigate(ROUT_ABOUT)
            },
            colors = ButtonDefaults.buttonColors(Color.Magenta),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.padding(top = 10.dp)
        ) {
            Text(
                text = "About us",
            )
        }
        Button(
            onClick = {
                navController.navigate(ROUT_ABOUT)
            },
            colors = ButtonDefaults.buttonColors(neworange),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp)

        ) {
            Text(
                text = " About Us ",
            )
        }

    }

}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen(rememberNavController())
}