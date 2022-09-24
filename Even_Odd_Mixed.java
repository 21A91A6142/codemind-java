import java.util.*;
class Edm
{
    public static void main(String args[])
    {
        int n,ec=0,oc=0,q,r,c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        q=n;
        while(q!=0)
        {
            r=q%10;
            c=c+1;
            if(r%2==0)
            {
                ec=ec+1;
            }
            else
            {
                oc=oc+1;
            }
            q=q/10;
        }
        if(c==ec)
        {
            System.out.print("Even");
        }
        else if(c==oc)
        {
            System.out.print("Odd");
        }
        else
        {
            System.out.print("Mixed");
        }
        
    }
}