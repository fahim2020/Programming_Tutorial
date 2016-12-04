
public class Basics {
//beginner
	
	//todo: write some methods for some basic operations with arrays, like:
	//-return the length of an array
	//-drop the last element of an array
	//-sum up all the elements of an integer array
	//-check if an array contains a given element
	
import java.util.ArrayList;

		
  
public class BasicsArrayList {
	public static void main(int args[]) {
		ArrayList arrayff = new ArrayList();
		arrayff.add(1);
		arrayff.add("1");
		System.out.println("Contents of arrayff: " + arrayff);
	}
	public static void main(String args[]) {
		ArrayList arrayF = new ArrayList();
		System.out.println("Initial size of al: " + arrayF.size());
		// add elements to the array list
		arrayF.add("Fahim");
		arrayF.add("Safoor");
		arrayF.add("Leila");
		arrayF.add("Mohammad");
		arrayF.add("Sara");
		arrayF.add("Dina");
		arrayF.add(1, "Samin");
	      System.out.println("Size of al after additions: " + arrayF.size());

	      // display the array list
	      System.out.println("Contents of al: " + arrayF);

	      // Remove elements from the array list
	      arrayF.remove("F");
	      arrayF.remove(6);
	      System.out.println("Size of al after deletions: " + arrayF.size());
	      System.out.println("Contents of al: " + arrayF);;
	      

	
//beginner
	
	//todo: write some methods for basic operations with ArrayLists:
	//-write a method where you can add a certain value to an ArrayList
	//-write a method which prints all the values in an ArrayList
	 }
}

}
