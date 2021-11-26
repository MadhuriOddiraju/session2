
package assignments;
import java.util.Arrays;
import java.util.Scanner;public class NegativeElementsAside
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("enter the array size: ");
int n = sc.nextInt();
System.out.println("enter the elements in array: ");
int arr[] = new int [n];
for(int i=0;i<arr.length;i++)
{
arr[i]=sc.nextInt();
}
Arrays.sort(arr);
for(int n1:arr)
{
System.out.print(n1+" ");
}
}
}

