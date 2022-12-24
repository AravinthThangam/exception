package Exception;

public class Ex2 {
	public static void main(String[] args) {
		String name=null;
		try {
		System.out.println(name.toLowerCase(null));
		}
		catch(Exception e) {
			System.err.println("We can't do any Operations using null value");
		}
		String num="TN79B5060";
		try {
		int a=Integer.parseInt(num);
		}
		catch(Exception e) {
			System.err.println("This String cannnot be Converted into Integer,because This String contains Numbers and Characters");
		}
		String c="Aravinth";
		try {
		System.out.println(c.charAt(8));
		}
		catch(Exception e) {
			System.err.println("This String contains less Intex Positions then you mentioned in program");
		}
		int[] m= {13,176,99,54,52};
		try {
		System.out.println(m[12]);
		}
		catch(Exception e) {
			System.err.println("This Array contains less Intex Positions then you mentioned in program");
		}
	}

}
