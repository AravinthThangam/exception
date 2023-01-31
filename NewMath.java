package java8;

import java.util.Scanner;

public class NewMath {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the First Number :");
	int a=sc.nextInt();
	System.out.println("Enter the Second Number :");
	int b=sc.nextInt();
	Mathematics add=(x,y)->x+y;
	System.out.println(add.math(a,b));
	System.out.println("Enter the String :");
	String c=sc.next();
	ExMath p=x->System.out.println(x.toUpperCase());;
	p.print(c);
	System.out.println("Enter the String :");
	String d=sc.next();
	ExMath p1=x->System.out.println("The Coverted String is "+x.toLowerCase());
	p1.print(d);
	}

}
