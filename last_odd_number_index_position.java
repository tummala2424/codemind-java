import java.util.Scanner;
class number
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,c=0,arr[],i;
        n=sc.nextInt();
        arr=new int[100];
        for(i=1;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                c+=arr[i];
            }
        }
        System.out.println(i-1);
    }
}