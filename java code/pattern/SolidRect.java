package pattern;
import java.util.Scanner;

public class SolidRect {
    public static void main(String[] args) {
        int n,m;
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the number of rows for rectangle: ");
        n=sc.nextInt();
        System.out.println("Enter the number of columns for rectangle: ");
        m=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                System.out.print("* ");
            }
            System.out.println();

        }
        sc.close();
    }
    
}
