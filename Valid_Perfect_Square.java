import java.util.*;
class Vps
{
    public static void main(String args[])
    {
        int a,b,c=0,i,j;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        for(i=0;i<a;i++)
        {
            b=sc.nextInt();
            c=(int)Math.sqrt(b);
            if(b==c*c)
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }
        }
    }
}