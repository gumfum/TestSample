package test;

import static org.junit.Assert.*;

import main.Minus;

import org.junit.Test;

public class MinusTest {

	@Test
	public void GetBTest() {
		Minus m = new Minus(1, 2);
		assertEquals(m.getB(), 2);
	}
	
	@Test
	public void TwoMinusOneTest() {
		Minus m = new Minus(2, 1);
		assertEquals(m.calc(), 1);
	}
	
	@Test
	public void getZeroTest() {
		Minus m = new Minus(1, 1);
		assertEquals(m.getAns(), 0);
	}

}
