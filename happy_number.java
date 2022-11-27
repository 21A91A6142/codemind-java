import java.util.*;
class happy
{
    static int happi(int k)
    {
        int r,q=k,s=0;
        while(q!=0)
        {
            r=q%10;
            s=s+r*r;
            q=q/10;
        }
        if(s<=9)
        {
            return s;
        }
        else
        {
            return happi(s);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(happi(n)==1 || happi(n)==7)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}