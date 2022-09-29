import java.util.Scanner;
class number
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,d,c=0;
        n=sc.nextInt();
        while(n!=0)
        {
            d=n%10;
            n=n/10;
            if(c<d)
            {
                c=d;
            }
        }
        System.out.println(c);
    }
}