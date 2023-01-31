package java8;

public class UseMaxOrMin {
public static void main(String[] args) {
	ImplementedMethods i=new ImplementedMethods();
	MaxOrMin max=i::findMax;
	MaxOrMin min=ImplementedMethods::findMin;
	int [] a= {10,20,30,3,17,19};
	System.out.println("MAX: "+max.maxOrMin(a));
	System.out.println("MIN: "+min.maxOrMin(a));
}
}
