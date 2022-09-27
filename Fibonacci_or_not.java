import java.util.Scanner;
class number
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a=0,b=1,c,d=0;
        n=sc.nextInt();
        for(int i=0;i<n-2;i++)
        {
            c=a+b;
            a=b;
            b=c;
            if(c==n)
            {
                System.out.print("True");
                d+=1;
                break;
            }
        }
        if(d==0)
        {
            System.out.print("False");
        }
    }
}