/*By ANKAN KUMAR  PANJA,DATE-09/12/23
Question- An integer n is divisible by 9 if the sum of its digits is divisible by 9. Use this concept in your
program to determine whether or not the number is divisible by 9. Test it on the following numbers: Use while loop. */

import java.util.Scanner;
public class Q02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int n, sum = 0 ; 
				Scanner obj = new Scanner(System.in);
				System.out.print("Enter a Number : ");
				n = obj.nextInt();
				System.out.print("The number " + n + " is ");
				while(n > 0) {
					sum += n % 10;
					n /= 10;
				}
				
				if(sum % 9 == 0) { 
					System.out.println("divisible by 9.");
				} else {
					System.out.println("not divisible by 9.");
				}
				
				obj.close();
	 }

}
