import java.util.Scanner;
class d
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a[],x,c=0,i,j;
        n=sc.nextInt();
        x=sc.nextInt();
        a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(a[i]%x==0)
            {
                c+=1;
            }
        }
        System.out.println(c);
    }
}