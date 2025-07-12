import java.util.*;
import java.lang.*;
class Rightangletriangle
{
    public static void main(String args[])
    {
        
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of rows for the right angle triangle : ");
    int n= sc.nextInt();
    for(int i=1; i<=n; i++)
    {
        for(int j=1; j<=i; j++)
        {
            System.out.print("* ");
        }
        System.out.println(" ");
    }
    for(int k=n; k>=1; k--)
    {
        for(int l=n; l<=k; l--)
        {
            System.out.print("* ");
        }
        System.out.println();
    }
    }
}