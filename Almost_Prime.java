import java.util.*;
class almostprime
{
    static boolean isprime(int k)
    {
        boolean p=true;
        for(int i=2;i<=(int)Math.sqrt(k);i++)
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
            int m=sc.nextInt();
            int k,c=0;
            for(int j=2;j<m;j++)
            {
                if(m%j==0 && isprime(j))
                {
                    k=m/j;
                    if(isprime(k) && k!=j)
                    {
                        c=c+1;
                        break;
                    }
                }
            }
            if(c>0)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}