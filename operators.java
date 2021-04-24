package yakup;

import java.util.Scanner;

public class operators{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("enter your first number : ");
			int f = scanner.nextInt();
			System.out.print("enter  your secind number : ");
			int s = scanner.nextInt();
			System.out.print("enter a math operator : ");
			char operator = scanner.next().charAt(0);
			switch(operator) {
			case '-':
				System.out.println("Subtraction : "+(f-s));
				break;
			case '+':
				System.out.println("Addition : "+(f+s));
				break;
			case '*':
				System.out.println("Multiplication : "+(f*s));
				break;
			case '/':
				System.out.println("Division : "+(f/s));
				break;
				default:
					System.out.println("Invalid operator");
			}
			scanner.nextLine();
			System.out.println("Do you want to continue?");
			String a = scanner.next().toLowerCase();
			while(!(a.equals("yes") || a.equals("no"))) {
				System.out.print("Invalid entrry, please re-enter : ");
				a = scanner.nextLine().toLowerCase();
			}
			if(a.equals("no")) {
				System.out.println("test completed");
				break;
			}
		}
		scanner.close();
	}
}
