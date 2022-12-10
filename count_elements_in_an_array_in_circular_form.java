import java.util.*;
class count
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int c=0;
        for(int i=0;i<n-2;i++)
        {
            if((a[i]%2==0 && a[i+2]%2!=0) || (a[i]%2!=0 && a[i+2]%2==0))
            {
                c=c+1;
            }
        }
        if((a[0]%2==0 && a[n-2]%2!=0) || (a[0]%2!=0 && a[n-2]%2==0))
        {
            c=c+1;
        }
        if((a[1]%2==0 && a[n-1]%2!=0) || (a[1]%2!=0 && a[n-1]%2==0))
        {
            c=c+1;
        }
        System.out.print(c);
    }
}