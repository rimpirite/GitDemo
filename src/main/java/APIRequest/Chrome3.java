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

public class Chrome3 {

	
	@Test
	public void Gmail() throws MalformedURLException
	{
		  URL url=new URL("http://localhost:4444/wd/hub"); 
		  DesiredCapabilities cap=DesiredCapabilities.chrome(); 
		  RemoteWebDriver driver= new  RemoteWebDriver(url,cap); 
		  driver.get("https://www.gmail.com/");
		  System.out.println("Title "+driver.getTitle()); 
		  driver.quit();
		  
		 
	//	WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), new ChromeOptions());
		/*
		 * String url =
		 * "https://sprint.newhomesourceprofessional.com/community/texas/austin/51-east/146548?clientId=q1Iwn3YU67x0cza/AGbH7Q==";
		 * String[] segments = url.split("/"); String number = segments[segments.length
		 * - 2]; System.out.println(number); String regex =
		 * number.split("clientId=")[0]; String result = regex.replace("?", "");
		 * System.out.println(result); List<String> numberList = new
		 * ArrayList<String>(); numberList.add(result); System.out.println(numberList);
		 * // prints "[146548]"
		 */
	}

}
