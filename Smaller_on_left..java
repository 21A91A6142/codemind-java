import java.util.*;
class smaller
{
    static int smallerthan(int k,int a[],int n)
    {
        int m=-1;
        for(int i=n-1;i>=0;i--)
        {
            if(a[i]<k)
            {
                m=a[i];
                break;
            }
        }
        return m;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.print("-1"+" ");
        for(int i=1;i<n;i++)
        {
            System.out.print(smallerthan(a[i],a,i)+" ");
        }
    }
}