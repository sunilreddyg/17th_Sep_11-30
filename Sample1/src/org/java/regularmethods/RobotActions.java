package org.java.regularmethods;

public class RobotActions 
{
	
	public void run()
	{
		System.out.println("run executed");
	}
	
	
	public void walk()
	{
		
		System.out.println("walk executed");
	}
	

	public static void main(String[] args) 
	{
		/*
		 * Otherthan static methods we should create object to 
		 * call.
		 */
		RobotActions ref=new RobotActions();
		ref.run();
		ref.walk();
		
		
		
	}

}
