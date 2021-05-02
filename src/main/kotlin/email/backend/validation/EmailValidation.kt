package email.backend.validation

import java.util.regex.Pattern

object EmailValidation {

    val VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE)

    fun isValidEmail(email: String): Boolean {
        val matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email)
        return matcher.find()
    }

}