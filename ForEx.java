import java.util.Scanner;
public class ForEx 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE END VALUE");
        int num=sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            if (i%2==0)
            {
                System.out.println(i*(-1));
            }
            else
            {
                System.out.println(i);
            }
        }


    }
}
