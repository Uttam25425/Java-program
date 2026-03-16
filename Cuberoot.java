import java.util.Scanner;
public class Cuberoot 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int num=sc.nextInt();
        double res=Math.cbrt(num);
        System.out.println("Cube of a given number is"+res);

    }
}
