package week1.day3;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] i= {34,35,67,32,56};

		//find length of array

		int length=i.length;
		System.out.println(length);

		//Find the last index value in array

		System.out.println("last value"+i[length-1]);

		//Find the first index value in array
		System.out.println("first value:"+i[0]);

		//Find larger number in array

		Arrays.sort(i); //--> Static way
		

		System.out.println(i[length-1]);

		//Find small number

		System.out.println(i[0]);
		
		//Dynamic way

		for (int j = 0; j < i.length; j++) {

			System.out.print(i[j]);
		}
		for (int j=i.length-1; j>=0;j--) {
			System.out.println(i[j]);

		}

	}

}
