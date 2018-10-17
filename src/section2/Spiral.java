package section2;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot saitama = new Robot();
		
		saitama.setSpeed(100);
		
		// 4. Use a for loop to repeat steps #7 to #8, 75 times

			// 7. Change the pen color to random
		saitama.setRandomPenColor();
			// 6. Move the robot 5 times the loop counter (5*i)
			saitama.move();
			// 2. Turn the robot 360/7 degrees to the right
			saitama.turn(360/7);
	}
}
