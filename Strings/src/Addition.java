import java.util.Scanner;

//beginner

public class Addition {

	public static void main(String args[]) {
		//Scanner scan = new Scanner(System.in);
		
		//todo: Read integer values as input and add them until the user writes a 's'.
		//Print the result.
		 
		 System.out.println("Enter numbers here");
		    int sum;
		    char a='s';
		    do {
		        Scanner scan = new Scanner(System.in);
		        int score = 0;
		        sum = 0;
		        String line = scan.nextLine();
		        scan = new Scanner(line); //has to do this to make the kb.hasNexInt() work.
		        if (scan.hasNextLine()) {
		        	scan.nextLine().toCharArray();
		        }
		        while (scan.hasNextInt()) {
		            score = scan.nextInt();
		            sum += score;
		        }
		        System.out.println("Sum = " + sum);
		    } while (sum != a);
	 
}
}



