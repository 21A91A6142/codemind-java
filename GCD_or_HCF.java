import java.util.*;
class Gcd
{
    public static void main(String args[])
    {
        int a,b,c,i;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=a>b?a:b;
        for(i=c;i>0;i--)
        {
            if(a%i==0 && b%i==0)
            {
                System.out.print(i);
                break;
            }
        }
    }
}