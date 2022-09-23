import java.util.*;
class Last
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,b,c=0;
        n=sc.nextInt();
        int [] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        b=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(a[i]==b)
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