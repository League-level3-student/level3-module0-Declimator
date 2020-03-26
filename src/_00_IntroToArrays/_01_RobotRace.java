package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {
int Random;
int x = 0;
		// 2. create an array of 5 robots.
		Robot[] array = new Robot[5];

		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < 5; i++) {
			array[i] = new Robot();
			array[i].setSpeed(1000);
		}

		// 4. make each robot start at the bottom of the screen, side by side, facing up
		for(int i = 0; i < 5; i++) {
			array[i].moveTo(200*i+50, 500);
		}
		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		for(int i = 0; i < 5; i++) {
			Random = new Random().nextInt(50);
			array[i].move(Random);
		}
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.
		while(array[x].getY() > 50) {
			for(int i = 0; i < 5; i++) {
				Random = new Random().nextInt(50);
				array[i].move(Random);
				x++;
				if(x==4) {
					x=0;
				}
			}
		}
		// 7. declare that robot the winner and throw it a party!
		System.out.println("Robot " + (x+1) + " has won.");
		// 8. try different races with different amounts of robots.
		// 9. make the robots race around a circular track.

	}
}
