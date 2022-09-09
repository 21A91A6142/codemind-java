import java.util.Scanner;
class triangle
{
    public static void main(String args[])
    {
        int a,b,c;
        double s,m;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        s=(a+b+c)/2.0;
        m=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.format("%.2f",m);
        sc.close();
    }
}