package pattern;
import java.util.Scanner;

public class HalfPyr {
    public static void main(String[] args)
     {
        int n ;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter height of triangle/half pyramid: ");
        n=sc.nextInt();
       
        for (int i = 1; i <= n; i++) 
        {
            for (int j = 1; j <= i; j++) 
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
        sc.close();
    
}
}
