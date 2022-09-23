import java.util.*;
class Array
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,s=0,avg,c=0;
        n=sc.nextInt();
        int [] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            s=s+a[i];
        }
        avg=s/n;
        for(i=0;i<n;i++)
        {
            if(a[i]==avg)
            {
                c=c+1;
            }
        }
        if(c>0)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
        
        
    }
}