import java.util.Scanner;
class number
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int n,i,c=0,x=0,y=0,d;
    n=sc.nextInt();
    for(i=2;i<n;i++)
    {
        if(n%i==0)
        {
            c++;
        }
    }
    if(c==0)
    {
        while(n>0)
        {
            d=n%10;
            for(i=2;i<d;i++)
            {
                if(d%i==0)
                {
                    x++;
                }
            }
            if(d==1)
            {
                y++;
            }
            n=n/10;
        }
    }
    if(c==0 && x==0 && y==0)
    {
        System.out.println("Mega Prime");
    }
    else
    {
        System.out.println("Not Mega Prime");
    }
}
}