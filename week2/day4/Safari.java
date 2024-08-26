package week2.day4;

public class Safari extends Browser {

	public void readerMode()
	{
		System.out.println("Safari:readerMode");
	}
	public void fullScreenMode()
	{
		System.out.println("Safari:fullScreenMode");
	}
	public static void main(String[] args) {
		
		Safari sf=new Safari();
		sf.readerMode();
		sf.fullScreenMode();
		sf.openURL();
		sf.closeBrowser();
		sf.navigateBack();
		
	}
}
