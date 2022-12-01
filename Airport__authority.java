import java.util.*;
class Airport
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int a[]=new int[t];
        for(int i=0;i<t;i++)
        {
            a[i]=sc.nextInt();
        }
        int n=sc.nextInt();
        int c=0;
        for(int i=0;i<t;i++)
        {
            if(a[i]<=n)
            {
                c=c+1;
            }
            else
            {
                c=c+2;
            }
        }
        System.out.print(c);
    }
}