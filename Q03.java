/*By ANKAN KUMAR PANJA,DATE-09/12/23
 QUESTION-Write a java program that takes an integer N from user, uses Math. Random () to print N random integer
 numbers between 1 to N, and then prints their average value. Use do while loop. */


import java.util.Scanner;
public class Q03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int n, sum = 0;
				double avg;
				
				Scanner obj = new Scanner(System.in);
				System.out.print("Enter a number: ");
				n = obj.nextInt();
				
				int t = n;
				
				System.out.print("Random numbers generated are: ");
				while(n > 0) {
					int random_num = (int)(1 + (Math.random() * n));
					System.out.print(random_num + " ");
					sum += random_num;
					n--;
				}
				
				avg = sum/t;
			
				System.out.println("\nAverage of " + t + " random numbers are " + avg);
						 
				obj.close();
	  }

}
