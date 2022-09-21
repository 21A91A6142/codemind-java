import java.util.*;
class Power
{
    public static void main(String args[])
    {
        int x,y,m,a;
        Scanner sc=new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        m=sc.nextInt();
        a=(int)Math.pow(x,y);
        System.out.print(a%m);
    }
}