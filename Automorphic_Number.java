import java.util.*;
class Auto
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,d;
        a=sc.nextInt();
        b=a*a;
        c=(int)Math.log10(a)+1;
        d=(int)Math.pow(10,c);
        if(a==b%d)
        {
            System.out.print("Automorphic Number");
        }
        else
        {
            System.out.print("Not an Automorphic Number");
        }
    }
}