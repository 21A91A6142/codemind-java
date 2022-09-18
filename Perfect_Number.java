import java.util.Scanner;
class Pn
{
    public static void main(String args[])
    {
        int a,s=0,i;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        for(i=1;i<=(int)a/2;i++)
        {
            if(a%i==0)
            {
                s=s+i;
            }
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