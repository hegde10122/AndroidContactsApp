package androidavatar.learning.contactsapp.presentation.screens

import androidavatar.learning.contactsapp.domain.model.Contact
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Divider
import androidx.compose.material3.HorizontalDivider

@Composable
fun ContactsListScreen(navController: NavController){

    val contacts = listOf(
        Contact(1, "John Doe", "123-456-7890"),
        Contact(2, "Jane Smith", "987-654-3210"),
        Contact(3, "Michael Brown", "456-789-0123")
    )

    Column (
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = "Contacts",
            style=MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        LazyColumn {
            items(contacts){
                contact -> ContactItem(contact)
                HorizontalDivider()
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            navController.popBackStack()
        }) {
            Text("Back to Welcome")
        }
    }

}

@Composable
fun ContactItem(contact: Contact) {

    Column(
        modifier = Modifier.padding(8.dp)
    ){
        Text(text = contact.name, style = MaterialTheme.typography.bodySmall)
        Text(text = contact.phoneNumber, style=MaterialTheme.typography.bodyLarge)
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

/**
val contacts = listOf(
Contact(1, "John Doe", "123-456-7890"),
Contact(2, "Jane Smith", "987-654-3210"),
Contact(3, "Michael Brown", "456-789-0123")
)
 * */