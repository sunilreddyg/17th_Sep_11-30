package org.java.regularmethods;

public class CallingRegular_MethodsFrom_Diff_class {

	public static void main(String[] args) 
	{
		/*
		 * To call regular methods [Otherthan static] from
		 * same class or diff class we must creat object.
		 * 		
		 * 		classname obj=new classname();
		 * 		obj.methodname();
		 */
		
		RobotActions obj=new RobotActions();
		obj.run();
		obj.walk();

	}

}
