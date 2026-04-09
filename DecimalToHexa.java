import java.util.Scanner;
public class DecimalToHexa 
{
    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter your decimal value");
       int num=sc.nextInt();
       String res=Integer.toHexString(num);
       System.out.println("result in hexadecimal is"+res);


    }
}
