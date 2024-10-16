package task3;

import java.util.HashSet;
import java.util.logging.Logger;

public class UserAuthenticationService {
    private static final Logger logger = Logger.getLogger(UserAuthenticationService.class.getName());
    private HashSet<String> registeredUsers = new HashSet<>();

    public String validateUser(String username, String password, String email) {
        if (username == null || username.length() < 5) {
            return "Error: Username must be at least 5 characters long.";
        }

        if (password == null || !password.matches(".[!@#$%^&].*")) {
            return "Error: Password must contain at least one special character.";
        }

        if (email == null || !email.contains("@")) {
            return "Error: Invalid email format.";
        }

        if (registeredUsers.contains(username)) {
            return "Error: Username already exists.";
        }
        
        registeredUsers.add(username);
        logger.info("User registered successfully: " + username);

        return "Registration successful!";
    }
}