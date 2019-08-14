package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {

	// 1. make a main method
	public static void main(String[] args) {
		Robot[] rob = new Robot[5];
		boolean raceFinished = true;

		for (int i = 0; i < rob.length; i++) {
			rob[i] = new Robot();
			rob[i].setSpeed(12);
			rob[i].miniaturize();
			rob[i].moveTo(20 + i * 40, 575);
			rob[i].penDown();
			rob[i].setRandomPenColor();
		}
		while (raceFinished) {
			for (int i = 0; i < rob.length; i++) {
				if (rob[i].getY() <= 40) {
					raceFinished = false;
					System.out.println("go robot "+i+" you won!");
				}
				int rand = new Random().nextInt(50);
				rob[i].move(rand);
			}
		}
	}
	// 2. create an array of 5 robots.
//
	// 3. use a for loop to initialize the robots.
//
	// 4. make each robot start at the bottom of the screen, side by side, facing up
//
	// 5. use another for loop to iterate through the array and make each robot move
	// a random amount less than 50.

	// 6. use a while loop to repeat step 5 until a robot has reached the top of the
	// screen.

	// 7. declare that robot the winner and throw it a party!

	// 8. try different races with different amounts of robots.

	// 9. make the robots race around a circular track.
}
