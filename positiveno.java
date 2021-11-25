package assig;

import java.util.Scanner;

public class PositiveNumber 
{
		
	public static void main(String []args)
	{
	 	   Scanner sc= new Scanner(System.in);
	   for(int i=1;i<5;i++)
	   {
	   System.out.println("enter the number:");
	 int number = sc.nextInt();
		   if(number>0)
	   {
	   System.out.println(number+ ": Number is positive");
	   }
	       else if(number<0)
	   {
	   System.out.println(number+ ": Number is negative");
	   }
	       else if(number == 0)
	       {
	    	   System.out.println(number+ ": Number is neither negative nor positive");
	       }
	}
	}  
}
