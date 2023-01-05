package lp;
import java.util.Scanner;
public class pp {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in) ;
		int n=sc.nextInt();
	 String[] namelist=new String[n];
	 namelist[0]=sc.nextLine();
	 for(int i=0;i<n;i++)
	 {
		 namelist[i]=sc.nextLine();
	 }
	 System.out.println("enter the element to be found");
	 String search=sc.nextLine();
	 for(int i=0;i<n;i++)
	 
		 if(namelist[i].equals(search))
		 {
			 System.out.println("found at location "+i);
			 System.exit(0);
		 }
		 System.out.println("not found");
	 }
	}


