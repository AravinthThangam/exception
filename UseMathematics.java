package java8;

public class UseMathematics {
	public static void main(String[] args) {
		Mathematics add=(a,b)->a+b;
		Mathematics sub=(a,b)->a-b;
		Mathematics mul=(a,b)->a*b;
		Mathematics div=(a,b)->a/b;
		Mathematics mod=(a,b)->a%b;
		System.out.println(add.math(200, 100));
		System.out.println(sub.math(200, 100));
		System.out.println(mul.math(200, 100));
		System.out.println(div.math(200, 101));
		System.out.println(mod.math(200, 103));
		add.print();
	}

}
