import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestUniq
{
	// generic helper method: build ArrayList from array
	private static <E> ArrayList<E> buildTest(E[] elts)
	{
		return new ArrayList<E>(Arrays.asList(elts));
	}
	
	@Test
	public void testShortUniq()
	{
		ArrayList<String> al = buildTest(new String[]{"one"});
		
		assertEquals("single String","[one]", (Uniq.<String>removeDuplicates(al)).toString());
	}

	@Test
	public void testShortDupe()
	{
		ArrayList<String> al = buildTest(new String[]{"one","one","one", "two"});
		
		assertEquals("two duplicate Strings","[one, two]", (Uniq.<String>removeDuplicates(al)).toString());
	}

}
