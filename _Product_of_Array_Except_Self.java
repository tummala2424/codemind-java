import java.util.Scanner;
class array
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,n,arr[],pro=1;
        n=sc.nextInt();
        arr=new int[100];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            pro=1;
            for(j=0;j<n;j++)
            {
                if(i!=j)
                {
                    pro=pro*arr[j];
                }
            }
            System.out.print(pro+" ");
        }
    }
}