import java.util.Scanner;
class number
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,d,s=0,i;
        n=sc.nextInt();
        while(n!=0)
        {
            d=n%10;
            n=n/10;
            s=s*10+d;
        }
        System.out.println(s);
    }
}