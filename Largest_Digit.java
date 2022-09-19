import java.util.*;
class Lar
{
    public static void main(String args[])
    {
        int a,q,r,s=0;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        q=a;
        while(q!=0)
        {
            r=q%10;
            if(s<r)
            {
                s=r;
            }
            q=q/10;
        }
        System.out.print(s);
    }
}