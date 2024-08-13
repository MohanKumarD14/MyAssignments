package week1.day2;

import javax.swing.plaf.synth.SynthOptionPaneUI;

//Natural Number>1 (Number is greater than 1)
//Which has only 2 factors divide 1 and itself

//19 ==> 1 and 19==>Prime number
//28 ==> 1,2,4,5,7,14,28...

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=7;
		int count = 0; //Number of factors

		if(num>1) {
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
				
					count++;
					//System.out.println(count++);
			}
				if(count==2)
				{
					System.out.println("Prime number");
				}
				else
				{
					System.out.println("Not prime");
				}
			
		}
		else
		{
			System.out.println("Not prime");
		}

	}
}
