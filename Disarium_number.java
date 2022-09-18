import java.util.Scanner;
class Ds
{
    public static void main(String args[])
    {
        int a,b,q,r;
        double s=0;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=(int)Math.log10(a)+(1);
        q=a;
        while(q!=0)
        {
            r=q%10;
            s=s+Math.pow(r,b);
            b=b-1;
            q=q/10;
        }
        if(a==(int)s)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}