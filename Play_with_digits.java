import java.util.*;
class play
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            int q=a[i];
            if(q<10)
            {
                s+=a[i];
            }
            else
            {
                while(q!=0)
                {
                    int r=q%10;
                    s+=r;
                    q=q/10;
                }
            }
        }
        System.out.print(s);
        
    }
}