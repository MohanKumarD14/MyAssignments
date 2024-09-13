package marathon2;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.sukgu.Shadow;

public class ServiceNow_Excersice {
	public static void main(String[] args) throws InterruptedException, IOException {
     	ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		//1. Launch ServiceNow application
		driver.get("https://dev186929.service-now.com/");
		//2. Login with valid credentials username as admin and password 
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("2AqjN!lC2!Vy");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//3. Click----->All in the SERVICE NOW Page  &  click the  Service catalog in filter navigator.
		//Handle shadow Dom
		Shadow sh=new Shadow(driver);
		sh.setImplicitWait(5);
		sh.findElementByXPath("//div[text()='All']").click();
		System.out.println("All option clicked");
		//Service categlog
		sh.findElementByXPath("//span[text()='Service Catalog']").click();
		System.out.println("Navigated to Service catalog in filter");
     	//4. Click on  mobiles 	
		WebElement elementByXPath = sh.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(elementByXPath);
		driver.findElement(By.xpath("//h2[contains(text(),'Mobiles')]")).click();
		System.out.println("Clicked mobiles");

		//5. Select Apple iphone13pro
		driver.findElement(By.xpath("//h2//strong[text()='Apple iPhone 13 pro']")).click();
		System.out.println("Clicked Apple iphone13pro");
		//6. Choose yes option in lost or broken iPhone
		driver.findElement(By.xpath("//label[@class='radio-label' and contains(text(),'Yes')]")).click();
		System.out.println("Yes option seleted in lost or broken iPhone ");
		//6A) Original Number
		driver.findElement(By.xpath("//input[@id='IO:4afecf4e9747011021983d1e6253af34']")).sendKeys("1234564778");
		System.out.println("Original Number given");
		//7. Select Unlimited from the dropdown in Monthly data allowance
		WebElement ele=driver.findElement(By.xpath("//select[@id='IO:ff1f478e9747011021983d1e6253af68']"));
		Select obj=new Select(ele);
		Thread.sleep(1000);
		obj.selectByValue("unlimited");
        System.out.println("Select Unlimited from the dropdown in Monthly data allowance");
		//8. Update color field to SierraBlue and storage field to 512GB
		driver.findElement(By.xpath("//label[@class='radio-label' and contains(text(),'Sierra Blue')]")).click();
        System.out.println("Updated color field to SierraBlue");
		driver.findElement(By.xpath("//label[contains(text(),'512 GB')]")).click();
        System.out.println("Updated storage field to 512GB");
		//9. Click on Order now option
        driver.findElement(By.xpath("//button[contains(text(),'Order Now')]")).click();
        System.out.println("Clicked on Order now option");
		//10. Verify order is placed and copy the request number
        String orderstatus = driver.findElement(By.xpath("//div[@class='notification notification-success']//span[@aria-live='assertive']")).getText();
        System.out.println("Order Status:"+orderstatus);
        String Request_Number= driver.findElement(By.xpath("//a[@id='requesturl']")).getText();
        System.out.println("Request_Number"+Request_Number);
		//11.Take a Snapshot of order placed page
    	File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
		//Step2 Set path where to Store the screen shot
		File des=new File("./snaps/img.png");
		//Step 3: Combine step1, step 2
		FileUtils.copyFile(screenshotAs, des);
		System.out.println("ScreenShot Taken");
		//12 Close the browser
		driver.close();
	}

}
