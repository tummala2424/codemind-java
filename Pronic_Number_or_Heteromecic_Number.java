import java.util.Scanner;
class number
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int n,k=0,i,j;
    n=sc.nextInt();
    for(i=0;i<n;i++)
    {
        if(i*(i+1)==n)
        {
            k++;
        }
    }
    if(k==1)
    {
        System.out.println("YES");
    }
    else
    {
        System.out.println("NO");
    }
}
}