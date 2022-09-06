package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CromeBrowser {

	public static void main(String[]args)
	{
		System.setProperty
("webdriver.chrome.driver","C:\\software\\chromedriver.exe");
	WebDriver obj=new ChromeDriver();//upcasting
	obj.get
	("https://www.google.com/search?q=facebook&rlz=1C1VDKB_enIN1011IN1012&oq=face&aqs=chrome.0.69i59j69i57j0i20i131i263i433i512j0i512j69i60l3j69i61.3130j0j7&sourceid=chrome&ie=UTF-8");
	}
}
