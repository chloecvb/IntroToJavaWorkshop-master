import org.jointheleague.graphical.robot.Robot;

public class RobotIntro {
	public static void main(String[] args) {
		Robot chloe = new Robot(100,200);
		chloe.penDown();
		chloe.setSpeed(10);
		int not =1;
		while(not <=4){
			chloe.setRandomPenColor();
			chloe.move(100);
			chloe.turn(95);
			
		}
		

	}
}
