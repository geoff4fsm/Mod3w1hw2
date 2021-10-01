package hw2;
import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter fibonacci series number");
		int fibNum = scan.nextInt(); 
		fibonacci(fibNum); // function call
		System.out.println("enter possible 3 digit armstrong number");
		int armNum = scan.nextInt(); 
		armstrong(armNum); // function call
		System.out.println("enter string to check if palindrome");
		String s = scan.next(); 
		scan.nextLine();
		palindrome(s); // function call
		scan.close();
	}
	public static void fibonacci(int n) {
		int num1 = 0, num2 = 1; // define variables
		for(int i = 0; i < n; i++) { // loop up to input number
			System.out.print(num1 + ", ");	// print number	
			// swap numbers
			int num3 = num1 + num2; 
			num1 = num2;
			num2 = num3;			
		}
		System.out.println();
	}
	public static void armstrong(int n) {
		// define variables
		int num = n;
		int rem = 0;
		int sum = 0;
		while(n > 0) { // loop while number > 0
			rem = n % 10; // remainder of number modulus 10
			sum = sum + (rem * rem * rem); // sum of previous sum and remainder cubed
			n = n / 10; // reduce number
		}
		if(num == sum) { // check if Armstrong number
			System.out.println(num + " is an Armstrong number");
		}
		else {
			System.out.println(num + " is not an Armstrong number");
		}
	}
	public static void palindrome(String str) {
		String revStr = ""; // define reverse string variable
		int strLength = str.length(); // assign string length variable to use in loop
		
		for (int i = strLength - 1; i >=0; i--) // loop through string in reverse order
			revStr = revStr + str.charAt(i); // assign reverse string
		
		if (str.equals(revStr)) // check if string is a palindrome
			System.out.println(str + " is a palindrome");
		
		else
			System.out.println(str + " is not a palindrome");
	}
}
