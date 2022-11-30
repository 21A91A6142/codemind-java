import java.util.*;
class search
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]==k)
            {
                System.out.print(i);
                c=c+1;
                break;
            }
        }
        if(c==0)
        {
            System.out.print("-1");
        }
    }
}