package week2.day4;

public class SubClass_Excersice extends SuperClass1_Excersice {
	
	public void takeSnap()
	{
		System.out.println("SubClass: takeSnap");

	}
	
	public static void main(String[] args) {
		SubClass_Excersice sc=new SubClass_Excersice();
		sc.takeSnap();
	}

}
