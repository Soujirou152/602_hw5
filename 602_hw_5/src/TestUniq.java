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
		ArrayList<String> al = buildTest(new String[]{"one","one"});
		
		assertEquals("two duplicate Strings","[one]", (Uniq.<String>removeDuplicates(al)).toString());
	}
	
	@Test
	public void test1()
	{
		ArrayList<String> al = buildTest(new String[]{"one","one","one", "two"});
		
		assertEquals("two duplicate Strings","[one, two]", (Uniq.<String>removeDuplicates(al)).toString());
	}
	
	@Test
	public void test2()
	{
		ArrayList<String> al = buildTest(new String[]{"elephant","Tiger","elephant","Elephant","lion"});
		
		assertEquals("two duplicate Strings","[elephant, Tiger, Elephant, lion]", (Uniq.<String>removeDuplicates(al)).toString());
	}
	
	@Test
	public void test3Integer()
	{
		ArrayList<Integer> al = buildTest(new Integer[]{1,2,3,1,2,3});
		
		assertEquals("two duplicate Strings","[1, 2, 3]", (Uniq.<Integer>removeDuplicates(al)).toString());
	}
	
	@Test
	public void test4Integer()
	{
		ArrayList<Integer> al = buildTest(new Integer[]{1242131,1242131, 111, 120});
		
		assertEquals("two duplicate Strings","[1242131, 111, 120]", (Uniq.<Integer>removeDuplicates(al).toString()));
	}
	
	@Test
	public void test5()
	{
		ArrayList<String> al = buildTest(new String[]{"one","one","one", "two"});
		
		assertEquals("two duplicate Strings","[one, two]", (Uniq.<String>removeDuplicates(al)).toString());
	}

}
