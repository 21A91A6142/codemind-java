import java.util.*;
class Mega
{
    static boolean isprime(int k)
    {
        int i,s=0;
        if(k>1)
        {
            for(i=2;i<=(int)Math.sqrt(k);i++)
            {
                if(k%i==0)
                {
                    s=s+1;
                }
            }
            if(s==0)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        int n,r,q,c=0,m=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(isprime(n))
        {
            q=n;
            while(q!=0)
            {
                r=q%10;
                m=m+1;
                if(isprime(r))
                {
                    c=c+1;
                }
                q=q/10;
            }
            if(c==m)
            {
                System.out.print("Mega Prime");
            }
            else
            {
                System.out.print("Not Mega Prime");
            }
        }
        else
        {
            System.out.print("Not Mega Prime");
        }
        
    }
}