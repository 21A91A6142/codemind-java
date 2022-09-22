import java.util.*;
class mini
{
    static boolean isprime(int h)
    {
        int c=0,i;
        for(i=2;i<=(int)Math.sqrt(h);i++)
        {
            if(h%i==0)
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
        int a,e,k,b,c;
        a=sc.nextInt();
        e=a;
        k=a;
        if(isprime(a))
        {
            System.out.print("0");
        }
        else
        {
            while(true)
            {
                a=a+1;
                if(isprime(a) && a>1)
                {
                    b=a;
                    break;
                }
            }
            while(true)
            {
               e=e-1;
               if(isprime(e) && e>1)
               {
                   c=e;
                   break;
               }
            }
            if((b-k)>(k-c))
            {
                System.out.print(k-c);
            }
            else
            {
                System.out.print(b-k);
            }
        }
    }
}