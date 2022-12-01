import java.util.*;
class optimal
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            ArrayList<Integer> l=new ArrayList<>();
            int a[]=new int[n];
            for(int j=0;j<n;j++)
            {
                a[j]=sc.nextInt();
                l.add(a[j]);
            }
            int k=Collections.max(l);
            int m=Collections.min(l);
            int c=0;
            for(int j=0;j<n-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    c=c+1;
                    break;
                }
            }
            if(c==0)
            {
                System.out.println("0");
            }
            else
            {
                System.out.println(k-m);
            }
        }
        
    }
}