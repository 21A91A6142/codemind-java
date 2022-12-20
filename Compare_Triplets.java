import java.util.*;
class compare
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[3];
        for(int i=0;i<3;i++)
        {
            a[i]=sc.nextInt();
        }
        int b[]=new int[3];
        for(int i=0;i<3;i++)
        {
            b[i]=sc.nextInt();
        }
        int c=0,d=0;
        for(int i=0;i<3;i++)
        {
            if(a[i]>b[i])
            {
                c=c+1;
            }
            else if(a[i]<b[i])
            {
                d=d+1;
            }
        }
        System.out.print(c+" "+d);
    }
}