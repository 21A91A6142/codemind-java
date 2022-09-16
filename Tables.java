import java.util.*;
class Table
{
    public static void main(String args[])
    {
        int a,b,i;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=1;i<=b;i++)
        {
            if(i%2!=0)
            {
                System.out.println(a+" x "+i+" = "+a*i);
            }
        }
        sc.close();
    }
}