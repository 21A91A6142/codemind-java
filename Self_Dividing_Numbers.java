import java.util.*;
class Self
{
    static boolean isself(int k)
    {
        int l,r,q,c=0,a;
        a=k;
        q=k;
        l=(int)Math.log10(k)+1;
        while(q!=0)
        {
            r=q%10;
            if(r!=0)
            {
                if(a%r==0)
                {
                    c=c+1;
                }
            }
            q=q/10;
        }
        if(c==l)
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
        int a,b,i;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=a;i<=b;i++)
        {
            if(isself(i))
            {
                System.out.print(i+" ");
            }
        }
    }
}