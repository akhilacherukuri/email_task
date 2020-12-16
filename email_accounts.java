package Email_Application;

import java.util.Random;
import java.util.Scanner;

public class email_accounts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		email_accounts obj = new email_accounts();
		obj.genereteEmailAccount(sc);
		obj.password();
		System.out.println("\nif you change the new pasword press yes ..otherwise press no");
		String chooseOption=sc.next();
		if(chooseOption.equals("yes")) {
			obj.changePassword(obj, sc);
		}
		//obj.changePassword(obj, sc);
	}

	public void genereteEmailAccount(Scanner sc) {
		System.out.println("Enter firstname");
		String firstname = sc.next();
		System.out.println("Enter Lastname");
		String lastname = sc.next();

		String department = chooseDepartment(sc);
		System.out.println("enter your comapny");
		String comapany = sc.next();
		System.out.println(firstname + "." + lastname + "@" + department + "." + comapany + ".com");
	}

	public static String chooseDepartment(Scanner sc) {
		System.out.println("enter your department");
		String department = sc.next();
		if (department.equals("site") || department.equals("development") || department.equals("accounting")) {
			return department;
		}
		return "-";

	}
	public void password() {
		char psw;
		Random r = new Random();
		String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ$&#";
		int size = abc.length();
		System.out.print("password : ");
		for (int i = 0; i < 8; i++) {
			psw=abc.charAt(r.nextInt(size));
			String password= Character.toString(psw);
			System.out.print(password);
		}
	}
	public void changePassword(email_accounts obj,Scanner sc) {
		System.out.println("Enter your old password");
		String oldPassword=sc.next();
		System.out.println("Enter your new password");
		String newPassword=sc.next();
		System.out.println("Enter conform your pasword");
		System.out.println(newPassword);
		System.out.println("your password has been set");
	}

}
