import java.util.*;
class Generate
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
        int a,b,i;
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=a;i<b;i++)
        {
            if(isprime(i) && i>1)
            {
                System.out.println(i);
            }
        }
    }
}