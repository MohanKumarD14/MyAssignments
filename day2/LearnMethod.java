package week1.day2;

public class LearnMethod {

	public void browser() {
		// TODO Auto-generated method stub
		System.out.println("browsername");


	}
	private void browserVersion(int a) {
		// TODO Auto-generated method stub
		System.out.println(a);
	}

	//Default access modifier
	//Return Type menthodname()
	int numberofBrowser()
	{
		return 100;
	}

	protected String browserURL(String URL,String applicationName)
	{
		return "Url:" +URL+ "   " +
				"\n" +"Application name:"+ applicationName;
	}

	public static void main(String[] args) {

		LearnMethod LM=new LearnMethod();
		LM.browser();
		LM.browserVersion(5);

		LM.numberofBrowser();
		LM.browserURL("www.google.com", "google");

		//WAY1-->
		System.out.println(LM.numberofBrowser());
		System.out.println(LM.browserURL("www.google.com", "google"));

		//WAY2-->

		String browserURL=LM.browserURL("ed","asd");
		System.out.println(browserURL);

	}
}
