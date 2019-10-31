package _02_robot_graffiti;



import org.jointheleague.graphical.robot.Robot;

public class _02_robot_graffiti {
	

	public static void main(String[] args) {
		
	Robot bigboi =new Robot();
	
	bigboi.penDown();
	 bigboi.setSpeed(500);
		bigboi.turn(-90);
		bigboi.move(100);
		bigboi.turn(-90);
		bigboi.move(200);
		bigboi.move(-100);
		bigboi.turn(-90);
		bigboi.move(100);
		bigboi.turn(-90);
		bigboi.move(100);
		bigboi.move(-100);
		bigboi.turn(90);
		bigboi.move(-100);
		bigboi.turn(45);
		bigboi.move(150);
		
		
	}
}
