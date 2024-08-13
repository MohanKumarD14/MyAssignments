package week1.day2;

public class FibonacciSeries {

	//1,2,3,5,8,13,..
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  

		int n1=0,n2=1,sum=0;
		System.out.print(n1+" "+n2);

		for(int i=2;i<=7;i++)
		{
			sum=n1+n2;
			System.out.print(" "+sum);
			n1=n2;
			n2=sum;
		}



	}

}
