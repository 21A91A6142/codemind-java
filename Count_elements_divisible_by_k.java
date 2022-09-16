import java.util.*;
class Divi
{
    public static void main(String args[])
    {
        int a,b,c,s=0,i;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=0;i<a;i++)
        {
            c=sc.nextInt();
            if(c%b==0)
            {
                s=s+1;
            }
        }
        System.out.println(s);
        sc.close();
    }
}