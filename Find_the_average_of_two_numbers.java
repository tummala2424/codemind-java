import java.util.Scanner;
class average
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        float c;
        c=(float)(a+b)/2;
        System.out.format("%.4f",c);
    }
}