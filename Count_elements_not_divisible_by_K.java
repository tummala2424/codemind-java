import java.util.Scanner;
class k
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x[],n,m,c=0,i;
        n=sc.nextInt();
        m=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(x[i]%m!=0)
            {
                c+=1;
            }
        }
        System.out.println(c);
    }
}