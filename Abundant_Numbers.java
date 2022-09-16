import java.util.*;
class Abundunt
{
    public static void main(String args[])
    {
        int n,s=0,i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1;i<=n/2;i++)
        {
            if(n%i==0)
            {
                s=s+i;
            }
        }
        if(s>n)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
        sc.close();
    }
}