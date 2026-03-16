
import java.util.Scanner;

public class Mult 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your first number");
        int x=sc.nextInt();
        System.out.println("Enter your second number");
        int y=sc.nextInt();
        int res=x*y;
        System.out.println("Result of multiplication is"+res);
    }
}
