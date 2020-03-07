package interfaces;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IdentificationServiceImp implements DataService{

	@Override
	public String readLine(File file) throws IOException{
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(file));
			return reader.readLine();
		}finally {
			if(reader != null) reader.close();
		}
	}

	@Override
	public void writeLine(File file, String line)throws IOException 
	{
		String data = null;
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("data.txt"));
			
			writer.write(data);
			
			writer.flush();
			
			System.out.println("Data is flushed to the file.");
			
			writer.close();
	
	}
		catch(Exception e)
		{
			e.getStackTrace();
		}
	}

}
