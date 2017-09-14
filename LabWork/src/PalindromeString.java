import java.util.Scanner;

public class PalindromeString 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str=sc.nextLine();
		StringBuffer sb=new StringBuffer(str);
		sb.reverse();
		if(sb.toString().equals(str))
		{
			System.out.println(str+" is Palindrome");
		}
		else
		{
			System.out.println(str+" is not Palindrome");
		}
	}

}
