import java.util.Scanner;
class java
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[],i,j,n,c=0,k=0;
        arr=new int[100];
        n=sc.nextInt();
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
                    c+=1;
                }
            }
            if(c==1)
            {
                k+=1;
                System.out.print(arr[i]+" ");
            }
        }
        if(k==0)
        {
            System.out.println("-1");
        }
    }
}