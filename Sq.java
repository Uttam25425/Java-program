import java.util.Scanner;
public class Sq
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int num=sc.nextInt();
        int res=num*num;
        System.out.println("Square of a given number is "+res);

    }
}
