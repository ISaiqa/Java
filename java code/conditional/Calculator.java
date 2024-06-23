package conditional;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter two inetgers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(" Enter the operation you want to perform");
        System.out.println(" 1.Addition (Press +)");
        System.out.println(" 2.Subtraction (Press -)");
        System.out.println(" 3.Multiplication (Press *)");
        System.out.println(" 4.Division (Press /)");
        char op=sc.next().charAt(0);
        int result=0;
        switch(op)
        {
            case '+':
            result=a+b;
            System.out.println(" Sum of "+a+" and "+b+" = "+result);
            break;
            case '-':
            result=a-b;
            System.out.println(" Difference of "+a+" and "+b+" = "+result);
            break;
            case '*':
            result=a*b;
            System.out.println(" Product of "+a+" and "+b+" = "+result);
            break;
            case '/':
            if(b!=0)
            {
                result=a/b;
                System.out.println(" Division of "+a+" by "+b+" = "+result);
                }
                else
                {
                    System.out.println(" Division by zero is not allowed");
                    }   
            default:
            System.out.println("Invalid operation");


        }


        sc.close();


}
}
