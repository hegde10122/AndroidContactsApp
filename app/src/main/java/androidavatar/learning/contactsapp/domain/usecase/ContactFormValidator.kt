package androidavatar.learning.contactsapp.domain.usecase

import androidavatar.learning.contactsapp.domain.constants.ValidationConstants

class ContactFormValidator {

    fun validateName(name: String): String? {
        return if (name.isBlank()) "Name cannot be empty" else null
    }

    fun validatePhone(phone: String): String? {
        return if (phone.length != ValidationConstants.PHONE_LENGTH || phone.any { !it.isDigit() }) "Invalid phone number" else null
    }

    fun validateAddress(address: String): String? {
        return if (address.length < ValidationConstants.ADDRESS_MIN_LENGTH) "Address too short" else null
    }

    fun validatePincode(pincode: String): String? {
        return when {
            pincode.isBlank() -> "Pincode cannot be empty"
            pincode.length != ValidationConstants.PINCODE_LENGTH -> "Pincode must be exactly 6 digits"
            pincode.any { !it.isDigit() } -> "Pincode must contain only digits"
            else -> null
        }
    }

    fun isFormValid(
        name: String,
        phone: String,
        address: String,
        pincode: String
    ): Boolean {
        return validateName(name) == null &&
                validatePhone(phone) == null &&
                validateAddress(address) == null &&
                validatePincode(pincode) == null
    }

}