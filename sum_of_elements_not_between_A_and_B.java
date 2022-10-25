import java.util.*;
class sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
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
                c=c+a[i];
            }
        }
        System.out.print(c);
    }
}