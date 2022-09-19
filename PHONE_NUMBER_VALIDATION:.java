import java.util.*;
class Phone
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        long a,b;
        a=sc.nextLong();
        b=(int)Math.log10(a)+1;
        if(b==10)
        {
            System.out.print("Valid");
        }
        else
        {
            System.out.print("Invalid");
        }
    }
}