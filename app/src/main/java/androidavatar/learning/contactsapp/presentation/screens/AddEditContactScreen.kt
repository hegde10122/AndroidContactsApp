package androidavatar.learning.contactsapp.presentation.screens


import androidavatar.learning.contactsapp.domain.usecase.ContactFormValidator
import androidavatar.learning.contactsapp.presentation.components.ReusableTextField
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.Button
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.compose.material3.Text
import androidx.compose.ui.graphics.Color

@Composable
fun AddEditContactScreen(navController: NavController){
    val validator = remember { ContactFormValidator() }

    var name by remember { mutableStateOf("") }
    var phone by remember { mutableStateOf("") }
    var address by remember { mutableStateOf("") }
    var pincode by remember { mutableStateOf("") }

    var nameError by remember { mutableStateOf<String?>(null) }
    var phoneError by remember { mutableStateOf<String?>(null) }
    var addressError by remember { mutableStateOf<String?>(null) }
    var pincodeError by remember { mutableStateOf<String?>(null) }

    Column (modifier = Modifier.fillMaxSize().padding(16.dp).statusBarsPadding() ){

        // Header Section with Title
        Text(
            text = "Add/Edit Contact",
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(bottom = 8.dp).fillMaxWidth()
        )

        // Divider as header separator
       // HorizontalDivider(color = Color.Gray, thickness = 1.dp, modifier = Modifier.padding(vertical = 16.dp))

        ReusableTextField(
            value = name,
            onValueChange = {
            name = it
            nameError = validator.validateName(it)
         },
            label = "Name",
            isError = nameError != null,
            errorMessage = nameError ?: "")
        Spacer(modifier = Modifier.height(16.dp))


        ReusableTextField(
            value = phone, onValueChange = {
                phone = it
                phoneError = validator.validatePhone(it) },
            label = "Phone number",
            maxLength = 10, // Limit to 10 digits for phone number,
            isError = phoneError!= null,
            errorMessage = phoneError ?: "")
        Spacer(modifier = Modifier.height(24.dp))


        ReusableTextField(value = address,
            onValueChange = {
                address = it
                addressError = validator.validateAddress(it)
            }, label = "Address", isError = addressError!=null, errorMessage = addressError ?: "")
        Spacer(modifier = Modifier.height(16.dp))

        ReusableTextField(value = pincode, onValueChange = {
            pincode = it
            pincodeError = validator.validatePincode(it)
        }, label = "Pincode", isError = pincodeError!= null, errorMessage = pincodeError ?: "", maxLength = 6)
        Spacer(modifier = Modifier.height(24.dp))
        Button(onClick = {

            if(validator.isFormValid(name, phone, address, pincode)){
                    navController.popBackStack()
                } else {
                    nameError = validator.validateName(name)
                    phoneError = validator.validatePhone(phone)
                    addressError = validator.validateAddress(address)
                    pincodeError = validator.validatePincode(pincode)
            }
            }, enabled = validator.isFormValid(name, phone, address, pincode)) { Text("Save Contact")}
    }

}