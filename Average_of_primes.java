import java.util.*;
class Averageofprimes
{
    static boolean isprime(int k)
    {
        int c=0,i;
        for(i=2;i<=(int)Math.sqrt(k);i++)
        {
            if(k%i==0)
            {
                c=c+1;
            }
        }
        if(c>0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=0;
        double c=0;
        int [] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(isprime(a[i]) && a[i]>1)
            {
                s=s+a[i];
                c=c+1.0;
            }
        }
        double f=s/c;
        System.out.format("%.2f",f);
    }
}