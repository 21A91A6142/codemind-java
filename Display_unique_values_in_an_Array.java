import java.util.*;
class display
{
    static boolean isunique(int k,int a[])
    {
        boolean p=true;
        int c=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==k)
            {
                c=c+1;
            }
        }
        if(c==1)
        {
            return p;
        }
        else{
            p=false;
            return p;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> l=new ArrayList<>();
        int n=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(isunique(a[i],a))
            {
                l.add(a[i]);
            }
        }
        if(l.size()>0)
        {
            for(int i=0;i<l.size();i++)
            {
                System.out.print(l.get(i)+" ");
            }
        }
        else
        {
            System.out.print("-1");
        }
    }
}