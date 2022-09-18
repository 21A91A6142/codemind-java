import java.util.*;
class Sumof
{
    public static void main(String args[])
    {
        int a;
        double i,s=0;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        for(i=1;i<=a;i++)
        {
            s=s+(1.0/i);
        }
        System.out.printf("%.2f",s);
        sc.close();
    }
}