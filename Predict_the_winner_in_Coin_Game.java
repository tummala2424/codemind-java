import java.util.Scanner;
class number
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x,y;
        x=sc.nextInt();
        y=sc.nextInt();
        if(x%2==0 || y%2==0)
        {
            System.out.println("Player 1");
        }
        else
        {
            System.out.println("Player 2");
        }
    }
}