import java.util.Scanner;
class number
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,temp,d,s=0,k=1;
        n=sc.nextInt();
        temp=n;
        while(n!=0)
        {
            d=n%10;
            n=n/10;
            s=s+d;
        }
        while(temp!=0)
        {
            d=temp%10;
            temp=temp/10;
            k=k*d;
        }
        if(k==s)
        {
            System.out.println("Spy Number");
        }
        else
        {
            System.out.println("Not Spy Number");
        }
    }
}