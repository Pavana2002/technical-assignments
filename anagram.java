package pav;
import java.util.Arrays;
import java.util.Scanner;
//program for anagram
public class pvi {
	public static void main(String args[])
	{	
	Scanner sc=new Scanner(System.in);	
	char[] str1=sc.next().toCharArray();
	char[] str2=sc.next().toCharArray();
	Arrays.sort(str1);
	Arrays.sort(str2);
	if (new String(str1).equals(new String(str2)))
		System.out.println("anagram");
		else
			System.out.println("not an anagram");
	}
}
