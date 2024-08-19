

package week1.day3;

import java.util.Arrays;

public class PrintDuplicates_Excersice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//method1 : Using sing,e for loop
		int[] num= {2,5,7,7,5,9,2,3};

		Arrays.sort(num);

		for(int i=0;i<num.length-1;i++)
		{
			if(num[i]==num[i+1])
			{
				System.out.println("Duplicate values:"+num[i+1]);
			}
		}
		//method2: Using nested for loop
 
		for (int i = 0; i < num.length; i++) {
			for (int j = i+1; j < num.length; j++) {

				if(num[i]==num[j])
				{
					System.out.println("Duplicate values of:"+num[j]);
				}
			}

		}

	}

}
