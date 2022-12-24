package Exception;

public class Ex3 {
	public static void main(String[] args) {
		String c="TN79B5060";
		String[] x=c.split("[A-Za-z]");
		String b="";
		for(int i=0;i<x.length;i++) {
			b=b+x[i];
			}
		System.out.println(b);
	}
}
