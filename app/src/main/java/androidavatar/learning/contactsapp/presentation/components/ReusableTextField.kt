package androidavatar.learning.contactsapp.presentation.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ReusableTextField(
    value: String,
    onValueChange: (String) -> Unit,
    label: String,
    modifier: Modifier = Modifier,
    singleLine: Boolean = true,
    isError: Boolean = false,
    errorMessage: String? = null,
    maxLength: Int? = null // Optional maxLength parameter

) {

    Column(
        modifier = modifier.fillMaxWidth()
    ) {

        TextField(
            value = value,
            onValueChange = {
                if (maxLength == null || it.length <= maxLength) {
                    onValueChange(it)
                }
            },
            modifier = modifier.fillMaxWidth(),
            label = { Text(label) },
            singleLine = singleLine,
            isError = isError,
            colors = TextFieldDefaults.colors(
                //setting the text field background when it is focused
                focusedContainerColor = Color.White,

                //setting the text field background when it is unfocused or initial state
                unfocusedContainerColor = Color.White,

                //setting the text field background when it is disabled
                disabledContainerColor = Color.Gray,

                errorIndicatorColor = Color.Red,
            )
            )



        // ✅ Error Message Text
        if (isError && !errorMessage.isNullOrEmpty()) {
            Text(
                text = errorMessage,
                color = Color.Red,
                style = MaterialTheme.typography.labelSmall,
                modifier = Modifier.padding(start = 16.dp, top = 4.dp)
            )
        }
    }

}
