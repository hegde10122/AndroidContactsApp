package androidavatar.learning.contactsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidavatar.learning.contactsapp.ui.theme.ContactsAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ContactsAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ContactsAppTheme {
        Greeting("Android")
    }
}

/**
 Step 1: ---- the folder structure for this app

 src/
 └── main/
 ├── java/androidavatar/learning/contactsapp/
 │   ├── presentation/        <-- UI layer (Compose, ViewModels, Navigation)
 │   │   ├── screens/         <-- One folder per screen
 │   │   └── components/      <-- Shared UI elements (e.g., Buttons, Modals)
 │   ├── domain/              <-- Business logic layer
 │   │   ├── model/           <-- Data classes used in domain (Contact, etc.)
 │   │   ├── repository/      <-- Abstract repository interfaces
 │   │   └── usecase/         <-- One use case per class (Single Responsibility)
 │   ├── data/                <-- Data layer (Room, Repositories)
 │   │   ├── local/           <-- Room database, DAO
 │   │   ├── repository/      <-- Repository implementations
 │   │   └── mapper/          <-- Map data <-> domain models
 │   ├── di/                  <-- Dependency injection (Hilt modules)
 │   └── util/                <-- Utility classes (DateUtils, constants, etc.)
 └── res/
 └── values/
 └── themes.xml, strings.xml, styles.xml

  * */