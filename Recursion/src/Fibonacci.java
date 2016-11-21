import java.util.Scanner;

public class Fibonacci {
	//todo: implement a recursive function which takes an integer value as inputs and outputs the corresponding Fibonacci number.
	//if you don't know what Fibonacci numbers are you can read it here: https://en.wikipedia.org/wiki/Fibonacci_number
	public static void main(String[] args){ 
		Scanner scan =new Scanner(System.in);
		System.out.println("enter a number:");
		int n =scan.nextInt();
		double prev=0d, next=1d, result=0d;
		if(n==0){
			 System.out.println("fib is:"+n);	
		}
		else {
	for (int i=0;i<=n;i++){
		result=prev+next;
        prev=next;
        next=result;
	}
	}
	 System.out.println("fib is :"+next);	
	}
}
