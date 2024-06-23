package pattern;
import java.util.Scanner;

public class Invetrothpyr {
    public static void main(String[] args) 
    {
         int n ;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter height of triangle/half pyramid: ");
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int k=1;k<=n-i; k++)
            {
                System.out.print("   ");
            }
            for (int l=1;l<=i;l++)
            {
                System.out.print(" * ");
             }


            
        System.out.println();
        }
        sc.close();
    }
    
}
