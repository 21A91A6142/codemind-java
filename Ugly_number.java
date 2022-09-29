import java.util.*;
class Ugly
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,c=0;
        a=sc.nextInt();
        while(a!=1)
        {
            if(a%2==0)
            {
                a=a/2;
            }
            else if(a%3==0)
            {
                a=a/3;
            }
            else if(a%5==0)
            {
                a=a/5;
            }
            else
            {
                c=c+1;
                break;
            }
        }
        if(c>0)
        {
            System.out.print("Not Ugly Number");
        }
        else
        {
            System.out.print("Ugly Number");
        }
    }
}