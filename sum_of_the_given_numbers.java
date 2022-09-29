import java.util.Scanner;
class number
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,n,k,arr[][];
        n=sc.nextInt();
        arr=new int[100][100];
        for(i=0;i<n;i++)
        {
            for(j=0;j<2;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<n;i++)
        {
            k=0;
            for(j=0;j<2;j++)
            {
                k=k+arr[i][j];
            }
            System.out.println(k);
        }
    }
}