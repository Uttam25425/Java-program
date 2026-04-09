import java.util.Scanner;
public class DecimalToOctal 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your decimal value");
        int num=sc.nextInt();
        String res=Integer.toOctalString(num);
        System.out.println("Result in Octal is "+res);

    }
}
