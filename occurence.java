package assig;

import java.util.Scanner;
public class OccurenceOfNumber
{
public static void main(String[] args)
{
int count=0;
Scanner sc = new Scanner(System.in);
System.out.println("enter the array size: ");
int size = sc.nextInt();
int arr[] =new int[size];
System.out.print("enter the elements : ");
for(int i=0;i<arr.length;i++)
{
arr[i] =sc.nextInt();
}

System.out.println("enter the value to search");
int find=sc.nextInt();

boolean found = false;
for (int n : arr)
{
if (n == find)
{
found = true;
count++;
}
}
if(found)
System.out.println(find + " is found.");
else
System.out.println(find + " is not found.");
System.out.println(count+" times " +find+" repeating: ");
}
}