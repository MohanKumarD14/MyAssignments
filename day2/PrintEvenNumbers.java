package week1.day2;

import java.util.Iterator;

public class PrintEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int value=25;
		//0,2,4,6,8,10,12,14,16,18,20,22,24
		//first thing
		//if condition
		//for loop
		for (int i = 0; i <=value; i++) {
			if(i%2!=1) //(i%2==0)
			{
				System.out.println("Even number:" +i);
			}

		}
		for (int i = 0; i <=value; i++) {
			if(i%2==0)
			{
				System.out.println("Evenss number:" +i);
			}

		}


	}

}
