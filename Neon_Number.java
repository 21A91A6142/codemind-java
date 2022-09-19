import java.util.*;
class Neon
{
    static int neon(int k)
    {
        int q,r,s=0;
        q=k;
        while(q!=0)
        {
            r=q%10;
            s=s+r;
            q=q/10;
        }
        return s;
    }
    public static void main(String args[])
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=a*a;
        c=neon(b);
        if(c==a)
        {
            System.out.print("Neon Number");
        }
        else
        {
            System.out.print("Not Neon Number");
        }
        
    }
}