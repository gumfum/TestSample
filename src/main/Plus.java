package main;

public class Plus {
	private int a, b, ans;
	
	public Plus(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void setA(int a) {
		this.a = a;
	}
	
	public void setB(int b) {
		this.b = b;
	}
	
	public int getAns() {
		return ans;
	}
	
	public int calc() {
		ans = a + b;
		return ans;
	}
}
