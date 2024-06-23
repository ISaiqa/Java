import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args)
    {
        System.out.print("Enter radius of circle:");
        Scanner sc= new Scanner(System.in);
        double radius=sc.nextDouble();
        double area=3.14*radius*radius;
        System.out.print("Area of cicle is:");
        System.out.println(area);
        double per=2*3.14*radius;
        System.out.print("Perimeter of circle is:");
        System.out.println(per);
        sc.close();
    }
    
}
