package marathon1;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Amazon_BagsForBoys {
	public static void main(String[] args) throws InterruptedException {
		//01) Launch Chrome  
		ChromeDriver driver=new ChromeDriver();  	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		//02)Load amazon site
		driver.get("https://www.amazon.in/");	
		//03) Type "Bags for boys" in the Search box
		WebElement searchfield = driver.findElement(By.id("twotabsearchtextbox"));
		searchfield.sendKeys("Bags for boys");
		//Thread.sleep(2000);
		System.out.println("Typed Bags for boys in the Search box");
		//04) Choose the item in the result (bags for boys)
		searchfield.sendKeys(Keys.DOWN.ENTER);
		Thread.sleep(2000);
		System.out.println("Choosen the item in the result (bags for boys)");
		//05) Print the total number of results (like 50000)
		String result = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']/span[1]")).getText();
		System.out.println("Print the total number of results:"+result+" bags for boys");
		//06) Select the first 2 brands in the left menu
		driver.findElement(By.xpath("//span[@class='a-list-item']//span[text()='Skybags']")).click();
		System.out.println("Selected the Skybags");
		driver.findElement(By.xpath("//span[text()='See more']")).click();
		driver.findElement(By.xpath("//span[@class='a-list-item']//span[text()='Frantic']")).click();
		System.out.println("Selected the Frantic");	
		//07) Choose New Arrivals (Sort)
		driver.findElement(By.xpath("//span[@class='a-button-inner']//span[@id='a-autoid-0-announce']")).click();
		driver.findElement(By.xpath("//div[@class='a-popover-inner']//a[text()='Newest Arrivals']")).click();
		System.out.println("Choosen New Arrivals in Sort section");
		//08) Print the first resulting bag info (name, discounted price)
		String firstbaginfo = driver.findElement(By.xpath("//span[contains(text(),'Teal')]")).getText();
        System.out.println("first resulting bag name info:"+firstbaginfo);
        String discounted_price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
        System.out.println("first resulting bag discounted price info:"+discounted_price);     
        //09) Get the page title and close the browser(driver.close())
        String title=driver.getTitle();
        System.out.println("Amazon Current title:"+title);
		driver.close();
	}

}
