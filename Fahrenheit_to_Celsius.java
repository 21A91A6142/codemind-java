import java.util.*;
class Celsius
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int f;
        f=sc.nextInt();
        double c=(5/9.0)*(f-32);
        System.out.printf("%.2f",c);
    }
}