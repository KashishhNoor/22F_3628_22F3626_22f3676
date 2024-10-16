package task2;
import javax.swing.*;

import task3.UserAuthenticationService;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class UserView {
    JFrame frame;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JTextField emailField;
    private JButton loginButton;
    private JButton cancelButton;
    private JButton forgotPasswordButton;
    private UserAuthenticationService userAuthenticationService;

    public UserView(UserAuthenticationService userAuthenticationService) {
        this.userAuthenticationService = userAuthenticationService; 
        
        frame = new JFrame("User Authentication");
        usernameField = new JTextField(20);
        passwordField = new JPasswordField(20);
        emailField = new JTextField(20);
        loginButton = new JButton("Login");
        cancelButton = new JButton("Cancel");
        forgotPasswordButton = new JButton("Forgot Password");

        // Combined UI design changes from both members
        designUI();

        // Panel setup
        JPanel panel = new JPanel(new GridLayout(5, 2)); // Increased row count for email field
        panel.add(new JLabel("Username:"));
        panel.add(usernameField);
        panel.add(new JLabel("Password:"));
        panel.add(passwordField);
        panel.add(new JLabel("Email:"));
        panel.add(emailField); // Added email field
        panel.add(loginButton);
        panel.add(cancelButton);
        panel.add(forgotPasswordButton);

        frame.add(panel);
        frame.setSize(500, 300); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        addLoginListener();
        addCancelListener();
        addForgotPasswordListener();
    }
    public void designUI() {
        loginButton.setBackground(Color.LIGHT_GRAY);
        cancelButton.setBackground(Color.LIGHT_GRAY);
        forgotPasswordButton.setBackground(Color.LIGHT_GRAY);

        Font buttonFont = new Font("Arial", Font.BOLD, 16);
        loginButton.setFont(buttonFont);
        cancelButton.setFont(buttonFont);
        forgotPasswordButton.setFont(buttonFont);
        frame.setLayout(new FlowLayout());
    }

    public String getUsername() {
        return usernameField.getText();
    }

    public String getPassword() {
        return new String(passwordField.getPassword());
    }

    public String getEmail() {
        return emailField.getText();
    }

    public void clearFields() {
        usernameField.setText("");
        passwordField.setText("");
        emailField.setText("");
    }

    public void showMessage(String message) {
        JOptionPane.showMessageDialog(frame, message);
    }

    public void addLoginListener() {
        loginButton.addActionListener(e -> {
            String username = getUsername();
            String password = getPassword();
            String email = getEmail(); 
            String result = userAuthenticationService.validateUser(username, password, email);
            showMessage(result); 
        });
    }
    public void addCancelListener() {
        cancelButton.addActionListener(e -> clearFields());
    }

    public void addForgotPasswordListener() {
        forgotPasswordButton.addActionListener(e -> showMessage("Forgot password feature not implemented yet."));
    }

    public static void main(String[] args) {
        UserAuthenticationService userAuthenticationService = new UserAuthenticationService();
        new UserView(userAuthenticationService);
    }
}