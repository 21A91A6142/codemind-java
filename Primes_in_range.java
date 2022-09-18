import java.util.*;
class Primes
{
    static boolean isprime(int k)
    {
        int j,s=0;
        for(j=2;j<=(int)Math.sqrt(k);j++)
        {
            if(k%j==0)
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
    public static void main(String args[])
    {
        int a,b,c=0,i;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=a;i<=b;i++)
        {
            if(isprime(i) && i>1)
            {
                c=c+1;
            }
        }
        System.out.println(c);
    }
}