import java.util.*;
class Reverse
{
    public static void main(String args[])
    {
        int n,q,r,s=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        q=n;
        while(q!=0)
        {
            r=q%10;
            s=s*10+r;
            q=q/10;
        }
        System.out.println(s);
    }
}