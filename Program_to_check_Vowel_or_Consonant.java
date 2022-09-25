import java.util.Scanner;
class alphabet
{
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
    int x;
    x=sc.nextLine().charAt(0);
    if(x=='A'||x=='a'||x=='E'||x=='e'||x=='I'||x=='i'||x=='O'||x=='o'||x=='U'||x=='u')
    {
        System.out.println("Vowel");
    }
    else
    {
        System.out.println("Consonant");
    }
    }
}