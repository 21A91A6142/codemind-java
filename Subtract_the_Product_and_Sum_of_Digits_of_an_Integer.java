import java.util.*;
class Sub
{
    public static void main(String args[])
    {
        int a,r,q,s=0,m=1;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        q=a;
        while(q!=0)
        {
            r=q%10;
            s=s+r;
            m=m*r;
            q=q/10;
        }
        System.out.print(m-s);
        
    }
}