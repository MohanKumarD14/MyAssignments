package marathon3;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import week5.day1.CommonIntegration;

public class ProjectSpecificMethod {
	public  RemoteWebDriver driver;
	public String data;


	@DataProvider(name="getData")
	public String[][] setValue() throws IOException{	
		return CommonIntegration1.readExcel(data);	
	}

	@Parameters({"Browser","URL","UserName","Password"})
	@BeforeMethod
	public void precondition(String Browser, String URL, String Uname, String password)
	{
		if(Browser.equalsIgnoreCase("Chrome")) 
		{ 
			ChromeOptions opt= new ChromeOptions();
			opt.addArguments("--disable-notifications");
			driver = new ChromeDriver(opt);

		} 
		else if(Browser.equalsIgnoreCase("Firefox")) 
		{ 
			driver = new FirefoxDriver();		 
		} 
		else 
		{
			System.out.println("No browser value given");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(URL);
		driver.findElement(By.id("username")).sendKeys(Uname);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'View All')]")).click();
		driver.findElement(By.xpath("//span/p[text()='Sales']")).click();
		driver.findElement(By.xpath("//span[text()='Opportunities']/ancestor::one-app-nav-bar-item-root")).click();
	}

	@AfterMethod
	public void postcondition()
	{
		driver.close();

	}
}
