import java.io.File;
import java.util.Arrays;
import java.util.List;

public class Longest
{

	public static void main(String[] args)
	{
		File infile = new File("words.txt");

		In inref = new In(infile);

		String[] allwords = inref.readAllStrings();

		// finish this...
		
		 Arrays.sort(allwords, new LengthComparator());
		List<String> list = Arrays.<String>asList(allwords);
		
		for(String s : list)
			StdOut.println(s);
		
		inref.close();

	}

}
