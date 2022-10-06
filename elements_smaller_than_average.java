import java.util.Scanner;
class number
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
    int i,n,max,sum=0,count=0;
    int avg;
    n=sc.nextInt();
    int arr[];
    arr=new int[100];
    for(i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    for(i=0;i<n;i++)
    {
        sum=sum+arr[i];
    }
    avg=(sum/n);
    for(i=0;i<n;i++)
    {
        if(arr[i]<=avg)
        count++;
    }
    System.out.println(count);
}
}
