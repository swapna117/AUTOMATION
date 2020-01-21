package Modlily_Site;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Welcome_to_Modlily {
	
	public static WebDriver driver;
	
	@Test
    
	public void open() {
	ChromeOptions option = new ChromeOptions();
	option.addArguments("--disable-notifications");
	driver = new ChromeDriver(option);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.modlily.com/");
	
	driver.findElement(By.xpath("//*[@id=\"subscribing_box\"]/div[2]/div/a/img")).click();
    driver.switchTo().alert().dismiss();
    String homepage = driver.getWindowHandle();
    System.out.println(homepage);
    
    
    
  //  driver.findElement(By.xpath("//*[@id=\"accept_agree\"]/div/div[2]")).click();
  //  driver.switchTo().alert().accept();
  //  String mywindowhandle = driver.getWindowHandle();
  //  driver.switchTo().window(mywindowhandle);
    }
	
	
	

}
