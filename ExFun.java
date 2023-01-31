package java8;

import java.util.HashMap;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ExFun {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		String[] b= {"Arvind","Mano","Veda","Rajs","Sailesh"};
		int age=16;
		Function<Integer,Integer> f=x->x;
		for(int i=0;i<a.length;i++) {
			System.out.println(f.apply(a[i]));
		}
		System.out.println();
		
		
		Consumer<String> s=x->System.out.println(x);
		for(String x:b) {
			s.accept(x);
		}
		System.out.println();
		
		
		Supplier<String> su=()->"Hello";
		System.out.println(su.get());
		System.out.println();
		
		Predicate<Integer> t=x->(x>18);
		if(t.test(age)==true) {
			System.out.println("Eligible to Vote");
		}
		else {
			System.out.println("Not Eligible");
		}
	}
	

}
