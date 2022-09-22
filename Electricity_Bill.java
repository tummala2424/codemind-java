import java.util.Scanner;
class java
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        String a,b;
        int c;
        float x,y,z;
        a=sc.nextLine();
        b=sc.nextLine();
        c=sc.nextInt();
        if(c<200)
        {
            x=c*1.2f;
        }
        else if(c>=200 && c<400)
        {
            x=c*1.5f;
        }
        else if(c>=400 && c<600)
        {
            x=c*1.8f;
        }
        else
        {
            x=c*2f;
        }
        if(x<400)
        {
            System.out.format("%.2f",x+100);
        }
        else
        {
            y=((float)(x*15)/100);
            z=x+y;
            System.out.format("%.2f",z);
        }
    }
}