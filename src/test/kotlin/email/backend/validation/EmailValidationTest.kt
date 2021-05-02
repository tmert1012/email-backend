package email.backend.validation

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource

internal class EmailValidationTest {

    @ParameterizedTest
    @MethodSource("good")
    fun isValidEmail(email: String) {
        assert(EmailValidation.isValidEmail(email))
    }

    @ParameterizedTest
    @MethodSource("bad")
    fun isInvalidEmail(email: String) {
        assert(!EmailValidation.isValidEmail(email))
    }

    companion object {
        @JvmStatic
        fun good() = listOf(
            "test@email.com", "another@something.net"
        )

        @JvmStatic
        fun bad() = listOf(
            "adsf", "another@123@"
        )
    }
}