package pattern;

import java.util.Scanner;

public class HRect {
    public static void main(String[] args) {
        
        int n,m;
        Scanner sc=new Scanner(System.in);
        System.out.print(" Enter height and width of hollow rectangle:");
        n=sc.nextInt();
        m=sc.nextInt();
         for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                if(i==1|| j==1||i==n||j==m)
                {
                    System.out.print(" * ");
                }
                else
                {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
    
}
