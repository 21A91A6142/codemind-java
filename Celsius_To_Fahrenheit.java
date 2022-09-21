import java.util.*;
class Celsius
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int c;
        c=sc.nextInt();
        double f=(1.8*c)+32.0;
        System.out.printf("%.2f",f);
    }
}