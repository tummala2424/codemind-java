import java.util.Scanner;
class reverse
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int d,n,temp,c=0;
        n=sc.nextInt();
        temp=n;
        while(n!=0)
        {
            d=n%10;
            n=n/10;
            if(d==0)
            {
                continue;
            }
            c=c*10+d;
        }
        System.out.println(c);
    }
}