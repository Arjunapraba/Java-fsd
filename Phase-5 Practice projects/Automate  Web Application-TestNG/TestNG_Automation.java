package com.testing;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_Automation {
  
  //Register and Login test
  @Test(priority = 1)
  public void signin_test() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://www.amazon.in/");
	  driver.manage().window().maximize();
	  //URL
	  Assert.assertEquals(driver.getCurrentUrl(), "https://www.amazon.in/");
	  Thread.sleep(2000);
	  
	  System.out.println("Title of Page "+driver.getTitle());//Title of WebPage
	  Assert.assertEquals(driver.getTitle(), "Online Shopping site in India:"
	  		+ " Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in");
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//*[@id='nav-signin-tooltip']/a")).click();
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//*[@id=\'ap_email\']")).sendKeys("arjun@yahoomail.com");
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//*[@id=\'continue\']")).click();
	  
	  String msg = driver.findElement
			  (By.xpath("//*[@id=\'auth-error-message-box\']/div/div/ul/li/span")).getText();
	  System.out.println("Message: "+msg);
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//*[@id=\'createAccountSubmit\']")).click();
	  Thread.sleep(2000);
	  
      driver.findElement(By.xpath("//*[@id=\'ap_customer_name\']")).sendKeys("Arjun Kumar");
      Thread.sleep(2000);
	  
      driver.findElement(By.xpath("//*[@id=\'ap_phone_number\']")).sendKeys("9820736971");
      Thread.sleep(2000);
      
      driver.findElement(By.xpath("//*[@id=\'ap_email\']")).sendKeys("arjun@gmail.com");
      Thread.sleep(2000);
      
      driver.findElement(By.xpath("//*[@id=\'ap_password\']")).sendKeys("xyz123");
      Thread.sleep(2000); 
      
      driver.findElement(By.xpath("//*[@id=\'auth-continue\']")).click();
      Thread.sleep(2000); 
      
      String err =driver.findElement
    		  (By.xpath("//*[@id=\'auth-error-message-box\']/div/div/ul/li/span")).getText();
      
      System.out.println("Message: "+err);
      
      driver.close();
  }
  
  @Test(priority=2)
  public void addtocart_test() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.amazon.in/");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles");
	    Thread.sleep(3000);
	    driver.findElement(By.id("nav-search-submit-button")).click();	    
	    driver.findElement(By.partialLinkText("Samsung Galaxy S20 FE 5G")).click();
	    Thread.sleep(3000);
	    
	    String MainWindow=driver.getWindowHandle();		
        System.out.println("Current Window :"+ MainWindow);
        
        Set<String> s1=driver.getWindowHandles(); 
        Iterator<String> i1=s1.iterator();
		while(i1.hasNext())			
        {		
            String ChildWindow=i1.next();	
            System.out.println("Child Window: "+ ChildWindow);
            Thread.sleep(2000); 
            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
            {    		
            	   driver.switchTo().window(ChildWindow);
            	  
            boolean e1 =driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).isEnabled();
            driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
         	       
            }
        }
		Thread.sleep(5000);
		driver.close();
  }
}
                  
      	

