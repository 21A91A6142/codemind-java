import java.util.*;
class Reverse
{
    static int reverse(int k)
    {
        int q,r,s=0;
        q=k;
        while(q!=0)
        {
            r=q%10;
            s=s*10+r;
            q=q/10;
        }
        return s;
    }
    public static void main(String args[])
    {
        int a,q,r,s=0,n;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        q=a;
        while(q!=0)
        {
            r=q%10;
            s=s*10+r;
            q=q/10;
        }
        n=a+s;
        while(true)
        {
            if(reverse(n)==n)
            {
                System.out.print(n);
                break;
            }
            else
            {
                n=n+reverse(n);
            }
        }
    }
}