package java8;

public class ImplementedMethods {
	public int findMax(int[]a) {
		int max=a[0];
		for(int b:a) {
			if(b>=max) {
				max=b;
			}
		}
		return max;
	}
	
	static int findMin(int[]a) {
		int min=a[0];
		for(int b:a) {
			if(b<=min) {
				min=b;
			}
		}
		return min;
	}
}
