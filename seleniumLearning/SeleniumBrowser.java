package seleniumLearning;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SeleniumBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver d1=new ChromeDriver();
		d1.get("https://pfbi.institute/");
		d1.close();
		Thread.sleep(2000);
		FirefoxDriver d2=new FirefoxDriver();
		d2.get("https://pfbi.institute/");
		d2.close();
		Thread.sleep(2000);
		EdgeDriver d3=new EdgeDriver();
		d3.get("https://pfbi.institute/");
		d3.close();
		Thread.sleep(2000);

		
		//SafariDriver d4=new SafariDriver();
		
	
	


	}

}
