package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddString {

	@Test
	public void test() {
		jUnitFunctions junit = new jUnitFunctions();
		String result = junit.AddStrings("ABC", "CBA");
		assertEquals("ABCCBA",result);
	}

}
