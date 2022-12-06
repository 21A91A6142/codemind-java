import java.util.*;
class Halflist
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=n-1;i>=(n/2);i--)
        {
            System.out.print(a[i]+" ");
        }
        for(int i=0;i<n/2;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}