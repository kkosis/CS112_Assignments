import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CS112_Assignment2_1_Q3_kkosis
{
	public static void main(String[] args)
	{
	  Scanner fileIn = null;
		try
		{
			fileIn = new Scanner(new FileInputStream("CS112_Assignment2_1_Q3_textFile_kkosis.txt"));
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found");
			System.exit(0);
		}
		while(fileIn.hasNextLine())
		{
			String s = fileIn.nextLine();
			String sLower = s.toLowerCase();
			int indexHate = sLower.indexOf("hate");
			s = s.substring(0,indexHate) + "love" + s.substring(indexHate+4);
			System.out.println(s);
		}
		fileIn.close();
	}
}