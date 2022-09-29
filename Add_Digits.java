import java.util.*;
class happy
{
    public static int isdigit(int k)
    {
        int q,r,s=0,m;
        q=k;
        while(q!=0)
        {
            r=q%10;
            s=s+r;
            q=q/10;
        }
        if(s<10)
        {
            return s;
        }
        else
        {
            m=isdigit(s);
            return m;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a;
        a=sc.nextInt();
        System.out.print(isdigit(a));
    }
}