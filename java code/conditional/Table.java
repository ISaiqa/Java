package conditional;

import java.util.Scanner;

public class Table {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number for which you want to print the table");
        int num=sc.nextInt();
        System.out.print("Table of ");
        System.out.println(num);
        for(int i=1;i<=10;i++)
        {
            System.out.println(num+" * "+i+" = "+num*i);
            }

      
        sc.close();
   
    }
    
}
