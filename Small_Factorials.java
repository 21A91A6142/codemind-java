import java.util.*;
class Small
{
    static int isfact(int k)
    {
        int m=1;
        for(int j=1;j<=k;j++)
        {
            m=m*j;
        }
        return m;
    }
    public static void main(String args[])
    {
        int n,a,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            a=sc.nextInt();
            System.out.println(isfact(a));
        }
    }
}