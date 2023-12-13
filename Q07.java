/*By Ankan KUMAR PANJA , DATE-09/12/23
 Question-Write a java program to print the multiplication table of a number entered by the user.*/


import java.util.Scanner;
public class Q07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        int N; 
		        Scanner obj = new Scanner(System.in);
		        
		        System.out.print("Enter a no. for which you want to find the multiplication table: ");
		        N = obj.nextInt();

		        System.out.println("The multiplication table of " + N + " is: ");
		        
		        int t = 1;
		        while(t <= 20) { 
		            System.out.println(N + " x " + t + " = " + (N * t));
		            t++;
		        }
		        obj.close();
		  }

}
