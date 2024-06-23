package conditional;
import java.util.Scanner;

public class SumOfNum
 {
    public static void main(String[] args) 
    {
        int sum=0;
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the number till which you want sum:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
            }
         System.out.println("Sum of numbers from 1 to "+n+" is "+sum);
        sc.close();

    
}
}
