import java.util.Scanner;
public class AverageMark 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your mark for math");
        int m1=sc.nextInt();
        System.out.println("Enter your mark for science");
        int m2=sc.nextInt();
        System.out.println("Enter your mark for English");
        int m3=sc.nextInt();
        System.out.println("Enter your mark for hindi");
        int m4=sc.nextInt();
        System.out.println("Enter your mark for social science");
        int m5=sc.nextInt();
        double avg=(double)(m1+m2+m3+m4+m5)/5;
        System.out.println("Average mark of a student is"+avg);
    }
}
