import java.util.*;
class npp
{
    static boolean isprime(int k1)
    {
        int i,c=0;
        for(i=2;i<=(int)Math.sqrt(k1);i++)
        {
            if(k1%i==0)
            {
                c=c+1;
            }
        }
        if(c==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    static boolean ispalan(int k)
    {
        int q,r,s=0;
        q=k;
        while(q!=0)
        {
            r=q%10;
            s=s*10+r;
            q=q/10;
        }
        if(s==k)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        while(true)
        {
            a=a+1;
            if(ispalan(a))
            {
                if(isprime(a))
                {
                    System.out.print(a);
                    break;
                }
            }
        }
    }
}