import java.util.Scanner;
class number
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n;
        float k,d=0;
        n=sc.nextInt();
        d=(float)Math.sqrt(n);
        k=d;
        if((int)k==d)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}