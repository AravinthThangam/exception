package java8;

public class SampleChild implements Sample{
	
	  final String name="Aravinth";
	 
	  static int value=0;
	  static int a=10;
	 
	 public SampleChild() {
		 value++;
		 System.out.println(value);
	 }
	public void printString(String word ) {
		System.out.println(word);
	}
	public String onOff(boolean isOn) {
		return "Is on ? "+isOn;
	}

}
