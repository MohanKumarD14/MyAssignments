package week2.day4;

public class LoginTestData_HA extends TestData1_HA {

	//Single Inheritance

	public void enterUsername()
	{
		System.out.println("enterUsername()");	
	}
	public void enterPassword()
	{
		System.out.println("enterPassword()");	

	}

	public static void main(String[] args) {
		LoginTestData_HA LT=new LoginTestData_HA();
		LT.enterUsername();
		LT.enterPassword();
		LT.enterCredentials();
		LT.navigateToHomePage();

	}

}
