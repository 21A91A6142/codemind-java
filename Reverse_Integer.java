import java.util.*;
class Reverse
{
    static int ispalan(int k)
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
        Scanner sc=new Scanner(System.in);
        int a;
        a=sc.nextInt();
        if(a<0)
        {
            a=a*-1;
            System.out.print("-"+ispalan(a));
        }
        else
        {
            System.out.print(ispalan(a));
        }
    }
}