import java.util.*;
class nearestprime
{
    static boolean isprime(int k)
    {
        boolean p=true;
        for(int i=2;i<=k/2;i++)
        {
            if(k%i==0)
            {
                p=false;
                break;
            }
        }
        return p;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int a=sc.nextInt();
            int m,k;
            int p=a;
            while(true)
            {
                a=a-1;
                if(isprime(a) && a>1)
                {
                    k=a;
                    break;
                }
            }
            while(true)
            {
                a=a+1;
                if(isprime(a))
                {
                    m=a;
                    break;
                }
            }
            if(m-p<p-k)
            {
                System.out.println(m);
            }
            else
            {
                System.out.println(k);
            }
        }
    }
}