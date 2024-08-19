package week1.day3;

public class LearnString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name= "welocme to testleaf";
		int length=name.length();
		System.out.println("totla character in stroing:"+length);


		//equals

		String value="testleaf";
		String data=new String("testleaf");
		if (value.equals(data)) {
			System.out.println("equals");

		}
		else {
			System.out.println("Not equals");
		}

		//what is the difference equals and ==?

		//== ==> will verify memory address
		if(value==data)

		{
			System.out.println("Equals");
		}
		else
		{
			System.out.println("Not equals");
		}

		//EqulasIgnoreCase
		String s1="Selenium";
		String s2="sELENIUM";
		if(s1.equalsIgnoreCase(s2))
		{
			System.out.println("Equals");
		}
		else
		{
			System.out.println("Not equals");
		}

		//Contains: Return type boolean
		boolean b=s1.contains(s2);
		System.out.println(b);

		//CharAT
		char c=s1.charAt(4);
		System.out.println(s1);

		//tocharArray
		//Convert string to char

		String var="webdriver";
		char[] ch=var.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);

		}



	}

}
