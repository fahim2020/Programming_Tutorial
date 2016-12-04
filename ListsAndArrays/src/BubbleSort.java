
public class BubbleSort {
	
public class BubbleSort {
	public static void main(String[] args) {
		int[] Aray = {10,5,9,56,1};
		for(int i=0; i < Aray.length;i++)
		{
			for(int j=0; j < Aray.length;j++)
			{
				if(Aray[i]<Aray[j])
				{
					int temp=Aray[i];
					Aray[i]=Aray[j];
					Aray[j]=temp;
				}
			}
		}
		for(int i=0; i < Aray.length;i++)
		{
			System.out.println(Aray[i]+" ");
		}
	}

	}
//intermediate
	
	//todo: sort an array using bubblesort.
	//if you don't know how bubblesort works you can read it here: http://www.pkirs.utep.edu/CIS3355/Tutorials/chapter9/tutorial9A/bubblesort.htm
	
}
