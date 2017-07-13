package SuiteClass;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import TestClasses.AddTest;
import TestClasses.ConCatTest;

@RunWith(Suite.class)
@SuiteClasses({ AddTest.class, ConCatTest.class })
public class AllTests {

}
