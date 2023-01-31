package java8;

public interface Sample {
	public String name="Aravinth";
	public static void print(String word) {
		
		System.out.println("The String is = "+word);
	}
	public default String onOff(boolean isOn) {
		if(isOn==true) {
			return "It is ON";
		}
		else {
			return "It is OFF";
		}
	}

}
