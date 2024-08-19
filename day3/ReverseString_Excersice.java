package week1.day3;

public class ReverseString_Excersice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String value="mohan";

		//String[] s1=value.split(" ");
		//String s1=value.trim();

		char[] c=value.toCharArray();


		for(int i=c.length-1;i>=0;i--)	

		{

			System.out.print(c[i]);
		}
		System.out.println(c.length);

		//System.out.println(c[0]);
		/*
		 * for(int i=c.length-1;i>=0;i--)
		 * 
		 * {
		 * 
		 * System.out.print(c[i]); }
		 */

		//Asending 
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}

		//Reverse order OR Desending
		for (int i = c.length-1; i>=0; i--) {
			System.out.print("Reverse:"+c[i]);
			
		}
		


	}


}
