package java8;

import java.util.Optional;

public class ArrayOptionalCheck {
	public static void main(String[] args) {
		String[] words=new String[4];
		String[] words1= {"s","a",null,"r"};
		Optional<String> check=Optional.ofNullable(words1[1]);
		if(check.isPresent()) {
			System.out.println(words1[1].toUpperCase());
		}
		else {
			System.out.println("The Value is Null");
		}
	}

}
