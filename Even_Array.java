import java.util.*;
class evenArray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,c=0,n;
        n=sc.nextInt();
        int [] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]%2==0)
            {
                c=c+1;
            }
        }
        if(c==n)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}