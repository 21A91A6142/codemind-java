import java.util.*;
class Adam
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
        int a,b,c,d;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=(int)Math.pow(a,2);
        c=ispalan(a);
        d=(int)Math.pow(c,2);
        if(b==ispalan(d))
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}