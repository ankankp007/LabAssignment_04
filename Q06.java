/*By ANKAN KUMAR PANJA 
 DATE-09/12/23
 Write a java program to enter two numbers through the keyboard. Write a program to find the value of one number 
 raised to the power of another. 
 Do not use Java built-in method).*/


import java.util.Scanner;
public class Q06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        int a, b;

		        Scanner obj = new Scanner(System.in);
		        System.out.print("Enter the base : ");
		        a = obj.nextInt();
		        System.out.print("Enter the power : ");
		        b = obj.nextInt();

		        int result = a;
		        int t = b;
		        while((b - 1) > 0) {
		            result *= a;
		            b--;
		        }

		        System.out.println(a + " to the power " + t + " is: " + result);

		        obj.close();
		    }

}
