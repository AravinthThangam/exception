package java8;

import java.util.Scanner;

public class ScannerArray {
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Size:");
		int[] a=new int[sc.nextInt()];
		for(int i=0;i<a.length;i++) {
		System.out.println("Enter value : ");
		a[i]=sc.nextInt();
		}
		MaxOrMin max=new ImplementedMethods()::findMax;
		MaxOrMin min=ImplementedMethods::findMin;
		System.out.println("Max: "+max.maxOrMin(a));
		System.out.println("Min: "+min.maxOrMin(a));
	}

}
