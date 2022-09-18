import java.util.*;
class Counting
{
    static boolean ispretty(int k)
    {
        int l;
        l=k%10;
        if(l==2 || l==3 || l==9)
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
        int a,b,c,s=0,i,j;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        for(i=0;i<a;i++)
        {
            b=sc.nextInt();
            c=sc.nextInt();
            s=0;
            for(j=b;j<=c;j++)
            {
                if(ispretty(j))
                {
                    s=s+1;
                }
            }
            System.out.println(s);
        }
    }
}