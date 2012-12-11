package main;

public class Product {
	private int a, b, ans;
	
	public Product(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void setA(int a) {
		this.a = a;
	}
	
	public void setB(int b) {
		this.b = b;
	}
	
	public int getA() {
		return a;
	}
	
	public int getB() {
		return b;
	}
	
	public int getAns() {
		return ans;
	}
	
	public int calc() {
		ans = a * b;
		return ans;
	}
}