import java.util.ArrayList;
import java.util.Random;

public class RandomList {

	public static void main(String[] args) {
		Random rand = new Random();
		ArrayList<Integer> randomList = new ArrayList<Integer>();
		for (int i = 0; i < 100; i++) {
			randomList.add(rand.nextInt(101));
		}
		int i = 0;

		StdOut.println("Enter an index of an array. (0-99): ");
		try {
			i = StdIn.readInt();
			StdOut.println(randomList.get(i));
		} catch (IndexOutOfBoundsException oob) {
			StdOut.println("Out of Bounds");
			System.exit(1);

		}
	}
}
