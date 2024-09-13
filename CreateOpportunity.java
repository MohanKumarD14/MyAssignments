package marathon3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateOpportunity extends ProjectSpecificMethod{
	
	@BeforeTest
	public void setvalues()
	{
		data="CreateOpportunity";
	}

	@Test(dataProvider = "getData")
	public void CreateOpportunity(String name, String Amount) throws InterruptedException
	{
		driver.findElement(By.xpath("//div[text()='New']")).click();
		driver.findElement(By.xpath("//input[@class='slds-input' and @name='Name']")).sendKeys(name);
		driver.findElement(By.xpath("//input[@class='slds-input' and @name='Amount']")).sendKeys(Amount);	
		driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//td[@data-value='2024-09-13']")).click();
		Thread.sleep(5000);	
		WebElement element = driver.findElement(By.xpath("(//button[@role='combobox'])[2]"));	
		driver.executeScript("arguments[0].click();", element);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='slds-media__body']//span[text()='Needs Analysis']")).click();
		Thread.sleep(5000);		
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		Thread.sleep(5000);
		String text1 = driver.findElement(By.xpath("//lightning-formatted-text[text()='Salesforce Automation by Your Mohan']")).getText();
		System.out.println("OpportunityName:"+text1);
		//driver.executeScript("arguments[0].gettext());", element2);
		//String text = driver.findElement(By.xpath("//a[text()='Salesforce Automation by Your Mohan.']")).getText();
		//System.out.println(text);
		if(text1.contains("Mohan"))
		{
			System.out.println("Verified the name successfully");
		}
		else
		{
			System.out.println("Verified the name not successfully");
		}
	}

}
