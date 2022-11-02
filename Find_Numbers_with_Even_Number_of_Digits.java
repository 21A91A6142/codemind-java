import java.util.*;
class evendidgit
{
    static boolean iseven(int k)
    {
        int r,q,s=0;
        q=k;
        while(q!=0)
        {
            r=q%10;
            s=s+1;
            q=q/10;
        }
        if(s%2==0)
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
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        int []a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(iseven(a[i]))
            {
                c=c+1;
            }
        }
        System.out.print(c);
    }
}