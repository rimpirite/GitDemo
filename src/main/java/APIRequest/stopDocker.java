package APIRequest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Calendar;

import org.testng.Assert;
import org.testng.annotations.Test;

public class stopDocker {
	 
	public void stopFile() throws IOException, InterruptedException
	{
		BufferedReader br;
		boolean flag=false;
		Runtime runtime=Runtime.getRuntime();
		runtime.exec("cmd /c start stopDocker.bat");
		Calendar cal=Calendar.getInstance();
		cal.add(Calendar.SECOND, 50);
		long stoptime=cal.getTimeInMillis();
		String filePath=System.getProperty("user.dir")+"/output.txt";
		Thread.sleep(5000);
		while(System.currentTimeMillis()<stoptime)
		{
			if(flag)
			{
				break;
			}
			br=new BufferedReader(new FileReader(filePath));
			String currentline=br.readLine();
			while(currentline!=null && !flag)
			{
				if(currentline.contains("exited with 143 code"))
				{
					System.out.println("Found the required code");
					flag=true;
					break;
				}
				currentline=br.readLine();
			}
			br.close();
		}
		Assert.assertTrue(flag);
		File file=new File(filePath);
		boolean deleteFile=file.delete();
		Assert.assertTrue(deleteFile,"File is not deleted");
		System.out.print("File Deleted Successfully");
	}

}
