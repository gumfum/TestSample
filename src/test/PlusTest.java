package test;

import static org.junit.Assert.*;

import main.Plus;

import org.junit.Test;

public class PlusTest {

	@Test
	public void GetATest() {
		Plus p = new Plus(1, 2);
		assertEquals(p.getA(), 1);
	}
	
	@Test
	public void TwoPlusOneTest() {
		Plus p = new Plus(2, 1);
		assertEquals(p.calc(), 3);
	}

	@Test
	public void GetZeroTest() {
		Plus p = new Plus(1, 1);
		assertEquals(p.getAns(), 0);
	}
}
