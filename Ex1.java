package Exception;

public class Ex1 {
	public static void main(String[] args) {
		int a=10;
		int b=5;
		int c=0;
		int d=a/b;
		try {
		int e=a/c;	
		System.out.println(e);
		}
		catch (Exception x) {
			System.out.println(x);
			System.err.println("Any number divided by zero is Infinity");
			x.printStackTrace();
		}
		System.out.println("hi");
		System.out.println(d);
	}

}
