package _02_loop_variables._4_99_bottles.bottles;

import javax.swing.JOptionPane;

public class Bottles {
	public static void main(String[] args) {

		for(int i=99; i>=1; i--) {
			if(i==2) {
				System.out.println(i+" bottles of beer on the wall, "+i+ " bottles of beer. Take one down and pass it around, " +(i-1)+" more bottle of beer on the wall.");
			}else if(i==1) {
				System.out.println(i+" bottle of beer on the wall, "+i+ " bottle of beer. Take one down and pass it around, no more bottles of beer on the wall.");
			} else {
				System.out.println(i+" bottles of beer on the wall, "+i+ " bottles of beer. Take one down and pass it around, " +(i-1)+" bottles of beer on the wall.");			
			}
		}
	}
}
