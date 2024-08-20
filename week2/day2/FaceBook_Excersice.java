package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook_Excersice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Mohan");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Kumar");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("123142567");
		driver.findElement(By.xpath("//input[@id=\"password_step_input\"]")).sendKeys("1231124523");

		WebElement date=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select option1=new Select(date);

		option1.selectByIndex(13);

		WebElement month=driver.findElement(By.xpath("//select[@name='birthday_month']"));

		Select option2=new Select(month);
		option2.selectByVisibleText("Jun");



		WebElement year=driver.findElement(By.xpath("//select[@name=\"birthday_year\"]"));
		Select option3=new Select(year);
		option3.selectByValue("1996");


         driver.findElement(By.xpath("//input[@value='2']")).click();


	}

}
