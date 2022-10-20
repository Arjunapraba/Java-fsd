package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Aaadhar_app {
  @Test
  public void app_test() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  long start = System.currentTimeMillis();
	  driver.get("http://localhost:4200/");
	  long finish = System.currentTimeMillis();
	  Assert.assertEquals(driver.getCurrentUrl(),"http://localhost:4200/");
	  long totalTime = finish - start;
	  System.out.println("Total Time for page load :"+totalTime);
	  driver.manage().window().maximize();
	  
	  driver.findElement(By.xpath("/html/body/app-root/app-home/div[2]/button[1]")).isEnabled();
	  driver.findElement(By.xpath("/html/body/app-root/app-home/div[2]/button[2]")).isEnabled();
	  driver.findElement(By.xpath("/html/body/app-root/app-home/div[2]/button[3]")).isEnabled();
	  Thread.sleep(2000);
	  Assert.assertEquals(driver.getTitle(), "AadharApp");

	 System.out.println("The page Title is: "+driver.getTitle());
	 Thread.sleep(2000);	  
	 driver.findElement(By.xpath("/html/body/app-root/app-home/div[2]/button[1]")).click();
	 Thread.sleep(4000);
	 driver.findElement(By.xpath("/html/body/app-root/app-userlogin/div/form/div[1]/input")).sendKeys("9790977484");
	 driver.findElement(By.xpath("/html/body/app-root/app-userlogin/div/form/div[2]/input")).sendKeys("xyz123");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("/html/body/app-root/app-userlogin/div/form/button")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("/html/body/app-root/app-userpage/div[3]/button[1]")).click();
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("/html/body/app-root/app-apply/div/form/div[1]/input")).sendKeys("Arjunkumar");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("/html/body/app-root/app-apply/div/form/div[2]/input")).sendKeys("10/12/2000");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("/html/body/app-root/app-apply/div/form/div[3]/input")).sendKeys("Chrompet,Chennai");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("/html/body/app-root/app-apply/div/form/div[4]/input")).sendKeys("arjun129@gmail.com");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("/html/body/app-root/app-apply/div/form/div[5]/input")).sendKeys("9445366879");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("/html/body/app-root/app-apply/div/form/div[6]/input")).sendKeys("male");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("/html/body/app-root/app-apply/div/form/button")).click();
	 Thread.sleep(5000);
	 driver.close();
  }
  @BeforeMethod
  public void beforemethod() {
  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");	
  }
  
}
