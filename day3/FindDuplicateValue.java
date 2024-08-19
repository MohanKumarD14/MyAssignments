package week1.day3;

import java.util.Arrays;
import java.util.Iterator;

public class FindDuplicateValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] data= {35,32,77,86,21,35,89,1,77,32};
		
		//method1: Using nested for loop
		//method2: Using single for loop
		
		//have 2 for loop
		//compare values in if condition
		
		for(int i=0;i<data.length;i++)
		{
			for(int j=i+1;j<data.length;j++)
			{
				if(data[i]==data[j])
				{
					System.out.println("Duplicate value:"+data[j]);
				}
			}
		}

		//method 2:
		
		//int[] data= {35,32,77,86,21,35,89,1,77,32};
		//sort the value
		
		//1,21,32,35,35,77,77,86,89
		//compare the next value
        Arrays.sort(data);
        
        for (int i = 0; i < data.length-1; i++) {
        	if(data[i]==data[i+1])
        	{
        		System.out.println("Duplicate:"+data[i+1]);
        	}
			
		}

	}
 
	
         	
}
