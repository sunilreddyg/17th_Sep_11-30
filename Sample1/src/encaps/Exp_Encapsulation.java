package encaps;

public class Exp_Encapsulation 
{
	
	private String name;
	private String mobile;
	private String email;
	
	
	
	public void Set_name(String user_name)
	{
		name=user_name;
	}
	
	public void Set_mobile(String user_mobile)
	{
		mobile=user_mobile;
	}
	
	
	public void Set_email(String user_email)
	{
		email=user_email;
	}
	
	
	
	public String getname()
	{
		return name;
	}
	
	public String getmobile()
	{
		return mobile;
	}
	
	
	public String getemail()
	{
		return email;
	}
	
	
	
	

}
