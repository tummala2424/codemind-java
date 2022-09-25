import java.util.Scanner;
class robber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t,s,b;
        t=sc.nextInt();
        s=sc.nextInt();
        b=sc.nextInt();
        System.out.println(t*2*s*b*512);
    }
}