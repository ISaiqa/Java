package pattern;
import java.util.Scanner;

public class InvertHpyra {
    public static void main(String[] args) 
    {
        int n ;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter height of triangle/half pyramid: ");
        n=sc.nextInt();
        for(int i=n;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
        sc.close();

    }
    
}
