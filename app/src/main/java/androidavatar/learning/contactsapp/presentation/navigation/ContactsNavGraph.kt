package androidavatar.learning.contactsapp.presentation.navigation
import androidavatar.learning.contactsapp.presentation.screens.ContactsListScreen
import androidavatar.learning.contactsapp.presentation.screens.WelcomeScreen
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun ContactsApp() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "welcome"
    ) {
        composable("welcome") { WelcomeScreen(navController) }
        composable("contacts") { ContactsListScreen(navController) }
        // more screens...
    }
}