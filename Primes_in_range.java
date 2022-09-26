import java.util.Scanner;
class prime
{
    public static boolean isprime(int a)
    {
        int i;
        if(a<2)
           return false;
        for(i=2;i<=(int)Math.sqrt(a);i++)
        {
            if(a%i==0)
               return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        int a,b,c=0;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        for(int i=a;i<=b;i++)
        {
            if(isprime(i))
            {
                c+=1;
            }
        }
        System.out.println(c);
    }
}