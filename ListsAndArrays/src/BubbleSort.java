
public class BubbleSort {
	public static void main(String[] args) {
		int[] kosooo = {10,5,9,56,1};
		for(int i=0; i < kosooo.length;i++)
		{
			for(int j=0; j < kosooo.length;j++)
			{
				if(kosooo[i]<kosooo[j])
				{
					int temp=kosooo[i];
					kosooo[i]=kosooo[j];
					kosooo[j]=temp;
				}
			}
		}
		for(int i=0; i < kosooo.length;i++)
		{
			System.out.println(kosooo[i]+" ");
		}
	}

	// intermediate

	// todo: sort an array using bubblesort.
	// if you don't know how bubblesort works you can read it here:
	// http://www.pkirs.utep.edu/CIS3355/Tutorials/chapter9/tutorial9A/bubblesort.htm

}
