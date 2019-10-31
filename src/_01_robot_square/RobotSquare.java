package _01_robot_square;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;

// This recipe draws a square using the Robot

public class RobotSquare {
    public static void main(String[] args) throws Exception {
 
    	// 1. Make a new Robot

 Robot bigboi=new Robot();
        // 3. Put the robot's pen down
     bigboi.penDown();

        // 6. Make the robot move as fast as possible

      bigboi.setSpeed(500);
        // 5. Do everything below here 4 times

      
     // for an integer, which I have called i, set the integer to 1
      //if the integer, is less than or equal to 10, {DO MY COMMAND}
     // at the end, increase i by 1 and repeat.
    //for loop  
      for(int i =1;
    		  i<=4;
    		  i++){  
        //         2. Move your robot 200 pixels
bigboi.move(200);

        //         4. Turn the robot 90 degrees to the right (90 degrees)

                        bigboi.turn(-90);
    }
}
}
