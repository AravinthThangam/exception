package java8;


public class UseSample {
	public static void main(String[] args) {
		String name="Arun";
		
	SampleChild sc=new SampleChild();
	SampleChild sc1=new SampleChild();
	SampleChild sc2=new SampleChild();
	sc.a=11;
//	sc.name="Arab";
	System.out.println(sc.onOff(true));
	sc.printString("Aravinth");
	Sample.print("Aravinth");
	System.out.println(sc.a);
	System.out.println(sc.name);
	}
}
