/*By ANKAN KUMAR PANJA , DATE-09/12/23
QUESTION-Write a program that generates a random integer number between 1 to 10 and asks the user to guess what
the number is. If the user's guess is higher than the random number, the program should display "Too high, try
again." If the user's guess is lower than the random number, the program should display "Too low, try again."The 
program should use a loop that repeats until the user correctly guesses the random number and display good
guess.*/

import java.util.Scanner;

public class Q08 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        int computer_guess, user_guess;

		        Scanner obj = new Scanner(System.in);

		        while(true) {

		            computer_guess = (int)(1 + (Math.random() * 10));

		            System.out.print("User Guess[1-10] : ");
		            user_guess = obj.nextInt();

		            System.out.println("Computer Guess : " + computer_guess);
		            System.out.println("User Guess : " + user_guess);

		            if(user_guess > computer_guess) {
		                System.out.println("Too high, try again");
		            } else if(user_guess < computer_guess) {
		                System.out.println("Too low, try again");
		            } else {
		                System.out.println("Good guess");
		                break;
		            }
		            System.out.println();
		        }

		        obj.close();
		}
	
}
