package week2.day4;

public class LoginPage_HA extends BasePage_HA{
	
    //BasePage_HA --> Is the sub class1
	//Override method from the parent class
	public void performCommonTasks() {
		System.out.println("performCommonTasks");
	}

	public static void main(String[] args) {

		LoginPage_HA LP=new LoginPage_HA();
		LP.clickElement();
		LP.findElement();
		LP.enterText();
		LP.performCommonTasks();

	}

}
