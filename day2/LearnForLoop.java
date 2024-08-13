package week1.day2;

import java.util.Iterator;

public class LearnForLoop {

	public static void main(String[] args) {
		
		int num=7;
		
		//for-->CTRL+SPACE --> select 2nd option
		
		//i++ post Increment
		for (int i = 0; i <num; i++) {
			System.out.println(i);
			
		}
		//6,5,4,3,2,1,0	--> Reverse order
		//i-- post decrement

		for (int i = num; i>0; i--) {
			System.out.println("reverse number:"+i);

		}

	}

}
