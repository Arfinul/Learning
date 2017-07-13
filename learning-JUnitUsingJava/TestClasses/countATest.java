package TestClasses;

import static org.junit.Assert.*;

import org.junit.Test;

import MainClass.MyJUnitClass;

public class countATest {

	@Test
	public void test() {
		MyJUnitClass JUnit=new MyJUnitClass();
		int result = JUnit.countA("arfin");
		assertEquals(1,result);
	}

}
