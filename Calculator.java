import java.util.Scanner;
public class Calculator
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your first number" );
        int n1=sc.nextInt();
        System.out.println("enter your second number");
        int n2=sc.nextInt();
        System.out.println("enter your symbol to perform operation like +,-,*,/");
        char symbol=sc.next().charAt(0);
        if (symbol=='+')
            System.out.println("result of addition is"+(n1+n2));
        else if (symbol=='-')
            System.out.println("result of subtraction is"+(n1-n2));
        else if (symbol=='*')
            System.out.println("rsult of multiplication is"+(n1*n2));
        else if(symbol=='/')
            System.out.println("result of divion is"+(n1/n2));
        else
            System.out.println("invalid input");

    }
}