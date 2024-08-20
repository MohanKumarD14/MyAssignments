package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount_Excersice {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/.");
		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();

		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Mohan Kumar1");
		driver.findElement(By.xpath("//*[@name='description' and @class='inputBox']")).sendKeys("Selenium Automation Tester.");
		driver.findElement(By.id("numberEmployees")).sendKeys("1");
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");

		WebElement option1=driver.findElement(By.xpath("//select[@name=\"industryEnumId\"]"));
		Select Industry=new Select(option1);
		Industry.selectByVisibleText("Computer Software");




		WebElement option2=driver.findElement(By.xpath("//select[@name=\'ownershipEnumId\']"));

		Select ownership=new Select(option2);
		ownership.selectByVisibleText("S-Corporation");


		WebElement option3=driver.findElement(By.xpath("//select[@id=\"dataSourceId\"]"));
		Select source=new Select(option3);
		source.selectByValue("LEAD_EMPLOYEE");

		WebElement option4=driver.findElement(By.xpath("//select[@id=\"marketingCampaignId\"]"));
		Select marketing_camp=new Select(option4);
		marketing_camp.selectByIndex(6);



		WebElement option5=driver.findElement(By.xpath("//select[@id='generalStateProvinceGeoId']"));
		Select state=new Select(option5);
		state.selectByValue("TX");



		driver.findElement(By.className("smallSubmit")).click();



		String title=driver.getTitle();
		System.out.println(title);
		Thread.sleep(3000);

		if (title.contains("Account Details")) {
			System.out.println("Title is displayed correctly.");

		} else {
			System.out.println("Title not displayed correctly.");

		}

		driver.close();		



	}

}
