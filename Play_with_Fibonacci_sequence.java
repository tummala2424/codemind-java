import java.util.Scanner;
class fibonacci
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=0,b=1,i,c,n;
        n=sc.nextInt();
        c=a+b;
        System.out.print("0 ");
        for(i=1;i<n;i++)
        {
            System.out.print(c+" ");
            c=a+b;
            a=b;
            b=c;
            if(i==n)
            {
                break;
            }
        }
    }
}