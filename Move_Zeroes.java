import java.util.*;
class moveZeros
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
            if(a[i]!=0)
            {
                l.add(a[i]);
            }
        }
        for(int i=0;i<n;i++)
        {
            if(a[i]==0)
            {
                l.add(a[i]);
            }
        }
        for(int i=0;i<l.size();i++)
        {
            System.out.print(l.get(i)+" ");
        }
        
    }
}