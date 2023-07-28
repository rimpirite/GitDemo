package APIRequest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Chrome2 {

@Test
public void yahoo() throws MalformedURLException
{
	
		  URL url=new URL("http://localhost:4444/wd/hub"); 
		  DesiredCapabilities cap=DesiredCapabilities.chrome(); 
		  RemoteWebDriver driver= new  RemoteWebDriver(url,cap); 
		  driver.get("https://www.yahoo.com/");
		  driver.manage().window().maximize();
		  System.out.println("Title "+driver.getTitle()); 
		  driver.quit();
	}

}
