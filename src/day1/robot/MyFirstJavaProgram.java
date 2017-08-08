package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot cow = new Robot("mini");
cow.penDown();
cow.setSpeed(10);	

cow.move(100);
cow.turn(90);
		
		cow.move(100);
		cow.turn(90);
		cow.move(100);
		cow.turn(90);
		cow.move(100);
		cow.turn(90);
		cow.move(100);
		cow.turn(45);
		cow.move(70);
		cow.turn(45);
		cow.move(50);
	
	}
}
