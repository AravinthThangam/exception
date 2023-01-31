package java8;

import java.util.Scanner;
import java.util.function.Function;

public class ExScSt {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Line: ");
	String[] a=sc.nextLine().split(" ");
	Function<String,Integer> p=x->x.length();
	for(int i=0;i<a.length;i++) {
		System.out.println(p.apply(a[i]));
	}
}
}
