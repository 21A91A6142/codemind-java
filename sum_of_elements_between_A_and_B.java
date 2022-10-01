import java.util.*;
class Sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,b,c,k=0,j=0,s=0;
        n=sc.nextInt();
        int [] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            //System.out.print(a[i]+" ");
        }
        b=sc.nextInt();
        c=sc.nextInt();
        /*System.out.println(b+" ");
        System.out.println(c);*/
        for(i=0;i<n;i++)
        {
            if(a[i]>=b && a[i]<=c)
            {
                s=s+a[i];
            }
        }
        System.out.print(s);
    }
}