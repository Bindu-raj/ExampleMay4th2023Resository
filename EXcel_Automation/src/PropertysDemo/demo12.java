package PropertysDemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class demo12 {
	public static void main(String[] args) {
		writeContent();
		readContent();
	}
	private static void writeContent()
	{
		FileOutputStream fout=null;
		Properties prop=null;
		try
		{
			fout=new FileOutputStream("C://Mainfolder//Properties");
			prop=new Properties();
			prop.setProperty("Username","Admin");
			prop.setProperty("Password","Manager");
			prop.setProperty("pin","1995");
			prop.store(fout,"It is an example file");
		}catch (Exception e)
		{
			e.printStackTrace();
		}
	}


	private static void readContent()
	{
		FileInputStream fin=null;
		Properties prop=null;
		try
		{
			fin=new FileInputStream("C://Mainfolder//Properties");
			prop=new Properties();
			prop.load(fin);

			String User=prop.getProperty("Username");
			System.out.println(User);
			String pwd=prop.getProperty("Password");
			System.out.println(pwd);
			String pin=prop.getProperty("pin");
			System.out.println(pin);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fin.close();
				prop.clear();
			}catch(Exception e)
			{
				e.printStackTrace();
				
			}
		}
	}
}



