import java.io.*;

public class CopyFile
{

	public static void main(String[] args) throws IOException
	{
		StdOut.print ("Enter a filename (complete path): ");
		String fileName = StdIn.readLine();
		
		File file = new File(fileName);
		
		if (!file.exists())
		{
			StdOut.println("No such file.  Exiting...");
			System.exit(1); 
		}	
		else if (file.isDirectory())
		{
			StdOut.println("Not a file.  Exiting...");
			System.exit(1); 
		}

		// we'll finish this in class
		String newFile = StdIn.readLine();
		FileWriter outFile = new FileWriter(newFile);
		
		FileReader inFile = new FileReader(file);
		
		int ch;
		while (-1 != (ch = inFile.read())){
			//StdOut.print((char)ch);
			outFile.write(ch);
		}
		inFile.close();
		outFile.close();
		
	}

}
