package APIRequest;

import static org.testng.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Calendar;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Startdocker {
	 
	public void startFile() throws IOException, InterruptedException
	{
		BufferedReader br;
		boolean flag=false;
		String filePath=System.getProperty("user.dir")+"/output.txt";
		Runtime runtime=Runtime.getRuntime();
		runtime.exec("cmd /c start dockerUp.bat");
		Calendar cal=Calendar.getInstance();
		cal.add(Calendar.SECOND, 50);
		long stoptime=cal.getTimeInMillis();
		Thread.sleep(3000);
		while(System.currentTimeMillis()<stoptime)
		{
			if(flag)
			{
				break;
			}
			br=new BufferedReader(new FileReader(filePath));
			String currentLine=br.readLine();
			while(currentLine!=null && !flag)
			{
				if(currentLine.contains("added the node"))
				{
					System.out.println("Found the text");
					flag=true;
					break;
				}
				currentLine=br.readLine();
			}
			br.close();
		}
		Assert.assertTrue(flag);
		Thread.sleep(5000);
		runtime.exec("cmd /c start scaleUpChrome.bat");
		Thread.sleep(5000);
	}

}
