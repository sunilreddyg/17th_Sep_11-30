package encaps;

public class Run_Encapsulation {

	public static void main(String[] args) 
	{
		
		//Create object for class
		Exp_Encapsulation obj=new Exp_Encapsulation();
		obj.Set_name("Sunil");
		obj.Set_mobile("90302488855");
		obj.Set_email("sunilreddy.gajjala@gmail.com");
		
		
		String Myname=obj.getname();
		String Mymobile=obj.getmobile();
		String Myemail=obj.getemail();
		
		System.out.println(Myname+"    "+Mymobile+"     "+Myemail);
	}

}
