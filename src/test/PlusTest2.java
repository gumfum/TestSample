package test;

import static org.junit.Assert.*;

import main.Plus;

import org.junit.Test;

public class PlusTest2 {

	@Test
	public void GetBTest() {
		Plus p = new Plus(1, 2);
		assertEquals(p.getB(), 2);
	}
	
	@Test
	public void OnePlusTwoTest() {
		Plus p = new Plus(1, 2);
		assertEquals(p.calc(), 3);
	}
}