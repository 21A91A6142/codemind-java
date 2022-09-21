import java.util.*;
class Count
{
    public static void main(String args[])
    {
        int l,r,k,c=0,i;
        Scanner sc=new Scanner(System.in);
        l=sc.nextInt();
        r=sc.nextInt();
        k=sc.nextInt();
        for(i=l;i<=r;i++)
        {
            if(i%k==0)
            {
                c=c+1;
            }
        }
        System.out.print(c);
    }
}