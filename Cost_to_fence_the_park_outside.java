import java.util.*;
class Cost
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int l,b,w,c;
        l=sc.nextInt();
        b=sc.nextInt();
        w=sc.nextInt();
        c=sc.nextInt();
        int area=2*w*(l+b+2*w);
        System.out.print(area*c);
    }
}