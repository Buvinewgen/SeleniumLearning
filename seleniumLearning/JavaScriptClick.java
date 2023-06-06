package seleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		WebElement username=driver.findElement(By.xpath("//input[@type='email']")); //tagname[@attribute='attribute value']
		username.sendKeys("hari.radhakrishnan@qeagle.com");
	WebElement pass=driver.findElement(By.id("password"));
	pass.sendKeys("Leaf@1234");
	driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.id("Login")).click();

	}

}  //Learn java script click
