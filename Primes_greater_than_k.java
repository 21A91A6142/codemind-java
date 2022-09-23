import java.util.*;
class Primesgk
{
    static boolean isprime(int k)
    {
        int i,c=0;
        if(k<=1)
        {
            return false;
        }
        else
        {
            for(i=2;i<=(int)Math.sqrt(k);i++)
            {
                if(k%i==0)
                {
                    c=c+1;
                }
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
        int n,i,b,c=0;
        n=sc.nextInt();
        int [] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        b=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(isprime(a[i]) && a[i]>1)
            {
                if(a[i]>=b)
                {
                    c=c+1;
                }
            }
        }
        System.out.print(c);
    }
}