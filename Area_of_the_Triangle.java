import java.util.Scanner;
class Triangle
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int x,y,z;
        Double d,a;
        x=s.nextInt();
        y=s.nextInt();
        z=s.nextInt();
        d=(double)(x+y+z)/2;
        a=Math.sqrt(d*(d-x)*(d-y)*(d-z));
        System.out.format("%.2f",a);
    }
}