package week2.day4;

public class Chrome extends Browser {

	public void openIncognito()
	{
		System.out.println("Chrome:openIncognito()");
	}
	public void clearCache()
	{
		System.out.println("Chrome: openIncognito()");
	}
	public static void main(String[] args) {

		Chrome ch=new Chrome();
		ch.openIncognito();
		ch.clearCache();
		ch.openURL();
		ch.closeBrowser();
		ch.navigateBack();
		System.out.println(ch.browserName);
		System.out.println(ch.browserVersion);
	}

}
