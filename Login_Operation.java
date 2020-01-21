package Modlily_Site;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.annotations.Test;

public class Login_Operation {


	 	
	@Test
	
	public void open () throws InterruptedException {
		
        ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.navigate().to("https://www.modlily.com");
		Thread.sleep(1000);
	//	driver.findElement(By.xpath("//*[@id=\"subscribing_box\"]/div[2]/div/a/img")).click();
	//	driver.findElement(By.linkText("I Accept")).click();
		
		driver.findElement(By.linkText("Account")).click();
		Thread.sleep(1500);
   //    driver.findElement(By.xpath("//*[@id=\"reg_email\"]")).sendKeys("baradadas@gmail.com");
    //    driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("swapna@123");
	//	driver.findElement(By.xpath("//input[@id='confirm_password']")).sendKeys("swapna@123");
		
		
		driver.findElement(By.xpath("//*[@id=\"reg_email\"]")).sendKeys("swapnasephalika96@gmail.com");

	}
	
	
		
	}
	


 