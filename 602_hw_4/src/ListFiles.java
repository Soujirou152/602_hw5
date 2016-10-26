import java.io.File;

public class ListFiles {
	public static String listFiles(File dir) {
		String s = " ";
		if (dir.isDirectory()) {
			File[] files = dir.listFiles();
			for (int i = 0; i < files.length; i++) {
				if (files[i].isFile()) {

					s = s + files[i];
					StdOut.println(files[i]);
				} else {
					StdOut.println(files[i]);
					s = s + listFiles(files[i]);
				}
			}
		}
		return s;
	}

	public static void main(String[] args) {
		StdOut.print("Enter a filename (complete path): ");
		String startDir = StdIn.readLine();

		File base = new File(startDir);

		if (!base.exists()) {
			StdOut.println("No such directory.  Exiting...");
			System.exit(1);
		} else if (!base.isDirectory()) {
			StdOut.println("Not a directory.  Exiting...");
			System.exit(1);
		} else
			StdOut.print(listFiles(base));

	}

}
