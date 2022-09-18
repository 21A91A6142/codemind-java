import java.util.*;
class Fib
{
    public static void main(String args[])
    {
        int a,n1=0,n2=1,i,n3;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        System.out.print(n1+" "+n2+" ");
        for(i=2;i<a;i++)
        {
            n3=n1+n2;
            System.out.print(n3+" ");
            n1=n2;
            n2=n3;
        }
    }
}