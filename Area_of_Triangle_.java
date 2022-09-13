import java.util.Scanner;
class j
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        Double d,k;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=(double)(a+b+c)/2;
        k=Math.sqrt(d*(d-a)*(d-b)*(d-c));
        System.out.format("%.2f",k);
    }
}