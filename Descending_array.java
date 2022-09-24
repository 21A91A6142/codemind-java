import java.util.*;
class Descending
{
    public static void main(String args[])
    {
        int n,i,c=0;
        int [] a=new int[100];
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n-1;i++)
        {
            if(a[i]<a[i+1])
            {
                c=c+1;
                break;
            }
        }
        if(c>0)
        {
            System.out.print("no");
        }
        else
        {
            System.out.print("yes");
        }
    }
}