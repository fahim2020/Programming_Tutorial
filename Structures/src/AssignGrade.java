import java.util.Scanner;

//if-else

public class AssignGrade {
	// todo: when executing the program you will be ask to write a score.
			// The program converts the score then into a grade and prints that
			// grade (1.0, 1.3, 1.7, ...)
			// Note that the student passed when the student gets a score of 50.0
			// points (4.0)

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Reading from System.in
		System.out.println("Enter a number: ");
		int n = scan.nextInt();
		if (n >= 96 && n <= 100) {
			System.out.println("Grade:1");
		} else {
			if (n >= 91 && n <= 95) {
				System.out.println("Grade:1.3");
			} else {
				if (n >= 86 && n <= 90) {
					System.out.println("Grade:1.7");
				} else {
					if (n >= 80 && n <= 85) {
						System.out.println("Grade:2");
					} else {
						if (n >= 50 && n <= 79) {
							System.out.println("FAIL");
						}
					}
				}
			}
		}
	}
}

		


