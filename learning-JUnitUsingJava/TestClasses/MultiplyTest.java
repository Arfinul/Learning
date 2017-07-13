package TestClasses;

import static org.junit.Assert.*;

import org.junit.Test;

import MainClass.MyJUnitClass;

public class MultiplyTest {

	@Test
	public void test() {
	   MyJUnitClass JUnit = new MyJUnitClass();
	   int result = JUnit.Multiply(4,3);
	   assertEquals(12,result);
	}
}
