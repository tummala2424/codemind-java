import java.util.Scanner;
class number
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int n,i,sum=0,temp;
    int res,rem;
    n=sc.nextInt();
    temp=n;
    while(n!=0)
    {
        i=1;
        res=1;
        rem=n%10;
        while(i<=rem)
        {
            res=res*i;
            i++;
        }
        sum=sum+res;
        n=n/10;
    }
    if(sum==temp)
    {
        System.out.println("The number "+temp+ " is a strong number");
    }
    else
    {
        System.out.println("The number "+temp+ " is not a strong number");
    }
    }
}