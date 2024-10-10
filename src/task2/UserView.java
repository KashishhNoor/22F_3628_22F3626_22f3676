package task2;

import java.awt.Color;
import java.awt.Font;

public class UserView {

	public void designUI() {
		// Button colors to green
		loginButton.setBackground(Color.GREEN);
		cancelButton.setBackground(Color.GREEN);
		forgotPasswordButton.setBackground(Color.GREEN);

		// Adjust font size for visibility
		Font buttonFont = new Font("Arial", Font.BOLD, 16);
		loginButton.setFont(buttonFont);
		cancelButton.setFont(buttonFont);
		forgotPasswordButton.setFont(buttonFont);
	}

}
