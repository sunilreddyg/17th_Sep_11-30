package org.java.variables;

public class String_Comparision_Methods 
{

	public static void main(String[] args) 
	{
		/*
		 * String is a non-primitive datatype and also called
		 * as class.
		 */
		
		
		/*
		 * Equals:-->
		 * 		Method verify equal comparision between two strings
		 * 		and return boolean value true/false.
		 */
		String act_res="Account Created";
		String exp_res="account created";
		boolean flag=act_res.equals(exp_res);
		System.out.println("Equal comparision status is => "+flag);
		
		
		/*
		 * equalignorecase:-->
		 * 		Method verify equalignorecase comparision between
		 * 		two strings and return boolean value true/false.
		 */
		boolean flag1=act_res.equalsIgnoreCase(exp_res);
		System.out.println("EqualIgnore case comparision is => "+flag1);

		/*
		 * contains:-->
		 * 		Method verify sub String available at main String
		 * 		and return true/false.
		 */
		String Status="Account 100 created successfull";
		boolean flag2=Status.contains("100");
		System.out.println("Sub String status => "+flag2);
		
		
		/*
		 * SubString:-->
		 * 	Method get subString from main String
		 */
		String Account_num="001245785412012334";
		String four_digit_num=Account_num.substring(14);
		System.out.println("last 4 digit number is => "+four_digit_num);
		
		String sub=Account_num.substring(6, 10);
		System.out.println("sub String is => "+sub);
		
		
		/*
		 * trim:--> Method trim extra spaces
		 */
		String mobile="   9030248855   ";
		System.out.println("Mobile number length before trim => "+mobile.length());
		
		String New_mobile=mobile.trim();
		System.out.println("Mobile number after trim => "+New_mobile.length());
		
		
		/*
		 * isempty:--->
		 */
		String var="hello";
		String var1="";
		
		System.out.println("Var empty statu is  =>"+var.isEmpty());
		System.out.println("var1 is empty status is => "+var1.isEmpty());
		
		
		
		
	}

}
