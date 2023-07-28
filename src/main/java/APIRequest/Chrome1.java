package APIRequest;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Chrome1 {

	@BeforeTest
	public void startDocker()
	{
		Startdocker sd=new Startdocker();
		try {
			sd.startFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

@Test
public void google() throws MalformedURLException
{
		  URL url=new URL("http://localhost:4444/wd/hub"); 
		  DesiredCapabilities cap=DesiredCapabilities.chrome(); 
		  RemoteWebDriver driver= new  RemoteWebDriver(url,cap); 
		  driver.get("https://www.google.com/");
		  System.out.println("Title "+driver.getTitle()); 
	}

@AfterTest
public void stopDocker()
{
   stopDocker sd=new stopDocker();
   try {
	sd.stopFile();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}

}
