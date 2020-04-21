package primenumber;

import java.util.Scanner;
/**
 * Java Program to check if a number is Prime or Not. 
 **/
public class PrimeTester {

	public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);
        int number = Integer.MAX_VALUE;
        System.out.println("Enter number to check if prime or not ");
        while (number != 0) {
            number = scnr.nextInt();
            System.out.printf("Does %d is prime?  %b%n", number,
                    isPrime(number));
            
            System.out.printf("Does %d is prime?  %b%n", number,
            		isPrime1(number));

        }
    }


    /**
     * Java method to check if an integer number is prime or not.
     **/
    public static boolean isPrime(int number) {
        int sqrt = (int) Math.sqrt(number) + 1;
        for (int i = 2; i < sqrt; i++) {
            if (number % i == 0) {
                //no prime
                return false;
            }
        }
        return true;
    }


    /**
     * Other method to check if an integer number is prime or not.
     **/
    public static boolean isPrime1(int number) {
        if (number == 2 || number == 3) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        int sqrt = (int) Math.sqrt(number) + 1;
        for (int i = 3; i < sqrt; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }


}
