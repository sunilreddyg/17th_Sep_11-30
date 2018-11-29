package method_parameters;

import org.openqa.selenium.By;

public class Mouse_hover_action {

	public static void main(String[] args) 
	{
		//Create object for repository
		Repository obj=new Repository();
		obj.launch_browser("chrome");
		obj.loadApp("https://www.hdfcbank.com/");
		obj.setTimeout(30);
		
		
		By Products=By.linkText("Products");
		obj.wait_for_Element_visible(Products);
		obj.MouseHover(Products);
		
		
		By cards=By.linkText("Cards");
		obj.wait_for_Element_visible(cards);
		obj.MouseHover(cards);
		
		By creditcards=By.linkText("Credit Cards");
		obj.wait_for_Element_visible(creditcards);
		obj.Click_element(creditcards);
		
		
				

	}

}
