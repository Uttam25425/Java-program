
import java.util.Scanner;

public class Add2
{
    public static void main(String[] args) 
    {
     Scanner SC = new Scanner(System.in);
     System.out.println("Enter your first number");
     int x = SC.nextInt();
     System.out.println("enter your second number");
     int y = SC.nextInt();
     int res=x+y;
     System.out.println("result of addition is "+res);

    }
}
