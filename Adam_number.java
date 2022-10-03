import java.util.Scanner;
class number
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int n,k,d,s=0,x,add=0,temp=0,r;
    n=sc.nextInt();
    temp=n;
    while(n!=0)
    {
        d=n%10;
        n=n/10;
        s=s*10+d;
    }
    k=temp*temp;
    x=s*s;
    while(x!=0)
    {
        r=x%10;
        x=x/10;
        add=add*10+r;
    }
    if(k==add)
    {
        System.out.println("True");
    }
    else
    {
        System.out.println("False");
    }
    }
}