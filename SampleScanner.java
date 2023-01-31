package java8;

import java.util.Scanner;

public class SampleScanner {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Name: ");
		String name=sc.next();
		System.out.println("Enter age: ");
		int age=sc.nextInt();
		System.out.println("Name is "+name+"\n"+"Age is "+age);
	}
}
