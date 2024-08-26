package week2.day4;

public class WebElement_HA {

	//Base Class1

	public void click()
	{
		System.out.println("Clicked");
	}

	public void setText(String text)
	{
		System.out.println("setText");
	}

	public static void main(String[] args) {
		WebElement_HA we=new WebElement_HA();
		we.click();
		we.setText("Webelement");

	}


}
