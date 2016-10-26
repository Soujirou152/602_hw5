
public class CheckNested {
	public static boolean isProperlyNested(String expr) {
		if (expr.length() > 0 && expr.charAt(0) == '(' && expr.charAt(expr.length() - 1) == ')') {
			return true && isProperlyNested(expr.substring(1, expr.length() - 1));
		} else if (expr.length() == 0 && expr.equals("")) {
			return true;
		}
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		String s = null;
		StdOut.println("Enter a string of parentheses: i.e. '((()))' which evaluates true, or '()()' which is false ");
		
		s = StdIn.readLine();
		
		StdOut.println(isProperlyNested(s));
	}
}
