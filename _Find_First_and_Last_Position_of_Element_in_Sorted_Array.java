import java.util.*;
class findfl
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> l=new ArrayList<>();
        int c=0,m=0;
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(a[i]==k)
            {
                l.add(i);
                c=c+1;
                break;
            }
        }
        if(c<1)
        {
            l.add(-1);
        }
        for(int i=n-1;i>=0;i--)
        {
            if(a[i]==k)
            {
                l.add(i);
                m=m+1;
                break;
            }
        }
        if(m<1)
        {
            l.add(-1);
        }
        for(int i=0;i<l.size();i++)
        {
            System.out.print(l.get(i)+" ");
        }
    }
}