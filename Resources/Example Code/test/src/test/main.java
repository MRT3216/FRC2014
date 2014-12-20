package test;

import java.util.Random;

public class main {

	public static void main(String[] args)
	{
		Robot myRobot = new Robot(2, "Arm", "is running", true);
		System.out.println(myRobot.toString());
		Robot secondRobot = new Robot(3, "What?", "Has a motor", false);
		System.out.println(secondRobot.toString());
		
//		int[] myArr = new int[10];
//		for (int i = 0; i < 10; i++) 
//		{
//			myArr[i] = i;
//		}
		System.out.println(myRobot.drive(0));
	}
	
}
