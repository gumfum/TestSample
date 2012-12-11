package test;

import static org.junit.Assert.*;

import main.Product;

import org.junit.Test;

public class ProductTest {

	@Test
	public void GetBTest() {
		Product p = new Product(1, 2);
		assertEquals(p.getB(), 2);
	}
	
	@Test
	public void TwoProductOneTest() {
		Product p = new Product(2, 1);
		assertEquals(p.calc(), 2);
	}
	
	@Test
	public void getZeroTest() {
		Product p = new Product(1, 1);
		assertEquals(p.getAns(), 0);
	}
}
