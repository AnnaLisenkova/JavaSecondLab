package ru.spbstu.telematics.java;

import java.util.LinkedList;
import java.util.LinkedHashSet;
import java.util.HashMap;

import junit.framework.TestCase;
import org.junit.Test;

public class AppTest 
    extends TestCase
{
    //LinkedList
	@Test
	public void testListSize()
	{
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(5);
		list.add(5);
		list.add(10);
		list.add(15);
		assertTrue(list.size() == 4);
	}
	
	@Test
	public void testListAddFirst()
	{
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(5);
		list.add(5);
		list.add(10);
		list.add(15);
		list.addFirst(1);
		assertTrue(list.peek() == 1);
	}
	
	@Test
	public void testListClear()
	{
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		list.clear();
		assertTrue(list.size()==0);
	}
	
	@Test
	public void testListGet()
	{
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(5);
		list.add(20);
		list.add(10);
		list.add(15);
		assertTrue(list.get(2)==10);
	}
	
	@Test
	public void testListSet()
	{
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(5);
		list.add(20);
		list.add(10);
		list.add(15);
		list.set(0, 1);
		assertTrue(list.peek()==1);
	}
	
	@Test
	public void testListRemoveLast()
	{
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(20);
		list.removeLast();
		assertTrue(list.size() == 3);
	}
	
	@Test
	public void testListPop()
	{
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(20);
		list.pop();
		assertTrue(list.size() == 3);
	}
	
	@Test
	public void testListIndexOf()
	{
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(20);
		assertTrue(list.indexOf(7) == -1);
	}
	
	@Test
	public void testListListIterator()
	{
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(20);
		assertTrue(list.listIterator(1).next() == 10);
	}
	
	@Test
	public void testListDescendingIterator()
	{
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(5);
		list.add(10);
		list.add(15);
		list.add(20);
		assertTrue(list.descendingIterator().next() == 20);
	}
	
	//LinkedHashSet
	
	@Test
	public void testSetAdd()
	{
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		set.add(5);
		set.add(10);
		set.add(15);
		assertTrue(set.size() == 3);
	}
	
	@Test
	public void testSetIsEmpty()
	{
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		set.add(5);
		set.add(10);
		set.add(15);
		set.clear();
		assertTrue(set.isEmpty());
	}
	
	@Test
	public void testSetContains()
	{
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		set.add(5);
		set.add(10);
		set.add(15);
		assertTrue(set.contains(5));
	}
	
	@Test
	public void testSetRemove()
	{
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		set.add(5);
		set.add(10);
		set.add(15);
		set.remove(5);
		assertTrue(!set.contains(5));
	}
	
	@Test
	public void testSetEquals()
	{
		LinkedHashSet<Integer> set1 = new LinkedHashSet<Integer>();
		LinkedHashSet<Integer> set2 = new LinkedHashSet<Integer>();
		set1.add(5);
		set1.add(10);
		set1.add(15);
		set2.add(5);
		set2.add(10);
		set2.add(15);
		assertTrue(set1.equals(set2));
	}
	
	@Test
	public void testSetRetainAll()
	{
		LinkedHashSet<Integer> set1 = new LinkedHashSet<Integer>();
		LinkedHashSet<Integer> set2 = new LinkedHashSet<Integer>();
		set1.add(5);
		set1.add(10);
		set1.add(15);
		set2.add(5);
		set2.add(10);
		set2.add(20);
		set2.add(30);
		set1.retainAll(set2);
		assertTrue(set1.size()==2);
	}
	
	@Test
	public void testSetAddAll()
	{
		LinkedHashSet<Integer> set1 = new LinkedHashSet<Integer>();
		LinkedHashSet<Integer> set2 = new LinkedHashSet<Integer>();
		set1.add(5);
		set1.add(10);
		set1.add(15);
		set2.add(5);
		set2.add(10);
		set2.add(20);
		set2.add(30);
		set1.addAll(set2);
		assertTrue(set1.size()==5);
	}
	
	@Test
	public void testSetRemoveAll()
	{
		LinkedHashSet<Integer> set1 = new LinkedHashSet<Integer>();
		LinkedHashSet<Integer> set2 = new LinkedHashSet<Integer>();
		set1.add(5);
		set1.add(10);
		set1.add(15);
		set2.add(5);
		set2.add(10);
		set1.removeAll(set2);
		assertTrue(set1.size()==1);
	}
	
	@SuppressWarnings("unchecked")
	@Test
	public void testSetClone()
	{
		LinkedHashSet<Integer> set1 = new LinkedHashSet<Integer>();
		LinkedHashSet<Integer> set2 = new LinkedHashSet<Integer>();
		set1.add(5);
		set1.add(10);
		set1.add(15);
		set2 = (LinkedHashSet<Integer>)set1.clone();
		assertTrue(set1.equals(set2));
	}
	
	//HashMap
	
	@Test
	public void testMapSet()
	{
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "Null");
		hm.put(1, "One");
		assertTrue(hm.size() == 2);
	}
	
	@Test
	public void testMapClear()
	{
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "Null");
		hm.put(1, "One");
		hm.clear();
		assertTrue(hm.size() == 0);
	}
	
	@Test
	public void testMapContainsKey()
	{
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "Null");
		hm.put(1, "One");
		assertTrue(hm.containsKey(0));
	}
	
	@Test
	public void testMapContainsValue()
	{
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "Null");
		hm.put(1, "One");
		assertFalse(hm.containsKey("Two"));
	}

	@Test
	public void testMapGet()
	{
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("My", "Null");
		hm.put("Yours", "One");
		hm.put("Her", "Three");
		assertTrue(hm.get("Her") == "Three");
	}
	
	@Test
	public void testMapReplace()
	{
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("My", "Null");
		hm.put("Yours", "One");
		hm.put("Her", "Three");
		hm.replace("My", "Null", "Zero");
		assertTrue(hm.get("My") == "Zero");
	}
	
	@Test
	public void testMapSize()
	{
		HashMap<String, String> hm1 = new HashMap<String, String>();
		hm1.put("My", "Null");
		hm1.put("Yours", "One");
		hm1.put("Her", "Three");
		assertTrue(hm1.size() == 3);
	}
	
	@Test
	public void testMapToString()
	{
		HashMap<Integer, String> hm1 = new HashMap<Integer, String>();
		hm1.put(0, "Null");
		hm1.put(1, "One");
		hm1.put(2, "Three");
		assertTrue(hm1.toString().equals("{0=Null, 1=One, 2=Three}"));
	}
}
