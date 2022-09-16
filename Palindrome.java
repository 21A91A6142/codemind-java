import java.util.*;
class Palindrome
{
    public static void main(String args[])
    {
        int a,q,r,s=0;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        q=a;
        while(q!=0)
        {
            r=q%10;
            s=s*10+r;
            q=q/10;
        }
        if(s==a)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}