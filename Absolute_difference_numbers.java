import java.util.*;
class Adn
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
        int a,b,c,d,e,f;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=(int)Math.pow(10,b);
        d=a%c;
        e=ispalan(a);
        f=e%c;
        System.out.println(Math.abs(d-ispalan(f)));
    }
}