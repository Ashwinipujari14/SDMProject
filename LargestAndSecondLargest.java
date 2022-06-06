
public class LargestAndSecondLargest 
{
	public static void main(String[] args) 
	{
		int i;
		int arr[]= {12,34,50,55,43,54,60,10,9,51};
		int max=Integer.MIN_VALUE;
		int smax=Integer.MIN_VALUE;
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				smax=max;
				max=arr[i];
			}
			else if(arr[i]>smax)
			{
				smax=arr[i];
			}
		}
		System.out.println("Largest = " + max + " and " + "Second largest = " + smax);
	}//end of main
}//end of class
