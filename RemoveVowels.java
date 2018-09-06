import java.util.Scanner;
import java.lang.*;

class RemoveVowels
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your string ");
		String input=s.nextLine();
		
		StringBuilder s1=new StringBuilder();
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i)!='a' && input.charAt(i)!='e' && input.charAt(i)!='i' && input.charAt(i)!='o' && input.charAt(i)!='u' && input.charAt(i)!='A' && input.charAt(i)!='E' && input.charAt(i)!='I' && input.charAt(i)!='O' && input.charAt(i)!='U')
			s1=s1.append(input.charAt(i));
	    }
		
		System.out.println("After removing Vowels from "+input+" is : "+s1);
		
		
	}
}