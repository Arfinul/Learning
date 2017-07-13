package TestClasses;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import MainClass.MyJUnitClass;
	
public class ConCatTest {

	@Test
	public void ConCattest() {
		MyJUnitClass JUnit= new MyJUnitClass();
		String result = JUnit.ConCat("Hello","World");
		assertEquals("HelloWorld",result);
	}

}
