import java.util.*;
class Cse
{
    public static void main(String args[])
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        if(a%2==0 && (a>0 || b%2==0))
        {
            System.out.print("YES");
        }
        else
        {
            System.out.print("NO");
        }
    }
}