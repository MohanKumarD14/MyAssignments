package week2.day4;

public class MethodOverloading_Learn {

	public void starApp(String URL) {
		System.out.println("URL:"+URL);
	}
	public void starApp(String Browser,String URL) {
		System.out.println("Browser Name:"+Browser +"\n"+"URL:"+URL);

	}

	public void starApp(int noOfBrowser) {
		System.out.println("NoOfBrowser:"+noOfBrowser);


	}
	public static void main(String[] args) {
		MethodOverloading_Learn ml=new MethodOverloading_Learn();
		ml.starApp("www.ggogle.com");
		ml.starApp("Chrome","platform.testleaf.com");
		ml.starApp(5);
		
		//Java--> print and println is the example for Overloading
		//Selenium Ex: 
		//frame(int)
		//frame(String id or name)
		//frame(Webelement)



	}


}
