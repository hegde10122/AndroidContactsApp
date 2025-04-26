package androidavatar.learning.contactsapp.presentation.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun WelcomeScreen(navController: NavController) {
    // UI code for Welcome Screen
Column (modifier = Modifier.fillMaxSize().padding(16.dp),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally){
    
    Text("Welcome")
    Button(onClick ={
        navController.navigate("contacts")
    }){
        Text("Go to contacts list")
    }
}

}




/*
  Column is a layout composable.
  It arranges its children vertically — one below the other.
  It’s exactly like a Vertical LinearLayout in old XML-based Android development.

  Important Properties of Column
  verticalArrangement - Controls vertical spacing (e.g., Top, Center, Bottom, SpaceBetween)
  horizontalAlignment - Align children horizontally (e.g., Start, CenterHorizontally, End)
  modifier - Add padding, background color, click listeners, etc.
 */



