package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/select.xhtml");
		driver.manage().window().maximize();

		WebElement q=driver.findElement(By.className("ui-selectonemenu"));
		
		//Web element -Reuse the data again
		//returntype findelement()=Webelement
		

		//With select tag
		Select options=new Select(q);

		//options.selectByIndex(1);
		options.selectByVisibleText("Selenium");

		//Non Select drop down

		WebElement q1=driver.findElement(By.id("j_idt87:country_label"));
		q1.click();

		driver.findElement(By.id("j_idt87:country_3")).click();



	}

}
