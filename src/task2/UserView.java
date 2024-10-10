package task2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class UserView {
    JFrame frame;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton cancelButton;
    private JButton forgotPasswordButton;
    private JLabel newLabel;

    public UserView() {
        frame = new JFrame("User Authentication");
        usernameField = new JTextField(20);
        passwordField = new JPasswordField(20);
        loginButton = new JButton("Login");
        cancelButton = new JButton("Cancel");
        forgotPasswordButton = new JButton("Forgot Password");
        newLabel = new JLabel("Welcome to User Authentication");

        // Combined UI design changes from both members
        designUI();

        // Panel setup (with some rearrangement from Member 2)
        JPanel panel = new JPanel(new GridLayout(4, 2));
        panel.add(new JLabel("Username:"));
        panel.add(usernameField);
        panel.add(new JLabel("Password:"));
        panel.add(passwordField);
        panel.add(loginButton);
        panel.add(cancelButton);
        panel.add(forgotPasswordButton);
        panel.add(newLabel); // Added new label from Member 2

        frame.add(panel);
        frame.setSize(500, 300); // Adjusted size for layout
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    // Merged designUI() method incorporating both Member 1's and Member 2's changes
    public void designUI() {
        // Member 1: Button colors to green and font size changes
        loginButton.setBackground(Color.LIGHT_GRAY);
        cancelButton.setBackground(Color.LIGHT_GRAY);
        forgotPasswordButton.setBackground(Color.LIGHT_GRAY);

        Font buttonFont = new Font("Arial", Font.BOLD, 16);
        loginButton.setFont(buttonFont);
        cancelButton.setFont(buttonFont);
        forgotPasswordButton.setFont(buttonFont);

        // Member 2: Modify layout and add new components
        frame.setLayout(new FlowLayout());
        newLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        frame.add(newLabel);
    }

    // Additional methods...
    public String getUsername() {
        return usernameField.getText();
    }

    public String getPassword() {
        return new String(passwordField.getPassword());
    }

    public void clearFields() {
        usernameField.setText("");
        passwordField.setText("");
    }

    public void showMessage(String message) {
        JOptionPane.showMessageDialog(frame, message);
    }

    public void addLoginListener(ActionListener listener) {
        loginButton.addActionListener(listener);
    }

    public void addCancelListener(ActionListener listener) {
        cancelButton.addActionListener(listener);
    }

    public void addForgotPasswordListener(ActionListener listener) {
        forgotPasswordButton.addActionListener(listener);
    }

	public static void main(String[] args) {
		// Create an instance of the UserView to display the GUI
		new UserView();
	}

}