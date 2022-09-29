import java.util.Scanner;
class number
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m,c=0,i,j;
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=i;j<n;j++)
            {
                if(i*j==n)
                {
                    c+=1;
                    System.out.println(i+" "+j);
                }
            }
        }
        if(c==0)
        {
            System.out.print("-1");
        }
    }
}