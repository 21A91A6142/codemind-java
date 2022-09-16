import java.util.*;
class Amicable
{
    public static void main(String args[])
    {
        int a,b,s1=0,s2=0,i,j;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=1;i<a;i++)
        {
            if(a%i==0)
            {
                s1=s1+i;
            }
        }
        for(j=1;j<b;j++)
        {
            if(b%j==0)
            {
                s2=s2+j;
            }
        }
        if(s1==b && s2==a)
        {
            System.out.print("Amicable");
        }
        else
        {
            System.out.print("Not Amicable");
        }
    }
}