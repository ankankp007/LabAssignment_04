/* By ANKAN KUMAR PANJA , Date-09/12/23
Question- Write a java program that gets three integer numbers from the user.Count from the first number to the
second number increments by the third number.Use for loop to do it. Also, display the sum of numbers displayed
between the first number and second number*/

import java.util.Scanner;
public class Q01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				int num1=0;
				int num2=0; 
				int num3=0;
				int sum = 0;
				
				Scanner obj = new Scanner(System.in);
				System.out.print("Enter First Number : ");
				num1 = obj.nextInt();
				System.out.print("Enter Second Number : ");
				num2 = obj.nextInt();
				System.out.print("Enter Third Number:  ");
				num3 = obj.nextInt();
				
				while(num1 <= num2) {
					System.out.print(num1 + " ");
					sum += num1;
					num1 += num3;
				}
				
				System.out.println("\nThe sum of number displayed is " + sum);
				
				obj.close();
	       }
	}

