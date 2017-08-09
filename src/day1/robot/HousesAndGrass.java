package day1.robot;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class HousesAndGrass {
	public static void main(String[] args) {
	Robot cow = new Robot("mini");
	cow.setSpeed(10);
	for(int i=0;i<73;i++)
		cow.penDown();
	cow.setPenColor(Color.GREEN);
	cow.turn(90);
	cow.move(50);
	cow.turn(-90);
	cow.setPenColor(Color.GRAY);
	cow.move(200);
	cow.turn(90);
	cow.move(100);
	cow.turn(90);
	cow.move(200);
	cow.penUp();
	cow.move(-100);
	
	
	
		
	}
}
