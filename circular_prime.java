import java.util.Scanner;
class number
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int n,c=0,rev=0,i,d=0;
    n=sc.nextInt();
    for(i=1;i<=n;i++)
    {
        if(n%i==0)
        {
            c++;
        }
    }
    if(c==2)
    {
        rev=0;
        while(n!=0)
        {
            d=n%10;
            n=n/10;
            rev=(rev*10)+d;
        }
        c=0;
        for(i=1;i<=rev;i++)
        {
            if(rev%i==0)
            {
                c++;
            }
        }
        if(c==2)
        {
            System.out.println("circular prime");
        }
        else
        {
            System.out.println("prime but not a circular prime");
        }
    }
    else
    {
        System.out.println("not prime");
    }
}
}