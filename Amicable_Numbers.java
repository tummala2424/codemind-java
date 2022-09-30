import java.util.Scanner;
class number
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int a,b,k=0,l=0,s=0,s1=0,i,j;
    a=sc.nextInt();
    b=sc.nextInt();
    l=a;
    k=b;
    for(i=1;i<=a/2;i++)
    {
        if(a%i==0)
        {
            s=s+i;
        }
    }
    for(j=1;j<=b/2;j++)
    {
        if(b%j==0)
        {
            s1=s1+j;
        }
    }
    if(a==s1 && b==s)
    {
        System.out.println("Amicable");
    }
    else
    {
        System.out.println("Not Amicable");
    }
}
}
    