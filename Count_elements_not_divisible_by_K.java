import java.util.*;
class Count
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,k,c=0,i;
        n=sc.nextInt();
        k=sc.nextInt();
        int [] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]%k!=0)
            {
                c=c+1;
            }
        }
        System.out.print(c);
    }
}