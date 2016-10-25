
public class Reverse {

	public static String reverse(String s) {
		if (s.length() == 0) {
			return s; // fix this
		} else {
			return reverse(s.substring(1)) + s.charAt(0);
		}
	}

	public static void main(String[] args) {
		String s = null;

		StdOut.printf("'%s'",reverse(s));
	}

}
