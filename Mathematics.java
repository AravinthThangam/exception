package java8;
@FunctionalInterface
public interface Mathematics {
	public int math(int a,int b);
	public default void print() {
		System.out.println("It is Functional Interface");
	}
}
