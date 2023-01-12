package paav;
import java.util.Arrays;
import java.util.Scanner;
public class pavz {
private static boolean isAnagram(String x,String y)
{  
	char[] str1=x.toCharArray();
	char[] str2=y.toCharArray();
	Arrays.sort(str1);
	Arrays.sort(str2);
	return new String(str1).equals(new String(str2));
}
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String firstCharString="",originalString=str;
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
		 String dir=sc.next();
		 int x=sc.nextInt();
		 if(dir.equals("L"))
			 str=str.substring(x)+str.substring(0,x);
		 else if(dir.equals("R"))
			 str=str.substring(str.length()-x)+str.substring(0,str.length()-x);
		 firstCharString+=str.charAt(0);
		}
		 for(int i=0;i<originalString.length()-n;i++)
		 {
			 if(isAnagram(originalString.substring(i,i+n),firstCharString))
			 {
				 System.out.println("yes");
				 return;
			 }
			 
		 }
		 System.out.println("no");
	}


}
