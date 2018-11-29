package robot_actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Text_Copyto_Clipboard 
{

	public static void main(String[] args) throws IOException, InterruptedException, AWTException 
	{
		Runtime.getRuntime().exec("notepad.exe");
		Thread.sleep(5000);
		
		//Create object for repository class
		Robot robot=new Robot();
		robot.setAutoDelay(500);
		
		String text="Selenium has the support of some of the largest "
				+ "browser vendors who have taken (or are taking) steps "
				+ "to make Selenium a native part of their browser. "
				+ "It is also the core technology in countless "
				+ "other browser automation tools, APIs and frameworks.";
		
		
		
		//select String
		StringSelection Stext=new StringSelection(text);
		//Get System clipboard
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		//Copy text to system clipboard
		clipboard.setContents(Stext, Stext);
		
	
		//Paste text into Notepad file
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		Thread.sleep(5000);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_S);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_S);
		
		
		Thread.sleep(5000);
		
		
		Clipboard clipboard1=Toolkit.getDefaultToolkit().getSystemClipboard();
		String text1="D:\\sunill\\17th_Sep_11-30AM\\Sample1\\src\\robot_actions\\Sample.txt";
		clipboard1.setContents(new StringSelection(text1), new StringSelection(text1));
		
		
		//Paste text into Notepad file
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
			

		Thread.sleep(5000);
		robot.keyPress(KeyEvent.VK_ENTER);
	
		
		
	}

}
