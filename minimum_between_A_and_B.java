import java.util.*;
import java.util.ArrayList;
class Elements
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<Integer>();
        int n=sc.nextInt();
        int [] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            //System.out.print((a[i])+" ");
        }
        int k=sc.nextInt();
        int l=sc.nextInt();
        //System.out.println(k+"---"+l);
        int m=0,g=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]>=k && a[i]<=l)
            {
                list.add(a[i]);
            }
        }
        int h=list.size();
        if(h<1)
        {
            System.out.print("-1");
        }
        else
        {
            System.out.print(Collections.min(list));
        }
    }
}