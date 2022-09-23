import java.util.*;
class Array
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,s,avg,c=0;
        n=sc.nextInt();
        int [] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        s=a[0];
        for(i=0;i<n;i++)
        {
            if(s>a[i])
            {
                s=a[i];
            }
        }
        System.out.print(s);
        
        
    }
}