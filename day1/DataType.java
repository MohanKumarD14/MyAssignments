package week1.day1;

public class DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//dataType variableName- value
		//variable name which given inside the main method that is called local variable
		
		//variable -camel case
		
		int noOfTabOpen =3;
		String searchBox="Selenium";
		boolean tabsClose=true;
		char browserLog='c';
		float version=121.34f;
		long ph=123242435l;
		long ph1=123242435L;

		
           System.out.println(noOfTabOpen);
           System.out.println("Number of tabs open:" +noOfTabOpen);//This is for meaning full output
           System.out.println("Print search value:" +searchBox);
           System.out.println("Check the current tab is closed:" +tabsClose 
        		   +"\n" + "Show the browser log:"+browserLog
        		   +"\n" + "Show the browser log:"+browserLog);
	}

}
