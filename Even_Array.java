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
    for(i=0;i<n;i++)
    {
        if(arr[i]%2!=0)
        {
            count++;
            break;
        }
    }
    if(count==0)
    System.out.println("True");
    else
    System.out.println("False");
}
}