package marathon3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EditOpportunity extends ProjectSpecificMethod{

	@BeforeTest
	public void setvalues()
	{
		data="EditOpportunity";
	}
	
	@Test(dataProvider = "getData")
	public void EditOpportunity1(String searchname,String description) throws InterruptedException
	{	
		WebElement searchinput = driver.findElement(By.xpath("//input[@name='Opportunity-search-input']"));
		searchinput.sendKeys(searchname);
		Thread.sleep(5000);
		Actions ac=new Actions(driver);
		ac.sendKeys(Keys.ENTER).perform();
		ac.sendKeys(Keys.ENTER).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[@class='slds-icon_container slds-icon-utility-down']/span)[1]")).click();
		Thread.sleep(5000);
		//ac.keyDown(Keys.DOWN.ENTER).perform();
		Thread.sleep(5000);
		WebElement element = driver.findElement(By.xpath("//div[text()='Edit']"));
		driver.executeScript("arguments[0].click();", element);
		//ac.moveToElement(element).perform();
		//ac.click(element).perform();

		driver.findElement(By.xpath("//input[@name='CloseDate']")).click();
		driver.findElement(By.xpath("//td[@data-value='2024-09-15']")).click();
		Thread.sleep(5000);
		WebElement element1 = driver.findElement(By.xpath("(//button[@role='combobox'])[3]"));	
		driver.executeScript("arguments[0].click();", element1);

		driver.findElement(By.xpath("//span[@class='slds-media__body']//span[text()='Perception Analysis']")).click();
		Thread.sleep(5000);		
		
		WebElement element2 = driver.findElement(By.xpath("(//button[@role='combobox'])[5]"));
		driver.executeScript("arguments[0].click();", element2);
  
		driver.findElement(By.xpath("//span[@class='slds-media__body']//span[text()='In progress']")).click();
		Thread.sleep(5000);		

		driver.findElement(By.xpath("//textarea[@class='slds-textarea']")).sendKeys(description);
		
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		Thread.sleep(5000);

		String stagevalue = driver.findElement(By.xpath("(//span[text()='Perception Analysis'])[1]")).getText();
		System.out.println("stagevalue:"+stagevalue);
		
		if(stagevalue.equals("Perception Analysis"))
		{
			System.out.println("Edited successfully");
		}else
		{
			System.out.println("Edited not successfully");
		}

		Thread.sleep(5000);


	}

}
