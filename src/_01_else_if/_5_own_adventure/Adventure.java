package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class Adventure {
public static void main(String[] args) {
	String beginning = JOptionPane.showInputDialog("You wake up in a black room with two drinks, one red, the other blue and a note. The note tells you to drink one of the potions. Which one do you drink, the red or the blue?");
	if(beginning.equalsIgnoreCase("blue")) {
		JOptionPane.showMessageDialog(null, "Poisoned ending. You drank the wrong drink and died.");
	}if(beginning.equalsIgnoreCase("red")) {
		String desert = JOptionPane.showInputDialog("You wake up in a desert but you are very tired. You look around and see a village not too far away. Do you walk towards the village, or do you go to sleep?");
				
	}
}
}
