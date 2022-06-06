import java.util.Scanner;

public class Search 
{
	int [] arr;
	
	public Search(int size)
	{
		arr = new int[size];
	}
	
	public void acceptArray()
	{
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<arr.length; i++)
		{
			System.out.print("Enter number : ");
			arr[i] = sc.nextInt();
		}
		sc.close();
	}
	
	public int binarySearch(int key)
	{
		int low = 0;
		int high = arr.length-1;
		int mid = (low+high)/2;
		
		while((arr[mid] != key)&&(low < high))
		{
			if(key < arr[mid])
				high = mid - 1;
			else
				low = mid + 1;
			
			mid = (low + high)/2;
		}
		if(arr[mid] == key)
			return mid + 1;
		else
			return -1;
	}
}
