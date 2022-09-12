import java.util.Scanner;
class Sum
{
    public static void main(String args[])
    {
        int n,b,i,s=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            b=sc.nextInt();
            s=s+b;
        }
        System.out.println(s);
    }
}