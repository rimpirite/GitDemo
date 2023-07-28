package APIRequest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class ChromeDocker {
	
	
	public static void main(String[] args) throws MalformedURLException
	{
		URL url= new URL("http://localhost:4444/wd/hub");
		DesiredCapabilities cap=DesiredCapabilities.chrome();
		RemoteWebDriver driver=new RemoteWebDriver(url,cap);
		driver.get("https://github.com/SeleniumHQ/docker-selenium");
		System.out.println("Title is "+driver.getTitle());
		driver.quit();
	}

}
