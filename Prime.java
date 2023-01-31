package java8;

public class Prime {
	public static void main(String[] args) {
		
	int a=37;
	boolean b=true;
	for(int i=2;i<a;i++) {
		if(a%i==0) {
			b=false;
			break;
		}
	}
	if(b==true) {
		System.out.println("It is Prime");
	}
	else {
		System.out.println("It is not Prime");
	}
	}
}
