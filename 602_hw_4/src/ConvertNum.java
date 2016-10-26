
public class ConvertNum {
	@SuppressWarnings("static-access")
	public static String convertNum(int number, int base) {
		String convertString = "0123456789ABCDEF";
		if (number < base) {
			char ch;
			String s;
			ch = convertString.charAt(number);
			s = Character.toString(ch);
			return s;
		} else {
			char ch;
			String s;
			ch = convertString.charAt(number% base);
			s = Character.toString(ch);
			return convertNum(number / base, base) + s;
		}
	}

	public static void main(String[] args) {
		int num = 0;
		StdOut.println("Enter an int greater than 0");
		num = StdIn.readInt();
		StdOut.println("Base -> Representation of " + num);
		for (int base = 2; base <= 16; base++) {
			StdOut.println(base + " -> " + convertNum(num, base));
		}
	}

}
