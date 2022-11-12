package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class areYouHappy {
public static void main(String[] args) {
	String happy = JOptionPane.showInputDialog("Are you happy?");
	if(happy.equalsIgnoreCase("yes")) {
		JOptionPane.showMessageDialog(null, "Keep doing what you're doing.");
	}if(happy.equalsIgnoreCase("no")) {
	String no = JOptionPane.showInputDialog("Do you want to be happy?"); {
		if(no.equalsIgnoreCase("no")) {
			JOptionPane.showMessageDialog(null, "Keep doing what you're doing.");
		}if(no.equalsIgnoreCase("yes")) {
			JOptionPane.showMessageDialog(null, "Then change something.");
		}
	}
	}
}
}
