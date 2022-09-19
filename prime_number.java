import java.util.*;
class Prime
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,i,c=0;
        a=sc.nextInt();
        for(i=1;i<=a;i++)
        {
            if(a%i==0)
            {
                c+=1;
            }
    
        }
        if(c==2)
        {
            System.out.println("prime");
        }
        else
        {
             System.out.println("not a prime");
        }
    }
}