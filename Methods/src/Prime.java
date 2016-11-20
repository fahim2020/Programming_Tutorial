import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		int j = 2; 
		int result = 0; 
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter a Number : ");
		int n = scan.nextInt();
		while (j <= n / 2) // start loop, during loop j will become each number
							// between 2 and
		{ // the entered number divided by 2
			if (n % j == 0) // If their is no remainder from your number divided
							// by j...
			{
				 result = 1; // Then result is set to 1 as the number divides
							// equally by another number, hergo
			} // it is not a prime number
			j++; // Increment j to the next number to test against the number
					// you entered
		}
		if (result == 1) // check the result from the loop
		{
			System.out.println("Number: " + n + " is Not Prime."); // If result
																	// 1 then a
																	// prime
		} else {
			System.out.println("Number: " + n + " is Prime. "); // If result is
																// not 1 it's
																// not a prime
		}

		// todo: write a method which tells you if a given number is a prime or
		// not

	}

}
