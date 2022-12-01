import java.util.*;
class maximum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> l=new ArrayList<>();
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            l.add(a[i]);
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int s=0;
                for(int k=i;k<j+1;k++)
                {
                    s+=a[k];
                }
                l.add(s);
            }
        }
        System.out.print(Collections.max(l));
    }
}