import java.util.Scanner;
class temperature
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float a,b;
        a=sc.nextInt();
        b=32+(a*9/5);
        System.out.printf("%.2f",b);
    }
}