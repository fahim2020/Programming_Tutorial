import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		int j = 2; 
		int result = 0; 
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter a Number : ");
		int n = scan.nextInt();
		while (j <= n / 2) // start loop 
		{ 
			if (n % j == 0) 
			{
				 result = 1; 
			} // it is not a prime number
			j++; 
		}
		if (result == 1) // check the result from the loop
		{
			System.out.println("Number: " + n + " is Not Prime."); 
			
																	
		} else {
			System.out.println("Number: " + n + " is Prime. "); 
																
		}

		// todo: write a method which tells you if a given number is a prime or
		// not
		//A prime number (or a prime) is a natural number greater than 1 that has 
		//no positive divisors other than 1 and itself. A natural number greater than
		//1 that is not a prime number is called a composite number.

	}

}
