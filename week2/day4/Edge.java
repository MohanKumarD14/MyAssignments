package week2.day4;

public class Edge extends Browser {

	public void takeSnap()
	{
		System.out.println("Edge: takeSnap");
	}
	public void clearCookies()
	{
		System.out.println("Edge: clearCookies");

	}
	public static void main(String[] args) {
		Edge ed=new Edge();
		ed.takeSnap();
		ed.clearCookies();
		ed.openURL();
		ed.closeBrowser();
		ed.navigateBack();
	}

}
