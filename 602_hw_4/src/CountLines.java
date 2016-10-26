import java.io.*;
public class CountLines {
	public static void main(String[] args) throws IOException {
		StdOut.print("Enter a filename (complete path): ");
		String fileName = StdIn.readLine();

		File file = new File(fileName);

		if (!file.exists()) {
			StdOut.println("No such file.  Exiting...");
			System.exit(1);
		} else if (file.isDirectory()) {
			StdOut.println("Not a file.  Exiting...");
			System.exit(1);
		}

		// we'll finish this in class
		//String newFile = StdIn.readLine();

		FileReader inFile = new FileReader(file);

		int ch;
		int counter = 0;
		char chr;
		while (-1 != (ch = inFile.read())) {
			chr = (char)ch;
			if(chr == '\n'){
				counter = counter + 1;
			}

		}
		inFile.close();
		StdOut.println("The number of lines in the file is " +counter);
	}
}
