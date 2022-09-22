import java.util.*;
class battle
{
    static boolean isprime(int k)
    {
        int c=0,j;
        for(j=2;j<=(int)Math.sqrt(k);j++)
        {
            if(k%j==0)
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
        int a,b,c,i;
        a=sc.nextInt();
        b=sc.nextInt();
        c=a+b;
        for(i=1;i<=10;i++)
        {
            if(isprime(c+i) && c>1)
            {
                System.out.print(i);
                break;
            }
        }
    }
}