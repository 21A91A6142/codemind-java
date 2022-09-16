import java.util.*;
class Sum
{
    public static void main(String args[])
    {
        int n,a,b,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            a=sc.nextInt();
            b=sc.nextInt();
            System.out.println(a+b);
        }
        sc.close();
    }
}