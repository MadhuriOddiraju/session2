package assig;

import java.util.Scanner;
public class ArmstrongNumber
{
public static void main(String []args)
{
	int num, i, temp, total = 0;
	System.out.println("Enter three digit number");
	Scanner sc = new Scanner(System.in);
			
	num = sc.nextInt();
	sc.close();
	i = num;
	
	for( ; i!=0;i/=10) 
	{
		temp = i%10;
		total = total + temp*temp*temp;
	}
	if(total== num)
	{
		System.out.println(num+ " num is a Armstrong");
	}
	else
		System.out.println(num+ " num is not a Armstrong");
	
}
}
