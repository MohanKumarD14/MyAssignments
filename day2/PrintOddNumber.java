package week1.day2;

public class PrintOddNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		int maxRange=10;

		for(int i=0;i<=maxRange;i++) {

			if(i%2!=0) 

			{
				System.out.println(i);
			}

		}
		for (int i = 0; i <=maxRange; i++) {
			if(i%2==1) 
			{
				System.out.println("odd number:" +i);
			}

		}

	}
}