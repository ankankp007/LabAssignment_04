/*By ANKAN KUMAR PANJA DATE-09/12/23
Question-Write a program that finds greatest common divisor (GCD) of two numbers using Euclid's algorithm,
which is an iterative computation based on the following observation: if y divides x, the GCD of x and y is y;
otherwise, the GCD of x and y is same as GCD of x % y and y.*/


import java.util.Scanner;
public class Q04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int n1, n2, gcd;
				
				Scanner obj = new Scanner(System.in);
				System.out.print("Enter the first number: ");
				n1 = obj.nextInt();
				System.out.print("Enter the second number: ");
				n2 = obj.nextInt();
				
		        int a = n1, b = n2;
		        do{
		            gcd = a % b;
		            a = b;
		            b = gcd;
		        }while(a % b != 0);
				
				System.out.println("GCD of " + n1 + " and " + n2 + " is " + gcd);
				
				obj.close();
	     }

}
