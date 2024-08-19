package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		//Step1:
		ChromeDriver driver=new ChromeDriver();
		
		//Step2: maximize screen
		
		driver.manage().window().maximize();
		
		//Step3: Load URL
		
		driver.get("https://www.google.com/");
		
		//Step4: Close the browser
		
		driver.close();
	}

}
