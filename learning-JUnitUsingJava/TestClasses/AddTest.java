package TestClasses;

import static org.junit.Assert.*;

import org.junit.Test;

import MainClass.MyJUnitClass;

public class AddTest {

	@Test
	
	public void test() {
		MyJUnitClass junit= new MyJUnitClass();
		int result = junit.add(100, 200);
		assertEquals(300,result);
	}

}
