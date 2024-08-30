package marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PVRCinimas_BookTicket {

	public static void main(String[] args) throws InterruptedException {

		//ChromeOptions cp=new ChromeOptions();
		//cp.addArguments("--disable-notifications");
		//1) Launch the Browser
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();

		//2) Load the Url
		driver.get("https://www.pvrcinemas.com/");

		//3) Choose Your location as "Chennai"
		driver.findElement(By.xpath("(//span[@class='cities-placed'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//h6[text()='Chennai']")).click();
		System.out.println("Chennai Clicked");

		//4) Click on Cinima under Quick Book
		driver.findElement(By.xpath("//span[text()='Cinema']")).click();
		System.out.println("Cinima option Clicked");

		//5) Select Your Cinima
		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'INOX The Marina Mall')]")).click();
		System.out.println("Marina Mall Cinima option clicked");

		//6) Select Your Date as Tomorrow
		driver.findElement(By.xpath("//span[contains(text(),'Sun')]")).click();
		System.out.println("Selected sunday 1st sep");

		//7) Select Your Movie
		driver.findElement(By.xpath("//li[@class='p-dropdown-item']/span[text()='ALIEN: ROMULUS']")).click();
		System.out.println("Alien Romulus movie selected");

		//8) Select Your Show Time
		driver.findElement(By.xpath("//li[@class='p-dropdown-item']//span[text()='10:00 PM']")).click();
		System.out.println("10PM time selected");

		//9) Click on Book Button
		driver.findElement(By.xpath("//span[text()='Book']")).click();
		System.out.println("Clicked teh Book Button");

		//10) Click Accept on Term and Condition
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		System.out.println("Accepted the terms and conditions for A ratings");

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		System.out.println("Accepted the terms and conditions for Ticekt bookings");

		//11) Click any one available seat
		driver.findElement(By.xpath("//span[@id='CL.CLUB|I:4']")).click();
		System.out.println("Clicked the Available sheet");

		//12) Click Proceed Button
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		System.out.println("Clicked Proceed Button");

		//13) Print the Seat info under book summary
		String Seat_number = driver.findElement(By.xpath("//div[@class='seat-number']/p")).getText();
		System.out.println("Seat info:"+Seat_number);

		//14) Print the grand total under book summary
		//String grand_total = driver.findElement(By.xpath("//div[@class='grand-prices']/h6[1]")).getText();
		String grand_total = driver.findElement(By.xpath("(//span[text()='151.84'])[2]")).getText();
		System.out.println("grand total under book summary:"+grand_total);

		//15) Click Proceed Button
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		System.out.println("Clicked the Proceed button");

		//16) Close the popup
		driver.findElement(By.xpath("(//i[@class='pi pi-times'])[2]")).click();
		System.out.println("Closed the popup");

		//17) Print Your Current Page title
		String Page_title = driver.getTitle();
		System.out.println("Page title:"+Page_title);

		//18) Close Browser
		driver.close();
	}

}
