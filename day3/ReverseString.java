package week1.day3;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Output should be in reverse order

		String value="Amazon";

		char[] c1=value.toCharArray();

		for (int i =c1.length-1;i>=0; i--) {
			System.out.print(c1[i]);

		}
	}

}
