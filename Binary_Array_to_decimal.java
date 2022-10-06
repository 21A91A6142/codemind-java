import java.util.*;
class Strictly
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int s=0;
        int n=sc.nextInt();
        int [] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int l=a.length;
        for(int i=0;i<n;i++)
        {
            s+=(a[i])*((int)Math.pow(2,l-1));
            l=l-1;
        }
        System.out.print(s);
    }
}