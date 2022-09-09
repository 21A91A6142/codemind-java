import java.util.Scanner;
class Circle
{
    public static void main(String args[])
    {
        int r;
        double a;
        Scanner sc=new Scanner(System.in);
        r=sc.nextInt();
        a=3.14*r*r;
        System.out.format("%.2f",a);
    }
}