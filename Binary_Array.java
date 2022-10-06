import java.util.*;
class Strictly
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int s=0;
        int n=sc.nextInt();
        int [] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]==0 || a[i]==1)
            {
                s=s+1;
            }
        }
        if(s==n)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
        
    }
}