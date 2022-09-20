import java.util.*;
class Circular
{
    static boolean isprime(int k)
    {
        int i,c=0;
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
    static int ispalan(int a)
    {
        int q,r,s=0;
        q=a;
        while(q!=0)
        {
            r=q%10;
            s=s*10+r;
            q=q/10;
        }
        return s;
    }
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(isprime(n) && n>1)
        {
            if(isprime(ispalan(n)))
            {
                System.out.print("circular prime");
            }
            else
            {
                System.out.print("prime but not a circular prime");
            }
        }
        else
        {
            System.out.print("not prime");
        }
    }
}