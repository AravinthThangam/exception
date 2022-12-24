package Exception;

import java.util.Scanner;

public class VoterApplication  {
	public static void main(String[] args)throws AgeException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Age: ");
		int age=sc.nextInt();
		if(age>18) {
			System.out.println("Eligible To Vote");
		}
		
		else {
			throw new AgeException("Not Eligible to Vote");
		}
	}

}
