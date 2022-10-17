package com;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ecommerce_test {
  @Test
  public void ecommerce_test() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  //calculate page load time
	  long start = System.currentTimeMillis();
	  driver.get("https://www.flipkart.com/");
	  long finish = System.currentTimeMillis();
	  Assert.assertEquals(driver.getCurrentUrl(),"https://www.flipkart.com/");
	  long totalTime = finish - start; 
	  System.out.println("Total Time for page load :"+totalTime);
	  driver.manage().window().maximize();
	  
	  driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).isEnabled();
	  driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
	  Assert.assertEquals(driver.getTitle(), "Online Shopping Site for Mobiles, Electronics,"
	  		+ " Furniture, Grocery, Lifestyle, Books & More. Best Offers!");

	  System.out.println("The page Title is: "+driver.getTitle());
 
      driver.findElement(By.xpath("//*[@id='container']/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input")).sendKeys("iPhone 13");
      Thread.sleep(1000);
      driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/button")).isEnabled();
      driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/button")).click();
      Thread.sleep(2000);
      //image present or not
      WebElement i = driver.findElement(By.xpath("//img[@alt='APPLE iPhone 13 (Starlight, 128 GB)']"));
    	      Boolean p = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete " +
      "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", i);
              
    	      if (p) {
    	          System.out.println("Image Loaded");
    	       } else {
    	          System.out.println("Image not Loaded");
    	       }
 
      //page scroll feature
      JavascriptExecutor js = (JavascriptExecutor) driver;
      driver.navigate().refresh();
      js.executeScript("window.scrollBy(0,-500)", "");
      Thread.sleep(6000);
      System.out.println("Page Scrolling Working");
      Thread.sleep(6000);
      //page scroll to bottom
      driver.navigate().refresh();
      js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
      System.out.println("Navigating to Bottom of Page");
      
      //image loading while scrolling
      driver.navigate().refresh();
      js.executeScript("window.scrollBy(0,500)", "");
      Thread.sleep(3000);
      WebElement r = driver.findElement(By.xpath("//img[@alt='APPLE iPhone 13 (Pink, 128 GB)']"));
        Boolean q = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete " + 
      "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", r);
      
      if (q) {
          System.out.println("Image downloading while scrolling");
       } else {
          System.out.println("Image not Loaded");
       }
      driver.close();
     }
     @BeforeMethod
     public void beforemethod() {
     System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");	
     }
 }

