### 1. Project Setup
   
Project Name: ContactsApp

Architecture: Clean Architecture + MVVM

Layers:
* presentation
* domain
* data
* di
* util

### 2. MainActivity
   
Located at root package.
Responsibility: Set up Compose theme and call ContactsApp().

Notes:
------
We don't write logic in MainActivity.
It acts as an entry point only.

### 3. Navigation Setup (ContactsApp Composable)
   
ContactsApp() is a @Composable function.
Uses NavController for screen navigation.

Defines the NavHost:
Start destination: welcome
Screens:
WelcomeScreen
ContactsListScreen

