package firstTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAutomate {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe" );
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:\\Users\\Arjun\\Desktop\\Automate a Web Application\\registerpage.html");
		driver.findElement(By.name("eid")).sendKeys("48461");
		Thread.sleep(2000);
		driver.findElement(By.name("ename")).sendKeys("Arjun Kumar");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("xyz123");
		Thread.sleep(2000);
		driver.findElement(By.id("male")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("number")).sendKeys("9790977282");
		Thread.sleep(2000);
		driver.findElement(By.name("address")).sendKeys("10,Chrompet,Chennai");
		Thread.sleep(2000);
		driver.get("C:\\Users\\Arjun\\Desktop\\Automate a Web Application\\loginpage.html");
		driver.findElement(By.name("eid")).sendKeys("48461");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys("xyz123");
		Thread.sleep(5000);
		driver.close();
	}
	}


