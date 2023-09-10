package org.karthi.socialmedia;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Luma {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		   System.setProperty("webdriver.driver.chrome", "C:\\Driver\\chromedriver.exe\"");
	         
	        ChromeDriver driver = new ChromeDriver();
	        driver.get("https://magento.softwaretestingboard.com/");
	        driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a")).click();
	        driver.findElement(By.id("email")).sendKeys("karthick1299kvk@gmail.com");
	        driver.findElement(By.id("pass")).sendKeys("Karthick@123");
	        driver.findElement(By.xpath("//*[@id=\"send2\"]")).click();
		}
}


