import java.util.Scanner;
class Escape
{
    public static void main(String args[])
    {
        int n,i,k,c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            k=sc.nextInt();
            if (k%2!=0)
            {
                c=c+1;
            }
        }
        if (c<=2)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}