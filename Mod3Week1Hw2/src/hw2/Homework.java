package hw2;
import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter fibonacci series number");
		int fibNum = scan.nextInt();
		fibonacci(fibNum);
		System.out.println("enter armstrong number");
		int armNum = scan.nextInt();
		armstrong(armNum);
		System.out.println("enter string to check if palindrome");
		String s = scan.next();
		scan.nextLine();
		palindrome(s);
		scan.close();
	}
	public static void fibonacci(int n) {
		int num1 = 0, num2 = 1;
		for(int i = 0; i < n; i++) {
			System.out.print(num1 + ", ");
			
			int num3 = num1 + num2;
			num1 = num2;
			num2 = num3;			
		}
		System.out.println();
	}
	public static void armstrong(int n) {
		int num = n;
		int rem = 0;
		int sum = 0;
		while(n > 0) {
			rem = n % 10;
			sum = sum + (rem * rem * rem);
			n = n / 10;
		}
		if(num == sum) {
			System.out.println(num + " is an Armstrong number");
		}
		else {
			System.out.println(num + " is not an Armstrong number");
		}
	}
	public static void palindrome(String str) {
		String revStr = "";
		int strLength = str.length();
		
		for (int i = strLength - 1; i >=0; i--) 
			revStr = revStr + str.charAt(i);
		
		if (str.equals(revStr)) 
			System.out.println(str + " is a palindrome");
		
		else
			System.out.println(str + " is not a palindrome");
	}
}
