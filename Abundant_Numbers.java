import java.util.Scanner;
class number
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n,d,s=0;
        n=sc.nextInt();
        for(i=1;i<n;i++)
        {
            if(n%i==0)
            {
                s=s+i;
            }
        }
        if(s>n)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}