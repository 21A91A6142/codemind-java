import java.util.*;
class Cp
{
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
        int a,b,c,d,e;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        d=a;
        e=a;
        while(true)
        {
            a=a+1;
            if(ispalan(a))
            {
                b=a;
                break;
            }
        }
        while(true)
        {
            d=d-1;
            if(ispalan(d))
            {
                c=d;
                break;
            }
        }
        //System.out.print(b+" "+c);
        if((int)Math.abs(e-c)>(int)Math.abs(e-b))
        {
            System.out.print(b);
        }
        else if((int)Math.abs(e-c)==(int)Math.abs(e-b))
        {
            System.out.print(c+" "+b);
        }
        else
        {
            System.out.print(c);
        }
    }
}