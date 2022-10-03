import java.util.Scanner;
class number
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int a,b,gcd=0,lcm,i;
    a=sc.nextInt();
    b=sc.nextInt();
    for(i=1;i<=a && i<=b;i++)
    {
        if(a%i==0 && b%i==0)
        {
            gcd=i;
        }
    }
    lcm=(a*b)/gcd;
    System.out.println(lcm);
    }
}