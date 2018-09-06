import java.util.Scanner;
import java.lang.*;

class Substring
{
	public static void main(String args[])
	{
		
		String input="XYZ";
		int len=input.length();
		
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<=len;j++)
			{
				
				System.out.print("{"+input.substring(i,j)+"}  ");//i is included and j is excluded 
				
			}
			
			
		}
	
		
		
	}
}