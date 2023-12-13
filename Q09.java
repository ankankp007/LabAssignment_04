/*By ANKAN KUMAR PANJA ,DATE-09/12/23
QUESTION-Write a java program to take an integer input from the user and print the input by removing all zeros.*/

import java.util.Scanner;
public class Q09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int N, new_N = 0; 
        
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        N = obj.nextInt();
        
        int k = 0;
        while(N > 0) {
            if(N % 10 != 0) {
                new_N += Math.pow(10,k) * (N % 10);
                k++;
            }
        N /= 10; 
        }

        System.out.println("After removing 0 from number " + N + ",the new number is " + new_N);
        
        obj.close();
    }

}
