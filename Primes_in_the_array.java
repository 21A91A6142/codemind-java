import java.util.*;
class primes
{
    static boolean isprime(int k)
    {
        boolean p=true;
        for(int i=2;i<=(int)Math.sqrt(k);i++)
        {
            if(k%i==0)
            {
                p=false;
                break;
            }
        }
        return p;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int c=0;
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(isprime(a[i]) && a[i]!=1)
            {
                c+=1;
            }
        }
        System.out.print(c);
        
    }
}