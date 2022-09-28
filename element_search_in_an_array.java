import java.util.Scanner;
class number
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[],i,j,flag=0,n;
        n=sc.nextInt();
        arr=new int[100];
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        j=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(arr[i]==j)
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}