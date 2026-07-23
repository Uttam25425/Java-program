import java.util.Scanner;
public class AverageMark 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your mark for math");
        double m1=sc.nextInt();
        System.out.println("Enter your mark for science");
        double m2=sc.nextInt();
        System.out.println("Enter your mark for English");
        double m3=sc.nextInt();
        System.out.println("Enter your mark for hindi");
        double m4=sc.nextInt();
        System.out.println("Enter your mark for social science");
        double m5=sc.nextInt();
        double avg=(m1+m2+m3+m4+m5)/5;
        System.out.println("Average mark of a student is"+avg);
    }
}