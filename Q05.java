/*By ANKAN KUMAR PANJA 
DATE-09/12/23
Write a Java program to check if a number is perfect number or not.
Hints: A number N is called perfect number, if the sum of factors except N as a factor is equals to the number N.
*/


import java.util.Scanner;
public class Q05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        int N, sum = 0;
		        Scanner obj = new Scanner(System.in);

		        System.out.print("Enter a Number : ");
		        N = obj.nextInt();

		        for(int i = 1;i * i <= N;i++) {
		            if(N % i == 0) {
		                if(i != N/i && i != 1) { 
		                    sum += i + N/i;
		                } else {
		                    sum += i;
		                }
		            }
		        }
		        
		        if(N == sum) {
		            System.out.println(N + " is a perfect number.");
		        } else {
		            System.out.println(N + " is not a perfect number.");
		        }
		        obj.close();
	}

}
