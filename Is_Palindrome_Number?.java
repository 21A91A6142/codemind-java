import java.util.*;
class Ipn
{
    static boolean ispalan(int k)
    {
        int r,q,s=0;
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
        if(ispalan(a))
        {
            System.out.print("2");
        }
        else
        {
            System.out.print("1");
        }
    }
}