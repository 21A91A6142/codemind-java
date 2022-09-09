import java.util.Scanner;
class tri
{
    public static void main(String args[])
    {
        int a,b,c;
        double s,ar;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        s=(a+b+c)/2.0;
        ar=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.format("%.2f",ar);
        sc.close();
    }
}