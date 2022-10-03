import java.util.Scanner;
class name
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
    int n,temp=0,d,c=0,s=0;
    n=sc.nextInt();
    temp=n;
    while(n!=0)
    {
        d=n%10;
        n=n/10;
        c++;
    }
    n=temp;
    while(temp!=0)
    {
        d=temp%10;
        temp=temp/10;
        s=s+(int)Math.pow(d,c);
        c--;
    }
    if(s==n)
    {
        System.out.println("True");
    }
    else
    {
        System.out.println("False");
    }
    }
}