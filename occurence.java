import java.util.Scanner;
import java.lang.*;

class occurence
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your Main string ");
		String s1=s.nextLine();
		System.out.println("Enter your string 2");
		String s2=s.nextLine();
		if(s1.contains(s2))
		{
			System.out.println(s2+" is present in "+s1 );
		}
		else
		{
			
		System.out.println(s2+" : is not present in : "+s1);
		}
		
		
	}
}