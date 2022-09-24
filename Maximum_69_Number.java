import java.util.*;
class Max
{
    public static void main(String args[])
    {
        int n,n1=0,q,r,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int [] a=new int[100];
        q=n;
        while(q!=0)
        {
            r=q%10;
            a[n1]=r;
            n1=n1+1;
            q=q/10;
        }
        for(i=n1-1;i>=0;i--)
        {
            if(a[i]==6)
            {
                a[i]=9;
                break;
            }
        }
        for(i=n1-1;i>=0;i--)
        {
            System.out.print(a[i]);
        }
    }
}