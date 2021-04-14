package yakup;

import java.util.Scanner;

public class changemaker{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number from 1-99 : ");
		int attempt = 0;
		do {
			int user_amount = scan.nextInt();
			if(user_amount>1 && user_amount<100) {
				changeMaker(user_amount);
				break;
			}else {
				attempt++;
				if(attempt == 3) {
					System.out.println("sorry, no more attempt");
					break;
				}else {
					System.out.println("Try again");
				}
			}
		}while(true);
	}
	public static void changeMaker(int amount) {

		int originalAmount = amount;
		int quarters = amount/25;
		amount = amount%25;
		int dimes = amount/10;
		amount = amount%10;
		int nickles = amount/5;
		amount = amount%5;
		int pennies = amount;
		
		System.out.println(originalAmount+" cents in coins can be given as :");
		System.out.println(quarters+" quarters");
		System.out.println(dimes+" dimes");
		System.out.println(nickles+" nickles");
		System.out.println(pennies+" pennies");
	}
}
