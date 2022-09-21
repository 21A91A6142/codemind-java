import java.util.*;
class Countpalin
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
        int n,a,i,c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            a=sc.nextInt();
            if(ispalan(a))
            {
                c=c+1;
            }
        }
        System.out.print(c);
    }
}