package week1.day3;

public class OtherString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String value="Testleaf mutiple courses";

		//Testleafmutiplecourses
		//		String s1=value.trim();
		//		System.out.println(s1);

		String[] s1=value.split(" ");

		for (int i = 0; i < s1.length; i++) {

			
			System.out.println("VALUE:"+s1[i]);

		}
		int c=s1.length;
		System.out.println(c);


		//Replace
		String data="selenium";
		String a=data.replace('l','L');
		System.out.print(a);

		//ReplaceAll
		String var="Mohan Kumar D";

		String all=var.replaceAll("[A-Z]", var);
		System.out.println(all);
		
		//toLowercase
		String lowercase=var.toLowerCase();
		System.out.println(lowercase);
		
		//touppercase
		String uppercase=var.toUpperCase();
		System.out.println(uppercase);
         
		//Substring
		
		String substring=var.substring(6);
		System.out.println(substring);
            
		String substring1=var.substring(5, 9);
		System.out.println(substring1);

		//Convert string to INT --> Mainly used in automation
		
		String value1="6000";
		int value2=Integer.parseInt(value1);
		System.out.println(value2);
		if(value2>0) {
	        System.out.println("efw");
		}
		
	}

}
