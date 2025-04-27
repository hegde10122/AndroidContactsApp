package androidavatar.learning.contactsapp

import android.os.Bundle
import androidavatar.learning.contactsapp.presentation.navigation.ContactsApp
import androidavatar.learning.contactsapp.presentation.screens.AddEditContactScreen
import androidavatar.learning.contactsapp.presentation.screens.ContactsListScreen
import androidavatar.learning.contactsapp.presentation.screens.WelcomeScreen
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidavatar.learning.contactsapp.presentation.theme.ContactsAppTheme
import androidx.compose.runtime.Composable
import androidx.navigation.compose.composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ContactsAppTheme {
               ContactsApp()
            }
        }
    }
}



