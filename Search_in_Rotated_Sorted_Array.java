import java.util.Scanner;
class array
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n,c=0,k,arr[],d=0;
        arr=new int[100];
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        k=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(arr[i]==k)
            {
                c+=1;
                d=i;
            }
        }
        if(c>0)
        {
            System.out.println(d);
        }
        else
        {
            System.out.println("-1");
        }
    }
}
