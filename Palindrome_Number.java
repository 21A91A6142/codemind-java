import java.util.*;
class palin
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
        Scanner sc=new Scanner(System.in);
        int n,c=0,i,a;
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            a=sc.nextInt();
            if(ispalan(a) && a>0)
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }
        }
        
    }
}