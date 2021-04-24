package yakup;

import java.util.Scanner;

public class sumNumber{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("Enter your first number : ");
			int f = scanner.nextInt();
			System.out.print("Enter your second number : ");
			int s = scanner.nextInt();
			System.out.println("Sum : "+(f+s));
			scanner.nextLine();
			System.out.println("Do ou want to continue?");
			String a = scanner.nextLine().toLowerCase();
			
			if(!(a.equals("yes") || a.equals("no"))) {
				System.out.print("Invalid entry, please re-enter :");
				a = scanner.nextLine().toLowerCase();
			}
			
			if(a.equals("no")) {
				System.out.println("test completed");
				break;
			}
		}
	}
}
