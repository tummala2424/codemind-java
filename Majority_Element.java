import java.util.Scanner;
class array
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,n,arr[],c=0;
        n=sc.nextInt();
        arr=new int[100];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            c=0;
            for(j=i;j<n;j++)
            {
                if(arr[j]==arr[i])
                {
                    c++;
                }
            }
            if(c>n/2)
            {
                System.out.println(arr[i]);
                
                break;
            }
        }
    }
}