package com.geoffrey.harakamall.ui.screens.intent

import android.annotation.SuppressLint
import android.content.Intent
import android.provider.MediaStore
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.net.toUri
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.geoffrey.harakamall.navigation.ROUT_HOME
import com.geoffrey.harakamall.ui.theme.neworange
import com.geoffrey.harakamall.ui.theme.newwhite

@SuppressLint("QueryPermissionsNeeded")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun IntentScreen(navController: NavController){
    Column (
        modifier = Modifier.fillMaxSize()
    ){

        val mContext = LocalContext.current

        //TopAppBar
        TopAppBar(
            title  = { Text(text = "Intents") },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = neworange,
                titleContentColor = newwhite,
                navigationIconContentColor = newwhite,
                actionIconContentColor = newwhite
            ),
            //Menu Icon
            navigationIcon = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = "Menu")
                }
            },
            //End

            actions = {
                IconButton(onClick = {
                    val shareIntent=Intent(Intent.ACTION_SEND)
                    shareIntent.type="text/plain"
                    shareIntent.putExtra(Intent.EXTRA_TEXT, "Check out this is a cool content")
                    mContext.startActivity(Intent.createChooser(shareIntent, "Share"))
                }) {
                    Icon(imageVector = Icons.Default.Share, contentDescription = "")
                }
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Settings, contentDescription = "")
                }
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.ArrowForward, contentDescription = "")
                }
            }
        )
        //End of TopAppBar

        Spacer(modifier = Modifier.width(30.dp))

        //STK
        Button(
            onClick = {

                val simToolKitLaunchIntent =
                    mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                simToolKitLaunchIntent?.let { mContext.startActivity(it) }

            },
            colors = ButtonDefaults.buttonColors(neworange),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp, top = 30.dp)

        ) {
            Text(
                text = "M-PESA",
            )
        }
        //End of STK

        Spacer(modifier = Modifier.width(30.dp))

        //CALL
        Button(
            onClick = {

                val callIntent= Intent(Intent.ACTION_DIAL)
                callIntent.data="tel:0743906136".toUri()
                mContext.startActivity(callIntent)

            },
            colors = ButtonDefaults.buttonColors(neworange),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp, top = 30.dp)

        ) {
            Text(
                text = "CALL",
            )
        }
        //End of CALL

        Spacer(modifier = Modifier.width(30.dp))

        //EMAIL
        Button(
            onClick = {

                val shareIntent = Intent(Intent.ACTION_SEND)
                shareIntent.type = "text/plain"
                shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("sperkrey966@gmail.com"))
                shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
                mContext.startActivity(shareIntent)

            },
            colors = ButtonDefaults.buttonColors(neworange),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp, top = 30.dp)

        ) {
            Text(
                text = "EMAIL",
            )
        }
        //End of EMAIL

        Spacer(modifier = Modifier.width(30.dp))

        //SHARE
        Button(
            onClick = {

                val shareIntent=Intent(Intent.ACTION_SEND)
                shareIntent.type="text/plain"
                shareIntent.putExtra(Intent.EXTRA_TEXT, "Check out this is a cool content")
                mContext.startActivity(Intent.createChooser(shareIntent, "Share"))

            },
            colors = ButtonDefaults.buttonColors(neworange),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp, top = 30.dp)

        ) {
            Text(
                text = "SHARE",
            )
        }
        //End of SHARE

        Spacer(modifier = Modifier.width(30.dp))

        //SMS
        Button(
            onClick = {

                val smsIntent=Intent(Intent.ACTION_SENDTO)
                smsIntent.data="smsto:0743906136".toUri()
                smsIntent.putExtra("sms_body","Hello Geoffrey,how was your day?")
                mContext.startActivity(smsIntent)

            },
            colors = ButtonDefaults.buttonColors(neworange),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp, top = 30.dp)

        ) {
            Text(
                text = "SMS",
            )
        }
        //End of SMS

        Spacer(modifier = Modifier.width(30.dp))

        //CAMERA
        Button(
            onClick = {

                val cameraIntent=Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                if (cameraIntent.resolveActivity(mContext.packageManager)!=null){
                    mContext.startActivity(cameraIntent)
                }else{
                    println("Camera app is not available")
                }

            },
            colors = ButtonDefaults.buttonColors(neworange),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp, top = 30.dp)

        ) {
            Text(
                text = "CAMERA",
            )
        }
        //End of CAMERA

    }


}

@Preview(showBackground = true)
@Composable
fun IntentScreenPreview(){

    IntentScreen(rememberNavController())

}