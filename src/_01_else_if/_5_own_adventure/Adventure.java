package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class Adventure {
	public static void main(String[] args) {
		String beginning = JOptionPane.showInputDialog("You wake up in a black room with two drinks, one red, the other blue and a note. The note tells you to drink one of the potions. Which one do you drink, the red or the blue?");
		if(beginning.equalsIgnoreCase("blue")) {
			JOptionPane.showMessageDialog(null, "Poisoned ending. You drank the wrong drink and died.");
		}if(beginning.equalsIgnoreCase("red")) {
			String desert = JOptionPane.showInputDialog("You wake up in a desert but you are very tired. You look around and see a village not too far away. Do you walk towards the village, or do you go to sleep?");
			if(desert.equalsIgnoreCase("go to sleep")) {
				JOptionPane.showMessageDialog(null, "You fall asleep but suddenly wake up to a bunch of robbers there to kill you. Desert Robbers Ending.");
			}if(desert.equalsIgnoreCase("go to village")) {
				String village = JOptionPane.showInputDialog("When you reach the village you meet a man who invites you over to rest at his house. You can either go with him, or explore more to find help.");
				if(village.equalsIgnoreCase("explore")) {
					JOptionPane.showMessageDialog(null, "You explore more but it gets dark out and you don't know where you are. Lost ending.");
				}if(village.equalsIgnoreCase("go with him")) {
					JOptionPane.showMessageDialog(null, "You head over to his house and his family calls 911. You get rescued and return home safely. Good Ending.");
				}
			}
		}
	}
}
