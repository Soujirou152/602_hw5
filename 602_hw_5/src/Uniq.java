import java.util.ArrayList;
import java.util.Arrays;

public class Uniq
{
	public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list)
	{
		// here's a 'mock' version of removeDuplicates()...
		ArrayList<E> toreturn = new ArrayList<>();
		
		
		for(E elt : list)
			if(!toreturn.contains(elt))
			{
				toreturn.add(elt);
			}
		return toreturn;
	}
	
	public static void main(String[] args)
	{
		ArrayList<String> list1 = new ArrayList<>(Arrays.<String>asList("47","48","47","47","49"));
		StdOut.println(list1);
		StdOut.println(Uniq.removeDuplicates(list1));
		
		ArrayList<Integer> list2 = new ArrayList<>(Arrays.<Integer>asList(1,1,2,3,4,5,1,1));
		StdOut.println(list2);
		StdOut.println(Uniq.removeDuplicates(list2));
		

	}

}
