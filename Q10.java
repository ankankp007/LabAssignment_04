/*By ANKAN KUMAR PANJA , DATE-09/12/23
 *QUESTION-Write a java program to print largest power of three less than or equal to N.*/


import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long N, pow;

        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number: ");
        N = obj.nextLong();

        pow = 3;
        while(pow <= N) {
            pow *= 3;
        }
        System.out.println("The largest power of 3 less than or equal to " + N + " is " + pow/3);

        obj.close();
    }

}
