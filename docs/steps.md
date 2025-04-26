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
   
Located at root package.<br/>
Responsibility: Set up Compose theme and call ContactsApp().<br/>

Notes:
We don't write logic in MainActivity.<br/>
It acts as an entry point only.

### 3. Navigation Setup (ContactsApp Composable)
   
* ContactsApp() is a @Composable function.
* Uses NavController for screen navigation.
* Defines the NavHost:
  * Start destination: welcome
  * Screens:
    * WelcomeScreen
    * ContactsListScreen

### 4. Screens

WelcomeScreen.kt

* Type: @Composable function.
* Purpose: Display welcome message + button.
* Action: On button click → navigate to ContactsListScreen.

