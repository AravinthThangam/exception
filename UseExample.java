package java8;

public class UseExample {
	public static void main(String[] args) {
		Example check=a-> {
			if(a==true) {
			System.out.println("It is Roadways Vehicle ? "+a);
			}
			else {
				System.out.println("It is Roadways Vehicle ? "+a);
			}
		
		};
		check.printIsRoadways(true);
		System.out.println(Example.printType());
	}

}
