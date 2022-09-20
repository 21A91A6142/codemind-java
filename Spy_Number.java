import java.util.*;
class Spy
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,q,r,s=0,p=1;
        a=sc.nextInt();
        q=a;
        while(q!=0)
        {
            r=q%10;
            s=s+r;
            p=p*r;
            q=q/10;
        }
        if(s==p)
        {
            System.out.print("Spy Number");
        }
        else
        {
            System.out.print("Not Spy Number");
        }
    }
}