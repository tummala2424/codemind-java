import java.util.Scanner;
class array
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,arr[],i,j,c=0;
        n=sc.nextInt();
        arr=new int[100];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            c=0;
            for(j=0;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    c++;
                }
            }
            if(c>1)
            {
                System.out.println(arr[i]);
                break;
            }
        }
    }
}