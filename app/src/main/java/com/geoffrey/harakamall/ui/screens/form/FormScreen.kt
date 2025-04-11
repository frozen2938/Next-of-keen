package com.geoffrey.harakamall.ui.screens.form

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.geoffrey.harakamall.R
import com.geoffrey.harakamall.navigation.ROUT_DASHBOARD
import com.geoffrey.harakamall.ui.theme.neworange
import com.geoffrey.harakamall.ui.theme.neworangeone
import com.geoffrey.harakamall.ui.theme.newwhitw1

@Composable
fun FormScreen(navController: NavController){

    //Variables

    var fullname by remember { mutableStateOf("") }
    var username by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirmpassword by remember { mutableStateOf("") }

    //End of Variable

    Column (
        modifier = Modifier
            .fillMaxSize()
            .paint(painter = painterResource(R.drawable.bgimage), contentScale = ContentScale.FillBounds),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){

        Image(
            painter = painterResource(R.drawable.avatar),
            contentDescription = "",
            modifier = Modifier.size(180.dp),
            colorFilter = ColorFilter.tint(neworangeone)
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "CREATE AN ACCOUNT",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(20.dp))

        //Fullname
        OutlinedTextField(
            value = fullname,
            onValueChange = { fullname = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            trailingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "fullname", tint = neworange) },
            label = { Text(text = "Fullname") },
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = neworange,
                focusedLabelColor = neworange,
                unfocusedBorderColor = Color.Black
            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )
        //End of fullname

        Spacer(modifier = Modifier.height(10.dp))

        //Username
        OutlinedTextField(
            value = fullname,
            onValueChange = { username = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            trailingIcon = { Icon(imageVector = Icons.Default.Face, contentDescription = "username", tint = neworange) },
            label = { Text(text = "Username") },
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = neworange,
                focusedLabelColor = neworange,
                unfocusedBorderColor = Color.Black
            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )
        //End of Username

        Spacer(modifier = Modifier.height(10.dp))

        //Email
        OutlinedTextField(
            value = fullname,
            onValueChange = { email = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            trailingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "email", tint = neworange) },
            label = { Text(text = "Email Address") },
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = neworange,
                focusedLabelColor = neworange,
                unfocusedBorderColor = Color.Black
            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
        )
        //End of Email Address

        Spacer(modifier = Modifier.height(10.dp))

        //Password
        OutlinedTextField(
            value = fullname,
            onValueChange = { password = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            trailingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "password", tint = neworange) },
            label = { Text(text = "Password") },
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = neworange,
                focusedLabelColor = neworange,
                unfocusedBorderColor = Color.Black
            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation()
        )
        //End of Password

        Spacer(modifier = Modifier.height(10.dp))

        //Confirm Password
        OutlinedTextField(
            value = fullname,
            onValueChange = { confirmpassword = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            trailingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "confirmpassword", tint = neworange) },
            label = { Text(text = "Confirm Password") },
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = neworange,
                focusedLabelColor = neworange,
                unfocusedBorderColor = Color.Black
            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation()
        )
        //End of Confirm Password

        Spacer(modifier = Modifier.height(10.dp))

        Button(
            onClick = {

            },
            colors = ButtonDefaults.buttonColors(neworange),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp)

        ) {
            Text(
                text = "SignUp",
            )
        }

    }


}

@Preview(showBackground = true)
@Composable
fun FormScreenPreview(){

    FormScreen(rememberNavController())

}