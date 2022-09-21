import java.util.*;
class Strong
{
    static int isstrong(int k)
    {
        int l=1,j;
        for(j=1;j<=k;j++)
        {
            l*=j;
        }
        return l;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,q,r,s=0;
        a=sc.nextInt();
        q=a;
        while(q!=0)
        {
            r=q%10;
            s+=isstrong(r);
            //System.out.print(isstrong(r)+" ");
            q=q/10;
        }
        if(s==a)
        {
            System.out.print("The number "+s+" is a strong number");
        }
        else
        {
            System.out.print("The number "+a+" is not a strong number");
        }
    }
}