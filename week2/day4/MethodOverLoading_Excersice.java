package week2.day4;

public class MethodOverLoading_Excersice {


	public void reportStep(String msg,String status) {
		System.out.println("ReportsStep1");
	}

	public void reportStep(String msg,String status,boolean snap) {
		System.out.println("ReportsStep2");
	}
	public static void main(String[] args) {
		MethodOverLoading_Excersice ml=new MethodOverLoading_Excersice();
		ml.reportStep("Message","TRUE");
		ml.reportStep("QWER", "TRUE", false);

	}

}
