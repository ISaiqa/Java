import java.util.Scanner;

public class AddInt {
    public static void main(String[] args) {
        System.out.print(" Enter a number:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.print(" Enter another number:");
        int b= sc.nextInt();
        int sum=a+b;
        int prod=a*b;
        System.out.print("Sum of numbers:");
        System.out.println(sum);
        System.out.print("Product of numbers:");
        System.out.println(prod);
        sc.close();
}
}