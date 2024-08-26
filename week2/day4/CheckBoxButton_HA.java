package week2.day4;

public class CheckBoxButton_HA extends Button_HA {


	//subclass3 -->CheckBoxButton_HA
	//Parent class/base class--> Button_HA

	public void clickCheckButton() {
		System.out.println("clickedCheckButton");
	}

	public static void main(String[] args) {

		CheckBoxButton_HA CB=new CheckBoxButton_HA();
		CB.clickCheckButton();
		CB.submit();
	}

}
