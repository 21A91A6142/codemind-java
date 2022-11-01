import java.util.*;
class HMNASTTCN
{
    static int less(int k,int a[])
    {
        int c=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=k)
            {
                if(a[i]<k)
                {
                    c=c+1;
                }
            }
        }
        return c;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(less(a[i],a)+" ");
        }
    }
}