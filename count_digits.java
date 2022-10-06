import java.util.*;
class Count
{
    static int digicoun(int k)
    {
        int q=k,r,s=0;
        if(q==0)
        {
            s=1;
        }
        else
        {
            while(q!=0)
            {
                r=q%10;
                s=s+1;
                q=q/10;
            }
        }
        return s;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
           // System.out.print(a[i]+" ");
            System.out.print(digicoun(a[i])+" ");
        }
    }
}