package seleniumLearning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstragramLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/emailsignup/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.name("emailOrPhone")).sendKeys("9999999999");
		driver.findElement(By.name("fullName")).sendKeys("Buvi");
		driver.findElement(By.name("username")).sendKeys("buvi-23");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Buvi");
		//driver.close();
	}

}
