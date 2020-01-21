package Modlily_Site;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Login {
	
	WebDriver driver;
@Test
	public void test() throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver","./Drivers//chromedriver.exe"); // use your own Chrome path location
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--disable-notifications");
	 driver=new ChromeDriver(options);
	 driver.manage().window().maximize();
	driver.navigate().to("https://www.modlily.com");
	Thread.sleep(1000);
// Close popup
	driver.findElement(By.xpath("//*[@id=\"subscribing_box\"]/div[2]/div/a/img")).click();
	driver.findElement(By.linkText("I Accept")).click();
	driver.findElement(By.linkText("Account")).click();
	Thread.sleep(1000);
 //   driver.findElement(By.xpath("//*[@id='reg_email']")).click();
    Thread.sleep(800);
    driver.findElement(By.xpath("//*[@id='reg_email']")).sendKeys("Hiiii@hotmail.com");
    driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("swapna123");
    driver.findElement(By.xpath("//*[@id=\"confirm_password\"]")).sendKeys("swapna123");
    driver.findElement(By.xpath("//*[@id=\"js_registBtn\"]")).click();
    
  //select on TOPS
    Thread.sleep(800);
    driver.findElement(By.linkText("TOPS")).click();
    driver.findElement(By.xpath("//*[@id=\"js_cateListUl\"]/li[1]/p[1]")).click();
    driver.findElement(By.xpath("//*[@id=\"prOrder\"]/div[1]/div/div[4]/table/tbody/tr[1]/td[2]/a[2]/img")).click();
    Thread.sleep(800);
    driver.findElement(By.xpath("//*[@id=\"size_4281514\"]/a")).click();
    driver.findElement(By.linkText("ADD TO BAG")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//*[@id=\"float_add_cart\"]/div[1]/div[2]/a[2]")).click();
    driver.findElement(By.linkText("CHECKOUT NOW")).click();
    
    //SIGN IN FOR ORDER
  
    driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("Hiiii@hotmail.com");
    driver.findElement(By.xpath("//*[@id=\"float_login\"]/div[2]/div[2]/div/form/div[2]/input")).sendKeys("swapna123");
    
    
     }

}
