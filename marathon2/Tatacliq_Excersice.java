package marathon2;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class Tatacliq_Excersice {
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub	
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();	
		//1. Load the url as https://www.tatacliq.com/
		driver.get("https://www.tatacliq.com/");  
		driver.navigate().refresh();
		Thread.sleep(3000);
		// 2. MouseHover on 'Brands'
		WebElement brands = driver.findElement(By.xpath("//div[text()='Brands']"));
		Actions ac=new Actions(driver);
		ac.moveToElement(brands).perform();  
		//3. MouseHover on 'Watches & Accessories'
		WebElement Watch_Access = driver.findElement(By.xpath("//div[@class='DesktopHeader__brandDetailsHolder']//div[text()='Watches & Accessories']"));
		ac.moveToElement(Watch_Access).perform();
		//4. Choose the first option from the 'Featured brands'.
		WebElement Featured_brands = driver.findElement(By.xpath("//div[@class='DesktopHeader__featureBrands']//div[text()='Casio']"));
		ac.moveToElement(Featured_brands).click().perform();
		System.out.println("Clicked the casio");
		Thread.sleep(4000);
		//5. Select sortby: New Arrivals
		WebElement sortby = driver.findElement(By.className("SelectBoxDesktop__hideSelect"));
		Select se=new Select(sortby);
		se.selectByVisibleText("New Arrivals");
		System.out.println("Clicked the New Arrivals");
		Thread.sleep(4000);
		//6. choose men from catagories filter.
		driver.findElement(By.xpath("//div[@class='FilterDesktop__newFilCheckboxBlock']/div[text()='Men']")).click();
		System.out.println("Clicked the men from catagories filter.");
		//7. print all price of watches
		Thread.sleep(4000);
		List<WebElement> elements = driver.findElements(By.xpath("//div[@class='ProductDescription__priceHolder']/h3"));
		int size = elements.size();
		System.out.println(size);  
		//For loop
		String price=null;
		for (int i = 0; i <size; i++) {
			price=elements.get(i).getText();
			System.out.println(price);
		}
		//For Each
		/*
		 * for (WebElement S : elements) 
		 * { 
		 * String pric=S.getText();
		 * System.out.println(pric); 
		 * }
		 */
		// 8. Click on the first resulting watch
		driver.findElement(By.xpath("//div[@class='ProductModule__dummyDiv']")).click();
		System.out.println("Clicked on the first resulting watch");
		//9. click Add to Bag  and get count from the Bag cart icon.
		//Handle Child
		Set<String> windowHandles = driver.getWindowHandles();
		//System.out.println("Windowhandles"+windowHandles);
		List<String> Li=new ArrayList<String>(windowHandles);
		driver.switchTo().window(Li.get(1));
		Thread.sleep(2000);
		String childtitle = driver.getTitle();
		System.out.println("Child title:"+childtitle);
		//List<String> li=new ArrayList<String>(windowHandles);
		driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
		System.out.println("Clicked Add to Bag button");
		String cartcount = driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']")).getText();
		System.out.println("count from the Bag cart icon is:"+cartcount);
		//11. Click on the Bag cart icon
		driver.findElement(By.xpath("//div[@class='DesktopHeader__myBagShow']")).click();
		//10a. compare two price are similar (Product list price and Cart price)
		String cartprice = driver.findElement(By.xpath("//div[@class='CartItemForDesktop__informationTextWithBolder']")).getText();
		System.out.println("BagPrice:"+cartprice);

		if(cartprice.equals(price))
		{
			System.out.println("Product list Price eqals to cart");
		}
		else
		{
			System.out.println("Product list Price not eqals to cart");

		}
		// 10b) compare two price are similar (Bag price and Bag total price)
		WebElement Bag_total = driver.findElement(By.xpath("//div[@class='DesktopCheckout__info DesktopCheckout__label']"));
		String Bag_total1=Bag_total.getText();
		System.out.println("Bag_total1 price:"+Bag_total1);
		if(cartprice.equals(Bag_total1))
		{
			System.out.println("Bag price and Bag total price are same");
		}
		else
		{
			System.out.println("Bag price and Bag total price are not same");

		}

		// 12. Take a snap of the resulting page. 
		//Step1 Take snap
		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);

		//Step2 Set path where to Store the screen shot

		File des=new File("./snaps/img.png");

		//Step 3: Combine step1, step 2

		FileUtils.copyFile(screenshotAs, des);

		//	13. Close All the opened windows one by one.
		//Close the child
		driver.close();
		System.out.println("Closed child window");
		//Switch to parent
		driver.switchTo().window(Li.get(0));
		System.out.println("Closed parent window");
		driver.close();

	}

}
