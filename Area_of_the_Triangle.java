import java.util.Scanner;
class area
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int x,y,z;
        Double d,k;
        x=s.nextInt();
        y=s.nextInt();
        z=s.nextInt();
        d=(double)(x+y+z)/2;
        k=Math.sqrt(d*(d-x)*(d-y)*(d-z));
        System.out.format("%.2f",k);
    }
}