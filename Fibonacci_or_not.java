import java.util.*;
class Fib
{
    public static void main(String args[])
    {
        int a,n1=0,n2=1,i,n3,c=0;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        for(i=2;i<a;i++)
        {
            n3=n1+n2;
            if(n3==a)
            {
                c=c+1;
                break;
            }
            n1=n2;
            n2=n3;
        }
        if(c==1)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}