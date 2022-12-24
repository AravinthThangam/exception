package Exception;

public class Ex4 {
	public static void main(String[] args) {
		int a=10;
		int b=0;
		String name=null;
		String num="TN79B5060";
		String c="Aravinth";
		try {
			System.out.println(a/b);
		}
		catch(ArithmeticException ae) {
			System.err.println("Any number divided by zero is Infinity");
		}
		catch(NullPointerException npe) {
			System.err.println("We can't do any Operations using null value");
		}
		catch(NumberFormatException ne) {
			System.err.println("This String cannnot be Converted into Integer,because This String contains Numbers and Characters");
		}
		catch(Exception e) {
			System.out.println("Input is Wrong");
		}
		
		System.out.println();
		
		try {
			System.out.println(name.toLowerCase(null));
			System.out.println(Integer.parseInt(num));
		}
		catch(ArithmeticException ae) {
			System.err.println("Any number divided by zero is Infinity");
		}
		catch(NullPointerException npe) {
			System.err.println("We can't do any Operations using null value");
		}
		catch(NumberFormatException ne) {
			System.err.println("This String cannnot be Converted into Integer,because This String contains Numbers and Characters");
		}
		catch(Exception e) {
			System.out.println("Input is Wrong");
		}
		
		System.out.println();
		
		try {
			System.out.println(Integer.parseInt(num));
		}
		catch(ArithmeticException ae) {
			System.err.println("Any number divided by zero is Infinity");
		}
		catch(NullPointerException npe) {
			System.err.println("We can't do any Operations using null value");
		}
		catch(NumberFormatException ne) {
			System.err.println("This String cannnot be Converted into Integer,because This String contains Numbers and Characters");
		}
		catch(Exception e) {
			System.err.println("Input is Wrong");
		}
		
		System.out.println();
		
		try {
			System.out.println(c.charAt(8));
		}
		catch(ArithmeticException ae) {
			System.err.println("Any number divided by zero is Infinity");
		}
		catch(NullPointerException npe) {
			System.err.println("We can't do any Operations using null value");
		}
		catch(NumberFormatException ne) {
			System.err.println("This String cannnot be Converted into Integer,because This String contains Numbers and Characters");
		}
		catch(Exception e) {
			System.err.println("Input is Wrong");
		}
		
		finally {
			System.out.println("\n"+"Sorry for the Inconvinience");
		}
	}
}
