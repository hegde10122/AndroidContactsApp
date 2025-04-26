package androidavatar.learning.contactsapp.presentation.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment

@Composable
fun ContactsListScreen(navController: NavController){


    Column (
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ){
        Text(text="This is the Contacts List Screen",
            style=MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(bottom = 16.dp))

        Button(onClick = {
            navController.popBackStack()
        }) {
            Text("Back to Welcome")
        }
    }


}




/**
@Composable
fun ContactsListScreen(navController: NavController) {
Column(
modifier = Modifier
.fillMaxSize()
.padding(16.dp),
verticalArrangement = Arrangement.Top
) {
Text(
text = "Contacts List",
style = MaterialTheme.typography.headlineMedium,
modifier = Modifier.padding(bottom = 16.dp)
)

// Later: You will show a LazyColumn here with contacts
Text("Contact 1: John Doe")
Text("Contact 2: Jane Smith")
Text("Contact 3: Michael Brown")

Spacer(modifier = Modifier.height(32.dp))

Button(onClick = {
navController.popBackStack() // Go back to Welcome screen
}) {
Text("Back to Welcome")
}
}
}
 */