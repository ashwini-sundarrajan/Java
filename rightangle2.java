import java.util.*;
import java.lang.*;
class rightangle2
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int n= sc.nextInt();
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                if(j==1 || i==j || i==n)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}