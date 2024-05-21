package EX_18052024_Polymorphism;

public class RealTimeExample {
public static void main(String[] args) {
	BaseClass t1 = new test1();// Dynamic dispatch
	t1.setBrowser("edge", true);
	t1.openBrowser();
	t1.closeBrowser();
}
}

class BaseClass{
	 private String browser;
	void openBrowser() {
		System.out.println("Open Browsers"+this. browser);
	}
	void openBrowser(String browsername) {
		System.out.println("Open browser here:");
	}
	void closeBrowser() {
		System.out.println("Close browser");
	}
	
	
	public String getBrowser() {
		return browser;
	}
	public void setBrowser(String browser, boolean isAuth) {
		if(isAuth) {
			this.browser = browser;
		}
		else {
			System.out.println("Not allowed");
		}
	}
	
	
}
 class test1 extends BaseClass{
	 
	@Override
	public void setBrowser(String browser, boolean isAuth) {
		 super.setBrowser(browser, isAuth);// Parent setbrowser.
	 
	}
	 
	 
 }