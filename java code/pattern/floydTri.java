package pattern;

import java.util.Scanner;

public class floydTri {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print(i*j+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}