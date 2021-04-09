package yakup;

import java.util.Scanner;

public class primeNumber{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		int number = scan.nextInt();
		if(isPrime(number)) {
			System.out.println(number+" is a prime number");
		}else {
			System.out.println(number+" isn't a prime number");
		}
	}
	public static boolean isPrime(int number) {
		boolean flag = true;
		if(number==0 || number==1) {
			flag = false;
		}else {
			for(int i=2;i<number;i++){
				if(number%i==0) {
					flag = false;
					break;
				}
			}
		}
		return flag;
	}
}
