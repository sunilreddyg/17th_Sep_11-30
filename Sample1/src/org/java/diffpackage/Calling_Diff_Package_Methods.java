package org.java.diffpackage;

import org.java.Staticmethods.MobileFeatures;
import org.java.regularmethods.RobotActions;

public class Calling_Diff_Package_Methods 
{

	public static void main(String[] args) 
	{
		
		/*
		 * Note:--> Before calling other package methods 
		 * 			and variables we must import package to
		 * 			current class.
		 */
		RobotActions obj=new RobotActions();
		obj.run();
		obj.walk();
		
		
		//Static methods to call from diff package
		MobileFeatures.calling();
		MobileFeatures.sendingtext();
		
	}

}
