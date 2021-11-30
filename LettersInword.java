package assig;

import java.lang.reflect.Array;
import java.util.Scanner;
public class StringMain 
{
	
	public static void main(String[] args) 
	{
	int count = 0;

	Scanner scan = new Scanner(System.in);
	System.out.println("enter the data");
	String data = scan.nextLine();
	for (int i = 0; i < data.length(); i++) {

	count= count+1;
	}
	System.out.println(count);

	}

	}


