import java.util.*;
class Last
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j=0,k=0;
        n=sc.nextInt();
        int [] a=new int[n];
        int [] b=new int[100];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(a[i]%2!=0)
            {
                b[j]=i;
                j+=1;
            }
        }
        for(i=0;i<j;i++)
        {
            if(k<b[i])
            {
                k=b[i];
            }
        }
        System.out.print(k);
    }
}