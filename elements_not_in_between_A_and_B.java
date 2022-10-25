import java.util.*;
import java.util.ArrayList;
class sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> a1=new ArrayList<>();
        int n=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int t=sc.nextInt();
        int r=sc.nextInt();
        int k,l,c=0;
        if(t>r)
        {
            k=t;
            l=r;
        }
        else
        {
            k=r;
            l=t;
        }
        for(int i=0;i<n;i++)
        {
            if((a[i]<k && a[i]<l)||(a[i]>k && a[i]>l))
            {
                a1.add(a[i]);
            }
        }
        if(a1.size()==0)
        {
            System.out.print("-1");
        }
        else
        {
            for(int i=0;i<a1.size();i++)
            {
                System.out.print(a1.get(i)+" ");
            }
        }
        //System.out.print(a1);
    }
}