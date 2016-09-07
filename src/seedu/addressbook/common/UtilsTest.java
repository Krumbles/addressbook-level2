package seedu.addressbook.common;

import org.junit.Test;
import org.junit.Before;
import org.junit.BeforeClass;

import static org.junit.Assert.*;

import java.util.ArrayList;

public class UtilsTest {
	
	private static Object nullObject = null;
	private ArrayList<Object> arrayList = new ArrayList<Object>();
	
	/*@Before
	public void setup(){
		arrayList.clear();
	}*/
	
	@Test
	public void isAnyNull_emptyArgument(){
		assertFalse(Utils.isAnyNull());
	}
	
	@Test
	public void isAnyNull_onlyNullItem(){
		assertTrue(Utils.isAnyNull(nullObject));
	}
	
	@Test
	public void isAnyNull_noNullItem(){
		assertFalse(Utils.isAnyNull("abc", 123));
	}
	
	@Test
	public void isAnyNull_mixedItem(){
		assertTrue(Utils.isAnyNull("abc", 123, nullObject));
	}
	
	@Test
	public void elementsAreUnique_emptyList(){
		assertTrue(Utils.elementsAreUnique(arrayList));
	}
	
	@Test
	public void elementsAreUnique_oneNullObject(){
		arrayList.add(nullObject);
		assertTrue(Utils.elementsAreUnique(arrayList));
	}
	
	@Test
	public void elementsAreUnique_multipleNullObject(){
		arrayList.add(nullObject);
		arrayList.add(nullObject);
		arrayList.add(nullObject);
		assertFalse(Utils.elementsAreUnique(arrayList));
	}
	
	@Test
	public void elementsAreUnique_allUnique(){
		arrayList.add(new String("abcd"));
		arrayList.add(new Integer(1234));
		arrayList.add(new Float(12.34));
		assertTrue(Utils.elementsAreUnique(arrayList));
	}
	
	@Test
	public void elementsAreUnique_notUnique(){
		arrayList.add(new String("abcd"));
		arrayList.add(new String("abcd"));
		arrayList.add(new Integer(1234));
		arrayList.add(new Float(12.34));
		assertFalse(Utils.elementsAreUnique(arrayList));
	}
}
