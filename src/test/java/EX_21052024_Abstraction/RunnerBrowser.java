package EX_21052024_Abstraction;

public class RunnerBrowser {

	public static void main(String[] args) {
TC1_Chrome chrome = new TC1_Chrome();
TC2_FireFox FF = new TC2_FireFox(); 
chrome.openBrowser();
chrome.closeBrowser();
FF.openBrowser();
FF.closeBrowser();

	}

}
