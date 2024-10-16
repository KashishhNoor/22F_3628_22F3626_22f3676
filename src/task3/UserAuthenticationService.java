package task3;

public class UserAuthenticationService {

    public static String validateUser(String username, String password, String email) {
        if (username.length() < 6) {
            return "Username must be at least 6 characters long.";
        }
        if (!password.matches(".*[!@#$%^&*()].*")) {
            return "Password must contain at least one special character.";
        }

        if (!email.contains("@")) {
            return "Email must contain '@'.";
        }

        return "Validation successful!";
    }

    public static String registerUser(String username, String password, String email) {
        return "User successfully registered!";
    }
}

