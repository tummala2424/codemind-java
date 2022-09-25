import java.util.Scanner;
class classname
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m,c=0;
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            m=sc.nextInt();
            if(m%2!=0)
            {
                c+=1;
            }
        }
        if(c<=2)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
        sc.close();
    }
}