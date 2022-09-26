import java.util.Scanner;
class series
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        float m=0;
        n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
             m=m+((float)1/i);
        }
        System.out.format("%.2f",m);
    }
}