package week2.day4;

public class RadioButton_HA extends Button_HA {

	//subclass4 -->RadioButton_HA
	//Parent class1/base class1--> Button_HA

	public void selectRadioButton() {

		System.out.println("selectRadioButton");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RadioButton_HA RB= new RadioButton_HA();
		RB.selectRadioButton();
		RB.submit();
	}

}
