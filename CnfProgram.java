package Exception;

public class CnfProgram {
	public static void main(String[] args) {
		try {
			   Class.forName("java.lang.String");
			} 
		catch (ClassNotFoundException e) {
//			  System.err.println("Class Not Found");
			}
		finally {
			System.err.println("\n"+"The Given Class Path was java.lang.String");
		}
	}
}
