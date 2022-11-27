import java.util.*;
class unique
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> l=new ArrayList<>();
        ArrayList<Integer> l1=new ArrayList<>();
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            l.add(a[i]);
        }
        for(int i=0;i<l.size();i++)
        {
            int k=l.get(i);
            if(Collections.frequency(l,k)==1)
            {
                l1.add(k);
            }
        }
        if(l1.size()>0)
        {
            System.out.print(Collections.max(l1));
        }
        else
        {
            System.out.print("-1");
        }
    }
}