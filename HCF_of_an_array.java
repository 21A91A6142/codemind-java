import java.util.*;
class arrayhcf
{
    static int ishcf(int k,int a[])
    {
        int c=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%k==0)
            {
                c=c+1;
            }
        }
        return c;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max=-1;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=1;i<=max/2;i++)
        {
            if(max%i==0)
            {
                if(ishcf(i,a)==n)
                {
                    l.add(i);
                }
            }
        }
        System.out.print(Collections.max(l));
    }
}