import java.util.Scanner;
class numbers
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,arr[],k=0,m;
        n=sc.nextInt();
        arr=new int[100];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        m=sc.nextInt();
        {
            for(i=0;i<n;i++)
            {
                if(arr[i]==m)
                {
                    k++;
                }
            }
        }
        System.out.println(k);
    }
}