import java.util.*

/**
 * Model class containing personal information that will be saved to SharedPreferences.
 */
class SharedPreferenceEntry(
    // Name of the user.
    val name: String,
    // Date of Birth of the user.
    val dateOfBirth: Calendar,
    // Email address of the user.
    val email: String
)