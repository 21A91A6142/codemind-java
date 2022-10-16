import java.util.*;
import java.util.ArrayList;
class Unique
{
    static int isunique(int k,int a[])
    {
        int c=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==k)
            {
                c=c+1;
            }
        }
        return c;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<Integer>();
        Set<Integer> slist=new HashSet<Integer>();
        int n=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            slist.add(a[i]);
        }
        //System.out.print(list);
        int f,c=0;
        for(int i:slist)
        {
            if(i%2!=0)
            {
                c=c+i;
            }
        }
        System.out.print(c);
    }
}