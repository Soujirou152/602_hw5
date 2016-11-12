import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AlphaOrder
{
	public static void main(String[] args)
	{
		File infile = new File("alice.txt");

		In inref = new In(infile);

		String[] allwords = inref.readAllStrings();

		// finish this...
		
		 Arrays.sort(allwords);
		List<String> list = Arrays.<String>asList(allwords);
		
		for(String s : list)
			StdOut.println(s);
		
		inref.close();
		
	}

}
