package Exception;

public class OverFlow {
	public void findA( ) {
		findB();
	}
	public void findB() {
		findA();
	}
	public static void main(String[] args) {
		OverFlow o=new OverFlow();
		o.findA();
	}
}
