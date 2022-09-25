import java.util.Scanner;
class season
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int s;
        s=sc.nextInt();
        if(s==2||s==3)
        {
            System.out.println("Spring");
        }
        else if(s==4||s==5||s==6)
        {
            System.out.println("Summer");
        }
        else if(s==7||s==8||s==9||s==10)
        {
            System.out.println("Rainy");
        }
        else if(s==1||s==11||s==12)
        {
            System.out.println("Winter");
        }
        else
        {
            System.out.println("-1");
        }
    }
}