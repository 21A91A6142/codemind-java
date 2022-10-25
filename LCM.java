import java.util.*;
class lcm
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k;
        k=(n>m)?n:m;
        //System.out.print(k);
        for(int i=1;i<k;i++)
        {
            if((k*i)%n==0 && (k*i)%m==0)
            {
                System.out.print(k*i);
                break;
            }
        }
    }
}