import java.util.Scanner;
class number
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int n,k=0,d=0,l=0,m=0,s=0,x=0,a=0;
    n=sc.nextInt();
    while(n>0)
    {
        d=n%10;
        n=n/10;
        k=k+d;
    }
    while(k>0)
    {
        l=k%10;
        k=k/10;
        m=m+l;
        a++;
    }
    if(a==2)
    {
        while(m>0)
        {
            s=m%10;
            m=m/10;
            x=x+s;
        }
        System.out.println(x);
    }
    else
    {
        System.out.println(m);
    }
}
}