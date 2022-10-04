import java.util.Scanner;
class number
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int i,n,sum=0;
    n=sc.nextInt();
    for(i=1;i<n;i++)
    {
        if(n%i==0)
        {
            sum=sum+i;
        }
    }
    if(n==sum)
    {
        System.out.println("True");
    }
    else
    {
        System.out.println("False");
    }
}
}