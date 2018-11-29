package org.java.Staticmethods;

public class MobileFeatures
{
	public static void calling()
	{
		System.out.println("call executed");
	}
	
	public static void sendingtext()
	{
		System.out.println("Send executed");
	}
	
	
	public static void main(String[] args) 
	{
		
		/*
		 * IF method contains static specifier we can call
		 *	method directly without object creation with in class 
		 */
		  calling();
		  sendingtext();
	}

}
