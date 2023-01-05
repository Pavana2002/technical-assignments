package pavanakulal;
import java.util.Scanner;
public class pkulal {

	public static void main(String[] args) {
		int a[]=new int[10];
		System.out.println("enter the size of elements");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("enter the array elements ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("entre the element to be searched");
		int key=sc.nextInt();
		int found=0;
		for(int i=0;i<n;i++)
		{
			if(key==a[i])
			{    found=1;
				
			   
			}
			
			
		}
		if(found==1)
			System.out.println("element found");
		else
			System.out.println("element  not found");

	}

}
