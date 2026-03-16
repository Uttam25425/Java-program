import java.util.Scanner;
public class Squareroot 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int num=sc.nextInt();
        double res=Math.sqrt(num);
        System.out.println("Squarerroot of a given number is"+res);

    }
}
