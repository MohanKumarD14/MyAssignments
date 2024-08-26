package week2.day4;

public class TestData1_HA {
 
	//Single Inheritance

	public void enterCredentials()
	{
		System.out.println("enterCredentials");
	}
	public void navigateToHomePage()
	{
		System.out.println("navigateToHomePage");
	}
	public static void main(String[] args) {

		TestData1_HA TD=new TestData1_HA();
		TD.enterCredentials();
		TD.navigateToHomePage();

	}


}
