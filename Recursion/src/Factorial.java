import java.util.Scanner;
public class Factorial {
	//todo: implement a recursive functions whicht gives you the factorial value of a given number
	public static void main(String[] args){
		Scanner scan =new Scanner(System.in);
		System.out.println("enter a number:");
		int n =scan.nextInt();
		 
	        int fact = 1; // this  will be the result
	        for (int i = 1; i <= n; i++) {
	            fact *= i;
	     
	       
	    }
	        System.out.println("factorial is :"+fact);
		
	}
	
	
}
