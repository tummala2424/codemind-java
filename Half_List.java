import java.util.Scanner;
class number
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int i,n,count=0,arr[];
    n=sc.nextInt();
    arr=new int[100];
    for(i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    for(i=n-1;i>=n/2;i--)
    {
        System.out.print(arr[i]+" ");
    }
    for(i=0;i<n/2;i++)
    {
        System.out.print(arr[i]+" ");
    }
    }
}