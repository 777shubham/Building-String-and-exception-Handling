import java.util.Scanner;
import java.lang.*;

class Reverse
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your string ");
		String input=s.nextLine();
		
		StringBuilder s1=new StringBuilder();
		s1.append(input);
		s1.reverse();
		System.out.println("Reverse of String : "+s1);
		
		
	}
}