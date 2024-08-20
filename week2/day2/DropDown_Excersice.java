package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Excersice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/.");
		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//*[@href=\"/crmsfa/control/leadsMain\"]")).click();
		driver.findElement(By.xpath("//*[@href=\"/crmsfa/control/createLeadForm\"]")).click();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Mohan Kumar");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Doraiswamy");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testLeaf");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Title");

		//Handling DropDown

		WebElement Source=driver.findElement(By.id("createLeadForm_dataSourceId"));

		Select option1=new Select(Source);

		option1.selectByIndex(5);

		WebElement Marketing_Campaign=driver.findElement(By.id("createLeadForm_marketingCampaignId"));

		Select option2=new Select(Marketing_Campaign);
		option2.selectByVisibleText("Automobile");

		WebElement Preferred_Currency=driver.findElement(By.id("createLeadForm_currencyUomId"));

		Select option3=new Select(Preferred_Currency);
		option3.selectByValue("KPW");

		Thread.sleep(3000);



		driver.findElement(By.className("smallSubmit")).click();
		String title=driver.getTitle();
		System.out.println(title);
		Thread.sleep(3000);

		if (title.contains("View Lead")) {
			System.out.println("Title is displayed correctly.");

		} else {
			System.out.println("Title not displayed correctly.");

		}

		driver.close();	

	}

}
