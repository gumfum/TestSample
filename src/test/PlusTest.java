package test;

import static org.junit.Assert.*;

import main.Plus;

import org.junit.Test;

public class PlusTest {

	@Test
	public void OnePlusOneTest() {
		Plus p = new Plus(1, 1);
		assertEquals(p.calc(), 2);
	}

	@Test
	public void GetNullTest() {
		Plus p = new Plus(1, 1);
		assertEquals(p.getAns(), 0);
	}
}
