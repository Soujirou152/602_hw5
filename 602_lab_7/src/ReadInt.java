
public class ReadInt {
	public static int readValidInt() throws NumberFormatException, IllegalArgumentException {
		String numStr = StdIn.readLine();
		int N = Integer.parseInt(numStr);

		if (N <= 0)
			throw new IllegalArgumentException("oops");

		return N;
	}

	public static void main(String[] args) {
		int number = 0;
		String numStr;
		while (true) {
			StdOut.print("Enter an integer > 0: ");
			// numStr = StdIn.readLine();
			try {
				number = readValidInt();
				// number = Integer.parseInt(numStr);
				if (number > 0)
					break;
				StdOut.println("Illegal entry: must be > 0: ");
			}

			catch (NumberFormatException exp) {
				StdOut.println("Not an integer.");
			} catch (IllegalArgumentException e) {
				StdOut.println("Number you entered is not greater than 0");
			}

		}
		StdOut.println("You entered " + number);
	}

}
