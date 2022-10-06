import java.util.*;
class Count
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] a=new int[n];
        int c=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=1;i<n-1;i++)
        {
            if(a[i-1]%2==0 && a[i+1]%2==0)
            {
                if(a[i]%2!=0)
                {
                    c=c+1;
                }
            }
        }
        System.out.print(c);
    }
}