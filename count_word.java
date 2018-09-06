import java.util.*;
public class count_word{

	public static void main(String[] args) {
     String input;
     Scanner s=new Scanner(System.in);
	  System.out.println("Enter your String");
     input=s.nextLine();
     int count=1;
     for(int i=0;i<input.length();i++)
     {
    	 if(input.charAt(i)==' ') 
    	 {
    		 count++;
    	 }
     }
     System.out.println(count);
	}
}