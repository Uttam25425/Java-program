import java.util.Scanner;
public class AreaOfTriangle 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your base value");
        double b=sc.nextDouble();
        System.out.println("Enter your hight value");
        double h=sc.nextDouble();
        double res=(0.5*b*h);
        System.out.println("Area of triangle is" +res);

    }
}
