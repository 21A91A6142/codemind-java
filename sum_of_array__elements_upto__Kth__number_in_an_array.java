import java.util.*;
class Kth
{
    public static void main(String args[])
    {
        int n,n1,i,c=0,s=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int [] a=new int[100];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        n1=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(a[i]==n1)
            {
                s=i;
                break;
            }
        }
        for(i=0;i<=s;i++)
        {
            c=c+a[i];
        }
        System.out.print(c);
    }
}