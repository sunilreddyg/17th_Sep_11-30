package user_define_method;


public class Run_WebTable 
{
	
	public static void main(String args[]) throws Exception
	{
		
		
		//Create object for Repository
		Repository obj=new Repository();
		obj.browserlaunch("chrome");
		obj.LoadApp("http://content.icicidirect.com/IdirectContent/Markets/MarketOverview.aspx");
		obj.setTimeout(30);
		
		
		String Record_name=obj.Get_Table_CellAddress("//div[@id='pnl_Bse']", 3, 0).getText();
		System.out.println("Stock name is "+Record_name);
		
		obj.Get_Table_CellAddress("//div[@id='pnl_Bse']", 4, 0).click();
		obj.driver.navigate().back();
		Thread.sleep(5000);
		
		
		obj.Webtable_Dynamic_CellAdress("//div[@id='pnl_Bse']", "TCS", 7).click();
		
		
	}
 

}
