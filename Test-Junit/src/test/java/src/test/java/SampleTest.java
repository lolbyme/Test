package src.test.java;

import static org.junit.Assert.*;

import org.junit.Test;

public class SampleTest {

	@Test
	public void SimpleTest() {
		int a = 1;
		int b = 2;
		assertTrue((a+b)==3);
	}
	@Test
	public void SimpleTest1() {
		int c = 2;
		int d = 2;
		assertTrue((c+d)==3);
	}
}
