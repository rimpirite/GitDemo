package APIRequest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class CSVFileReader {
	
	public static void main(String[] args) throws IOException, CsvException
	{
		String filePath=System.getProperty("user.dir")+"//csvfile.csv";
		CSVReader csv= new CSVReader(new FileReader(filePath));
		List<String[]>readAll=csv.readAll();
		Iterator<String[]> itr=readAll.iterator();
		while(itr.hasNext())
		{
			String[] arr=itr.next();
			for(String str:arr)
			{
				System.out.print(str+" ");
			}
			System.out.println();
		}
	}

}
