package assig;

import java.util.Scanner;
public class SumofallDigits {
public static void main(String []args)
{
long number = 0, sum;
Scanner sc = new Scanner(System.in);
for(int i=0;i<5; i++)
{
System.out.println("Enter a number");
number = sc.nextLong();

for(sum=0; number!=0; number = number/10)
{
	sum = sum + number%10;
	
}
   System.out.println("sum of digits " +sum);
}
}
}