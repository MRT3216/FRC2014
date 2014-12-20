package test;

public class Robot {
	
	public int speed = 0;
	public String arm = "Robot arm";
	public String motor;
	public Boolean isAutonomous;
	
	public Robot(int s, String a, String m, Boolean e) {
		this.speed = s;
		this.arm = a;
		this.motor = m;
		this.isAutonomous = e;
		
	}
	
	public String drive(int w)
	{
		String value = "";
		if (w == 0) {
			value = this.forward();
		}
		else if (w == 1) {
			value = this.reverse();
		}
		else if (w == 2) {
			value = this.turnRight();
		}
		else if (w == 3) {
			value = this.turnLeft();
		}
		return value;
	}
	
	public String forward() {
		return "Going forward";
	}
	
	public String reverse() {
		return "going backwards";
	}
	
	public String turnRight() {
		return "turning right.";
	}
	
	public String turnLeft() {
		return "turning left.";
	}
	public String toString()
	{
		return this.speed + ", " + this.arm + ", " + this.motor + ", " + this.isAutonomous;
	}

}
