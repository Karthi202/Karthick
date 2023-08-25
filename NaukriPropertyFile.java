package writeexcel;

   
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class NaukriPropertyFile {


public static void main(String[] args) {
				        // Create a Properties object
				        Properties properties = new Properties();
				        

				        try {
				            // Load the properties from the file
				            FileInputStream input = new FileInputStream("config.properties");
				            properties.load(input);
				            input.close();
				        } catch (IOException e) {
				            e.printStackTrace();
				        }

				        // Retrieve values from the Properties object
				        String browser = properties.getProperty("browser");
				        
				        String url = properties.getProperty("url");
				        String username = properties.getProperty("username");
				        String password = properties.getProperty("password");

				        // Use the values in your Selenium tests
				        System.out.println("Browser: " + browser);
				        System.out.println("URL: " + url);
				        System.out.println("Username: " + username);
				        System.out.println("Password: " + password);
				        String driverPath = System.setProperty("webdriver.driver.chrome","\"C:\\Driver\\chromedriver.exe\"");
						System.out.println(driverPath);
						// Launch the browser
						ChromeOptions options = new ChromeOptions();
						options.addArguments("--remote-allow-origins=*");
						DesiredCapabilities capabilities = new DesiredCapabilities();
						capabilities.setCapability(ChromeOptions.CAPABILITY, options);
						options.merge(capabilities);
						ChromeDriver driver = new ChromeDriver(options);
						driver.get(url);
						
						driver.findElement(By.xpath("//*[@id=\"login_Layer\"]")).click();
						
						List<String> windowHandles =  new ArrayList<String>(driver.getWindowHandles());
				        System.out.println("Number of windows handles " + windowHandles.size());
				        // Switch to the new window
				        for (String windowHandle : windowHandles) {
				           System.out.println(windowHandle);
				        }
				     // Click the "Open New Window" button to open a new window
				        WebElement openWindowButton = driver.findElement(By.xpath("//*[@id=\"login_Layer\"]"));
				        openWindowButton.click();
				        String s=openWindowButton.getText();
				        System.out.println(s);
				        driver.switchTo().window(windowHandles.get(0));
						 
						driver.findElement(By.xpath("//input[@type='text']")).sendKeys(username);
				        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
				        driver.findElement(By.xpath("//button[@type='submit']")).click();
				    }
			 
	}


