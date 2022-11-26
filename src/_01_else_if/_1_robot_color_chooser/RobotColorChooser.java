
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
	    //2. Make the robot draw a shape (this will take more than one line of code)		
		//3. Set the pen width to 10
		//4. Ask the user what color pen they would like the robot to draw with
		//5. Use an if/else statement to set the pen color that the user requested
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		Robot rob = new Robot();
		rob.penDown();
		rob.setSpeed(50);
		for(int i = 0; i<100; i++) {
		String color = JOptionPane.showInputDialog("What color pen would you like the robot to draw with?");
		if(color.equalsIgnoreCase("red")) {
			rob.setPenColor(255,0,0);
		} if(color.equalsIgnoreCase("orange")) {
			rob.setPenColor(255,119,0);
		} if(color.equalsIgnoreCase("yellow")) {
			rob.setPenColor(255,213,0);
		} if(color.equalsIgnoreCase("green")) {
			rob.setPenColor(45,189,50);
		} if(color.equalsIgnoreCase("blue")) {
			rob.setPenColor(7,2,250);
		} if(color.equalsIgnoreCase("purple")) {
			rob.setPenColor(113,10,191);
		} if(color.equalsIgnoreCase("pink")) {
			rob.setPenColor(233,12,245);
		}
		rob.setPenWidth(10);
		rob.move(50);
		rob.turn(90);
		rob.move(50);
		rob.turn(90);
		rob.move(50);
		rob.turn(90);
		rob.move(50);
		}
		



	}
}
