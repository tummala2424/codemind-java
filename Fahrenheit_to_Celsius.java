import java.util.Scanner;
class temperature
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float f;
        double c;
        f=sc.nextInt();
        c=(f-32)*5/9;
        System.out.printf("%.2f",c);
    }
}