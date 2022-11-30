import java.util.*;
class missing
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            ArrayList<Integer> l=new ArrayList<>();
            int n=sc.nextInt();
            int a[]=new int[n];
            for(int j=0;j<n-1;j++)
            {
                a[j]=sc.nextInt();
               // System.out.print(a[j]+" ");
                l.add(a[j]);
            }
            //System.out.println(" ");
            for(int k=1;k<=n;k++)
            {
                if(l.contains(k))
                {
                    continue;
                }
                else
                {
                    System.out.println(k);
                    break;
                }
            }
        }
    }
}