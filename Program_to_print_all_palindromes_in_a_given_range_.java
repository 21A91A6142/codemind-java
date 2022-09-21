import java.util.*;
class Palin
{
    static boolean ispalin(int k)
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
        int a,b,i;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=a;i<=b;i++)
        {
            if(ispalin(i))
            {
                System.out.print(i+" ");
            }
        }
    }
}