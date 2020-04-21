package fibonacciseries;


import java.util.Scanner;

/**
 * Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. 
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34 
 **/

public class FibonacciCalc {
	

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.println("Enter number up to which Fibonacci series to print: ");
		int number = new Scanner(System.in).nextInt();

		System.out.println("Fibonacci series upto -> " + number + " numbers : ");
		
		// printing Fibonacci series upto number by recursion
		for (int ind = 1; ind <= number; ind++) {
//			System.out.print(fibonacci(ind) + " ");
			System.out.print(fibonacci2(ind) + " ");
		}

	}

	// This program uses recursion to calculate Fibonacci number for a given number
	public static int fibonacci(int number) {

		if (number == 1 || number == 2) {
			return 1;
		}

		return fibonacci(number - 1) + fibonacci(number - 2);
	}
	
	
	
	// This program uses loop to calculate Fibonacci number for a given number
    public static int fibonacci2(int number){
        if(number == 1 || number == 2){
            return 1;
        }
        int fibo1=1, fibo2=1, fibonacci=1;
        for(int i= 3; i<= number; i++){
           
            //Fibonacci number is sum of previous two Fibonacci number
            fibonacci = fibo1 + fibo2;             
            fibo1 = fibo2;
            fibo2 = fibonacci;
          
        }
        return fibonacci; 
      
    }   
    
    

}

//Enter number up to which Fibonacci series to print: 
//10
//Fibonacci series upto -> 10 numbers : 
//1 1 2 3 5 8 13 21 34 55 
