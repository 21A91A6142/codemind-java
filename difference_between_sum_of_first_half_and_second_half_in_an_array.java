import java.util.*;
class Strictly
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int s=0,s1=0;
        int n=sc.nextInt();
        int [] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n/2;i++)
        {
            s+=a[i];
        }
        for(int i=(n/2);i<n;i++)
        {
            s1+=a[i];
        }
        System.out.println(Math.abs(s-s1));
        //System.out.println(s1);
    }
}