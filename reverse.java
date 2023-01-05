package paavna;
import java.util.Scanner;
//reversing array elements
public class pavi {
                     
	public static void main(String args[])
	{   
		//creation of an array
		int[] arr=new int[10];
		System.out.println("enter the size of array");
		int n;
		
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println("enter the array elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
	for( int i=0,j=n-1;i<n/2;i++,j--)
	{
		arr[i]=(arr[i]+arr[j])-(arr[j]=arr[i]);
	}
		System.out.println("array elements after reversing are");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		
	}
	
}
