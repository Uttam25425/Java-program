import java.util.Scanner;
public class DecimalToBinary
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your decimal value");
        int num=sc.nextInt();
        String res=Integer.toBinaryString(num);
        System.out.println("Result in binary is"+res);
    }
}
