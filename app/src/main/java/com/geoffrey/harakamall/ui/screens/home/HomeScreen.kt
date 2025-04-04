package com.geoffrey.harakamall.ui.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
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

@Composable
fun HomeScreen(navController: NavController){

    Column (
        modifier = Modifier.fillMaxSize()
    ){

        Text(
            text = "HarakaMall",
            fontSize = 30.sp,
            color = Color.Magenta,
            fontWeight = FontWeight.ExtraBold
        )

        Image(
            painter = painterResource(R.drawable.home),
            contentDescription = "home"
        )

        Text(
            text = "Welcome to my App",
            fontSize = 15.sp,
            fontStyle = FontStyle.Italic

        )

        Text(
            text =
                    "An eCommerce website is a platform where you can buy or sell physical or digital products online. If you're looking to create one, consider using popular website builders like Shopify, which is highly rated for its sales features and business management tools. Other notable platforms include Wix and Squarespace, which offer various functionalities to help you build an attractive online store. For inspiration, you can explore well-designed eCommerce websites like Zulu and Longines.",
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold
        )
        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(Color.Magenta),
            shape = RoundedCornerShape(10.dp)
        ) {
            Text(
                text = "Add to Cart",
            )
        }

    }

}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen(rememberNavController())
}