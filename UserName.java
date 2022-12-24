package Exception;

import java.util.Scanner;

public class UserName {
	public static void main(String[] args)throws PasswordCheck {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name: ");
		String name=sc.next();
		System.out.println("Enter Password: ");
		String password=sc.next();
		if(password.length()>8) {
			System.out.println("Password Strength is Good");
		}
		else {
		try {
			throw new PasswordCheck("Please enter more than 8 characters as Password");
		}
		catch(PasswordCheck p) {
			System.out.println("Password Strength is Poor Please Change Your Password");
		}
		}
	}

}
